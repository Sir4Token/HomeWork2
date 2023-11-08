package oopMultiThreaded2Task2;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    	
//    	File file = new File("oopLesson7.txt");
//    	try {
//			file.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
    	
        String sourcePath = "Основы_ООПМногопоточное_программирование_II.pdf";
        String destinationPath = "Lesson7.pdf";
        int bufferSize = 1024;

        FileCopyWithProgress fileCopy = new FileCopyWithProgress(sourcePath, destinationPath, bufferSize);

        try {
            fileCopy.copy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
