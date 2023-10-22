package oopExclusion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
        Student student1 = new Student("Mark", "Lancent", Gender.Men, 15978, "A2/2");
        Student student2 = new Student("Anton", "Kronievich", Gender.Men, 49637, "A2/2");
        Student student3 = new Student("Anna", "Lukivna", Gender.Women, 87319, "A2/2");
        Student student4 = new Student("Stas", "Sirobin", Gender.Men, 17459, "A2/2");
        Student student5 = new Student("Max", "Kalush", Gender.Men, 13572, "A2/2");
        Student student6 = new Student("Kostya", "Iraditov", Gender.Men, 19875, "A2/2");
        Student student7 = new Student("Greed", "Jarvis", Gender.Men, 27954, "A2/2");
        Student student8 = new Student("Lich", "Drinov", Gender.Men, 34511, "A2/2");
        Student student9 = new Student("Jack", "Radinko", Gender.Men, 11479, "A2/2");
        Student student10 = new Student("Mephisto", "Kroneno", Gender.Men, 19852, "A2/2");
        Student student11 = new Student("Katya", "Thaytheva", Gender.Women, 84268, "A2/2");
        
        System.out.println(student1);
        
        System.out.println();
        
        Group group1 = new Group("A2/2");
        
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
        
        System.out.println();
        System.out.println("The student has been deleted" + group1.removeStundentById(17459));
        System.out.println();
        
        try {
        	System.out.println("Print lastName student: ");
        	Student searchStudent = group1.searchStudentByLastName(sc.nextLine());
        	System.out.println(searchStudent);
		} catch (StudentNotFoundException e) {
			System.out.println("This student not found");
		}
        
	}

}
