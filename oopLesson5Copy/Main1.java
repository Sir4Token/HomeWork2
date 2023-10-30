package oopLesson5Copy;

import java.util.Scanner;

public class Main1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);	
		CopyFile file1 = new CopyFile();
		System.out.println("Print link input file: ");
		file1.setInputLinkFile(sc.nextLine());
		System.out.println("Print link output file: ");
		file1.setOutLinkFile(sc.nextLine());
		
		file1.copyFileDirectory();
		
		
	}

}
