package com.polymorphism.overrides;

public class ParentMain {
	public static void main(String[] args) {
		ParentClass parent = new ParentClass();
		// parent.m1();--->>>> static method
		parent.m2();
		parent.m3();

		ParentClass p = new Child();
		// p.m1();----->>> private method
		p.m2();
		p.m3();

		Child c = new Child();
		c.m2();
		c.m3();

	}

}
