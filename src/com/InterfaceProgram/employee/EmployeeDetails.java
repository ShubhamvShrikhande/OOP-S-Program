package com.InterfaceProgram.employee;

public class EmployeeDetails implements Employee, Employer {

	@Override
	public String employeeDetail(String firstName, String lastName, String city, String address) {
		System.out.println("Employee FirstName is : " + firstName);
		System.out.println("Employee LastName is : " + lastName);
		System.out.println("Employee city is : " + city);
		System.out.println("Employee address is : " + address);

		return null;
	}

	@Override
	public int empInforamtion(int id) {
		System.out.println("Employee id is : " + id);

		return 0;
	}

	@Override
	public float empInforamtion(float salary) {
		System.out.println("Employee salary is : " + salary);

		return 0;
	}

	@Override
	public long empInforamtion(long phoneNumber) {
		System.out.println("Employee phone Number is : " + phoneNumber);

		return 0;
	}

}
