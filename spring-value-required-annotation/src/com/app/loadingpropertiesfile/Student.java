package com.app.loadingpropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.studentName}")
	private String studentName;

	@Value("${student.intrestedCource}")
	private String intrestedCource;

	@Value("${student.hobby}")
	private String hobby;

	public void display() {

		System.out.println("Student Name: " + studentName);
		System.out.println("Student Inrested Course: " + intrestedCource);
		System.out.println("Student Hobby: " + hobby);
	}

}
