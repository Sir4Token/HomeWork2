package oopMultiThreaded2Task3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {
    public static void main(String[] args) {
    	String inputfileName;
    	String source;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Напишіть на якому диску шукати файл, приклад(D:\\): ");
    	source = sc.nextLine();
        ArrayList<File> fileList = new ArrayList<>();
        System.out.println("Напишіть який файл ви шукаєте разом з закінченням, приклад(Lesson7.pdf): ");
        inputfileName = sc.nextLine();
        searchFiles(new File(source), fileList, inputfileName);
        for (File file : fileList) {
            System.out.println(file.getAbsolutePath());
        }
    }

    private static void searchFiles(File rootFile, List<File> fileList, String fileName) {
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                ExecutorService executor = Executors.newFixedThreadPool(4);

                List<Future<?>> futures = new ArrayList<>();

                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        Future<?> future = executor.submit(() -> {
                            searchFiles(file, fileList, fileName);
                        });
                        futures.add(future);
                    } else {

                        if (file.getName().toLowerCase().endsWith(fileName)) {
                            fileList.add(file);
                        }
                    }
                }

                for (Future<?> future : futures) {
                    try {
                        future.get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                executor.shutdown();
            }
        }
    }
}

