package oopExclusion;

import java.util.Scanner;

public class AddStudentKeyboard {
	 public AddStudentKeyboard() {
		 super();
	    }
	 
	 public void createStudentKeyboard (Group group1) {
		 System.out.println();
		 Scanner sc = new Scanner(System.in);
		 Student createStudent = new Student(null, null, null, 0, group1.getGroupName());
		 
		 System.out.print("Print FirstName: ");
		 createStudent.setName(sc.nextLine());
		 
		 System.out.print("Print LastName: ");
		 createStudent.setLastName(sc.nextLine());
		 
		 System.out.print("Print Gender(Men/Women): ");
		 createStudent.setGender(Gender.valueOf(sc.nextLine()));
		 
		 System.out.print("Print Id: ");
		 createStudent.setId(sc.nextInt());
		 
		 
		 try {
			group1.addStudent(createStudent);
			
		} catch (GroupOverflowException e) {
			System.out.println("Group it`s full");
		}
	 }

}
