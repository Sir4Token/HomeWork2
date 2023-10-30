package oopExclusion;

import java.io.BufferedReader;
import java.io.File;
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
	
	public Group loadGroupFromCSV(File file) {
		System.out.println("");
		BufferedReader br = null;
		Group orden = new Group();
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			System.out.println("Error" + e);
		}
		return orden;
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
