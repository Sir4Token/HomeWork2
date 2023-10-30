package oopExclusion;

import java.util.Scanner;

public class ConvertCSVString implements StringConvertCSV {
    
    public String convertStudentToString(Student student) {
        return student.getName() + "," + student.getLastName() + "," + student.getGender().toString() + "," + student.getId() + "," + student.getGroupName();
    }

    public Student convertStringToStudentn(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useDelimiter(",");
        String name = scanner.next();
        String lastName = scanner.next();
        Gender gender = Gender.valueOf(scanner.next());
        int id = Integer.valueOf(scanner.next());
        String group = scanner.next();

        return new Student(name, lastName, gender, id, group);
    }

	public Student convertStringToStudent(String str) {
		return null;
	}
}