package oopLesson5Copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	private String inputLinkFile;
	private String outLinkFile;
	
	public CopyFile(String inputLinkFile, String outLinkFile) {
		super();
		this.inputLinkFile = inputLinkFile;
		this.outLinkFile = outLinkFile;
	}

	public CopyFile() {
		super();
	}

	public String getInputLinkFile() {
		return inputLinkFile;
	}

	public void setInputLinkFile(String inputLinkFile) {
		this.inputLinkFile = inputLinkFile;
	}

	public String getOutLinkFile() {
		return outLinkFile;
	}

	public void setOutLinkFile(String outLinkFile) {
		this.outLinkFile = outLinkFile;
	}
	
	public void copyFileDirectory() {
		String fileFormat = ".docx";
		File sourceDir = new File(getInputLinkFile());
		File targetDir = new File(getOutLinkFile());
		
		if (sourceDir.exists() && sourceDir.isDirectory()) {
			File[] files = sourceDir.listFiles();
			for (File file : files) {
				if (file.isFile() && file.getName().endsWith(fileFormat)) {
					try {
						FileInputStream fis = new FileInputStream(file);
						File targetFile = new File(targetDir, file.getName());
						FileOutputStream fos = new FileOutputStream(targetFile);
						byte[] buffer = new byte[1024];
						int bytesRead;
						while ((bytesRead = fis.read(buffer)) != -1) {
							fos.write(buffer, 0, bytesRead);
						}
						
						
					} catch (IOException e) {
						e.printStackTrace();
						System.out.println("File not copy");
					}
				}
			}
			System.out.println("Copying is complete");
		} else {
			System.out.println("The input directory does not exist or is not a directory.");
		}
	}

	@Override
	public String toString() {
		return "CopyFile ";
	}
	
	
	
	

}
