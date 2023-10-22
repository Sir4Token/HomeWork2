package oopExclusion;

import java.util.Arrays;
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

	@Override
	public String toString() {
		return "Group \n groupName = " + groupName + "\n"  + Arrays.toString(students);
	}
	
	
	

}
