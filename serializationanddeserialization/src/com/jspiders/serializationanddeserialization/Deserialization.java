package com.jspiders.serializationanddeserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("Student.txt");
		if (file.exists()) {
			FileInputStream fileinputstream = new FileInputStream(file);
			ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
			Student student = (Student) objectinputstream.readObject();
			System.out.println(student);
			fileinputstream.close();
			objectinputstream.close();
		} else {
			file.createNewFile();
			FileInputStream fileinputstream = new FileInputStream(file);
			ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
			Student student = (Student) objectinputstream.readObject();
			System.out.println(student);
			fileinputstream.close();
			objectinputstream.close();
			}
	}

}
