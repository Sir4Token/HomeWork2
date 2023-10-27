package oopExclusion;

public class Student extends Human {
	
	private  int id; // Номер заліковки
	private String groupName; // Назва групи
	
	public Student(String name, String lastName, Gender gender, int id, String groupName) {
		super(name, lastName, gender);
		this.id = id;
		this.groupName = groupName;
	}

	public Student(String name, String lastName, Gender gender) {
		super(name, lastName, gender);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		int i = 0;
		return "\nStudent\n [Name = " + getName() + " lastName = " + getLastName() + "; Gender = " + getGender() + "\n id = " + id + ", groupName = " + groupName + "]";
	}
	
	
	
	

}
