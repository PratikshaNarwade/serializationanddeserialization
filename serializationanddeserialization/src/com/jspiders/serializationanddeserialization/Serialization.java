package com.jspiders.serializationanddeserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	

	public static void main(String[] args) throws IOException {
		
		File file = new File("Student.txt");
		if(file.exists()) {
			FileOutputStream fileoutputstream = new FileOutputStream(file);
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream); 
			objectoutputstream.writeObject(new Student("Pratiksha",1001,"pratiksha21@gmail.com",22));
			System.out.println("Data Written to the File");
			fileoutputstream.close();
			objectoutputstream.close();
		}else {
			file.createNewFile();
			FileOutputStream fileoutputstream = new FileOutputStream(file);
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream); 
			objectoutputstream.writeObject(new Student("Pratiksha",1001,"pratiksha21@gmail.com",22));
			System.out.println("Data Written to the File");
			fileoutputstream.close();
			objectoutputstream.close();
		}
	}

}
