package oopExclusion;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
        Student student1 = new Student("Mark", "Lancent", Gender.Men, 15978, "Orden");
        Student student2 = new Student("Anton", "Kronievich", Gender.Men, 49637, "Orden");
        Student student3 = new Student("Anna", "Lukivna", Gender.Women, 87319, "Orden");
        Student student4 = new Student("Stas", "Sirobin", Gender.Men, 17459, "Orden");
        Student student5 = new Student("Max", "Kalush", Gender.Men, 13572, "Orden");
        Student student6 = new Student("Kostya", "Iraditov", Gender.Men, 19875, "Orden");
        Student student7 = new Student("Greed", "Jarvis", Gender.Men, 27954, "Orden");
        Student student8 = new Student("Lich", "Drinov", Gender.Men, 34511, "Orden");
        Student student9 = new Student("Jack", "Radinko", Gender.Men, 11479, "Orden");
        Student student10 = new Student("Mephisto", "Kroneno", Gender.Men, 19852, "Orden");
        Student student11 = new Student("Katya", "Thaytheva", Gender.Women, 84268, "Orden");
        
        
        System.out.println();
        
        Group group1 = new Group("Orden");
        
        try {
			group1.addStudent(student1);
			group1.addStudent(student2);
			group1.addStudent(student3);
			group1.addStudent(student4);
			group1.addStudent(student5);
			group1.addStudent(student6);
			group1.addStudent(student7);
			group1.addStudent(student8);
			group1.addStudent(student9);
			group1.addStudent(student10);
			group1.addStudent(student11);
			
		} catch (GroupOverflowException e) {
			System.out.println("Full Group");
		}
        
        System.out.println(group1);
        
//        System.out.println("The student has been deleted" + " " + group1.removeStundentById(34511));
        
        
//        try {
//        	Student searchStudent = group1.searchStudentByLastName("Jarvis");
//        	System.out.println(searchStudent);
//		} catch (StudentNotFoundException e) {
//			System.out.println("This student not found");
//		}
        
//        AddStudentKeyboard createStudents = new AddStudentKeyboard();
//        createStudents.createStudentKeyboard(group1);
        
//        group1.sortStudents();
        
        GroupFileStorage groupFile = new GroupFileStorage();
        groupFile.saveGroupToCSV(group1);
        
        File orden = new File("D:\\eclips\\HomeWorkTask1\\src\\oopExclusion/" + group1.getGroupName() + ".csv");
        try {
			
			System.out.println(groupFile.loadGroupFromCSV(orden));
		} catch (GroupOverflowException e) {
			
			e.printStackTrace();
		}
        
//        File workFolder = new File("D:\\eclips\\HomeWorkTask1\\src\\oopExclusion");
//        groupFile.findFileByGroupName(group1.getGroupName(), workFolder);
        
        
        
	}

}
