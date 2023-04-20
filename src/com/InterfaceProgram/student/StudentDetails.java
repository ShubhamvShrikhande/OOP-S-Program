package com.InterfaceProgram.student;

import java.util.Scanner;

public class StudentDetails implements Student {

	@Override
	public int studInformation(int id, int rollNumber) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Student  id is :" + id);
		System.out.println("Student rollNumber is : " + rollNumber);

		return 0;
	}

	@Override
	public String studDetails(String firstName, String lastName, String clgName) {
		System.out.println("Student firstName is : " + firstName);
		System.out.println("Student lastName is : " + lastName);
		System.out.println("Student collageName is : " + clgName);

		return null;
	}

}
