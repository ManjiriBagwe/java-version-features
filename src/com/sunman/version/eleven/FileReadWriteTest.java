package com.sunman.version.eleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteTest {

	public FileReadWriteTest() {

		/* Read File */
		Path path = Paths.get("./resources/sample.txt");
		String fileContent = "Default Text";
		try {
			fileContent = Files.readString(path);
			System.out.println("fileContent : "+fileContent);
		} catch (IOException e) {
			System.out.println("Error Message : "+e.getMessage());
			e.printStackTrace();
		}
		
		
		/* Write to another file. Can change the content of the file.*/
		String newFileContent = fileContent.replace("line", "Lines");
		
		Path newPath = Paths.get("./resources/sample-new.txt");
		try {
			Files.writeString(newPath, newFileContent);
		} catch (IOException e) {
			System.out.println("Error Message : "+e.getMessage());
			e.printStackTrace();
		}
	}

}
