package com.encapsulation.program;

import java.util.Scanner;

public class StudnetDetails {
	public static void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**** Wlcome to my Program****");

		System.out.println("Enter the Student id");
		int id = scanner.nextInt();

		System.out.println("Enter the Student FirstName");
		String firstName = scanner.next();

		System.out.println("Enter the Student lastName");
		String lastName = scanner.next();

		System.out.println("Enter the Student School Name");
		String schoolName = scanner.next();

		System.out.println("Enter the Student Address");
		String address = scanner.next();

		System.out.println("Enter the Student city");
		String city = scanner.next();

		Student st = new Student();
		st.setId(id);
		st.setFirstname(firstName);
		st.setLastname(lastName);
		st.setSchoolName(schoolName);
		st.setAddress(address);
		st.setCity(city);

		System.out.println("student id : " + st.getId());
		System.out.println("Student FirstName : " + st.getFirstname());
		System.out.println("Student Lastname: " + st.getLastname());
		System.out.println("Student school Name : " + st.getSchoolName());
		System.out.println("Student address : " + st.getAddress());
		System.out.println("Student city : " + st.getCity());
	}

	public static void main(String[] args) {
		getUserInput();
	}

}
