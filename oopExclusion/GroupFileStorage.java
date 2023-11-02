package oopExclusion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class GroupFileStorage {
	String defaulPath = "D:\\eclips\\HomeWorkTask1\\src\\oopExclusion/";
	
	public GroupFileStorage() {
	}
	
	public void saveGroupToCSV(Group gr) {
		File groupPath = new File(defaulPath + gr.getGroupName() + ".csv");
		Student[] st = gr.getStudents();
		StringConvertCSV scc = new ConvertCSVString();
		try (Writer wrt = new FileWriter(groupPath)) {

				for (Student student : st) {
					if (student != null) {
						student.setGroupName(gr.getGroupName());
						wrt.write(scc.convertStudentToString(student) + "\n");
					}
				}
			
		} catch (IOException e) {
			System.out.println("Error" + e);
			throw new RuntimeException(e);
		}
	}
	
	public Group loadGroupFromCSV(File file) throws GroupOverflowException {
		
		StringConvertCSV csvStringConverter = new ConvertCSVString();
	    
	    String filename = file.getName();
	    
	    String[] groupName = filename.split("\\.");
	    
	    Group group = new Group(groupName[0]);
	    
	    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	        String line = reader.readLine();
	        while (line != null) {

	            group.addStudent(csvStringConverter.convertStringToStudent(line));
	            line = reader.readLine();
	        }
	    } catch (FileNotFoundException e) {
	        throw new RuntimeException(e);
	    } catch (IOException e) {
	        throw new RuntimeException(e);
	    }
	    

	    return group;
		
	} 
	
	public File findFileByGroupName(String groupName, File workFolder) {
        String targetGroupName = groupName;

        if (workFolder.exists() && workFolder.isDirectory()) {
            File[] listOfFiles = workFolder.listFiles();    

            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().startsWith(targetGroupName) ) {
                    System.out.println("Знайдено файл: " + file.getName());
                }
            }
        } else {
            System.out.println("Робоча директорія не існує або не є директорією.");
        }
        return workFolder;
	}
	
}
