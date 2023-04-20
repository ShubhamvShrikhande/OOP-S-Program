package com.polymorphism.overloading;

public class Method {
	public void area(double radius) {
		System.out.println("area of circle :" + 3.4 * radius * radius);
	}

	public void area(int length, int width) {
		System.out.println("area of rectangle : " + length * width);
	}

	public void area(int length) {
		System.out.println("area of square : " + 2 * length);
	}

	public static void main(String[] args) {
		Method m = new Method();
		m.area(2, 4);
		m.area(12);
		m.area(3, 4);
	}

}
