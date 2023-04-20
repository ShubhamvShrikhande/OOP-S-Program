package com.polymorphism.overrides;

public class ParentClass {
	//static method can`t override
	static void m3() {
		System.out.println("from parent to : static method");
	}
	private void m1() {
		System.out.println("form private parent method");
	}
	protected void m2() {
		System.out.println("from parent m2()");
	}

}
