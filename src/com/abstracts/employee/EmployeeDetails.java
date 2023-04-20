package com.abstracts.employee;

public class EmployeeDetails extends Employee {

	public int employeeInformation(int id, int salary) {
		System.out.println("Employee id is : " + id);
		System.out.println("Employee salary is : " + salary);

		return 0;
	}

	public String employeeDetails(String firstName, String lastName) {
		System.out.println("Employee firstName is : " + firstName);
		System.out.println("Employee lastName is : " + lastName);

		return null;
	}

}
