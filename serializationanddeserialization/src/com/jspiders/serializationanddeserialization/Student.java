package com.jspiders.serializationanddeserialization;

import java.io.Serializable;

public class Student implements Serializable{
	
	public static final long serialVersionUID = 1l;
	private String name;
	private int id;
	private String email;
	private int age;
	
	public Student(String name, int id, String email, int age) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", email=" + email + ", age=" + age + "]";
	}
	
	
	

}
