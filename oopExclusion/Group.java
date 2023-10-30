package oopExclusion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Group {
	private String groupName;
	private final Student[] students = new Student[10];
	
	

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}
	
	public Group() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudents() {
		return students;
	}

	
	public void addStudent(Student student) throws GroupOverflowException{
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = student;
				return;
			}
		}
		throw new GroupOverflowException();
	}
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for (int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				if (students[i].getLastName().equals(lastName)) {
					return students[i];
				}
			}
		}
		throw new StudentNotFoundException();
	}
	
	public boolean removeStundentById(int id) {
		for (int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				if(students[i].getId() == id) {
					students[i] = null;
					return true;
					
				}
			}
		}
		return false;
		
	}
	
	public void sortStudents() {
		System.out.println();
		System.out.println("Sort Group for Last Name");
		Arrays.sort(students, Comparator.nullsFirst(new sortStudentsByLastName()));

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

	@Override
	public String toString() {
		return "Group \n groupName = " + groupName + "\n"  + Arrays.toString(students);
	}
	
	
	

}
