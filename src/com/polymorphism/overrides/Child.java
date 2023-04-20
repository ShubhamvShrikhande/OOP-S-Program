package com.polymorphism.overrides;

public class Child extends ParentClass {
	static void m3() {
		System.out.println("from child : static method");
	}

	private void m1() {          //private method not override
		System.out.println("from child private method");
	}

	public void m2() {
		System.out.println("from child m2");
	}

}
