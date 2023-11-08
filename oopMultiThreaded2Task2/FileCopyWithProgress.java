package oopMultiThreaded2Task2;

import java.io.*;
import java.util.Arrays;

public class FileCopyWithProgress {
    private String sourcePath;
    private String destinationPath;
    private int bufferSize;

    public FileCopyWithProgress(String sourcePath, String destinationPath, int bufferSize) {
        this.sourcePath = sourcePath;
        this.destinationPath = destinationPath;
        this.bufferSize = bufferSize;
    }

    public void copy() throws IOException {
        File sourceFile = new File(sourcePath);
        long totalSize = sourceFile.length();
        long copiedSize = 0;

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(destinationPath)) {
            byte[] buffer = new byte[bufferSize];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                copiedSize += bytesRead;
                double progress = (double) copiedSize / totalSize * 100;
                System.out.printf("\rProgress: %.2f%%", progress);
            }

            System.out.println("\nFile copied successfully.");
        }
    }
}
