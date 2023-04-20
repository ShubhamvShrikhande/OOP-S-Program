package com.abstracts.Multiply;

public class Demo extends Multiply {
	public int multiplyTwo(int num1, int num2) {
		return num1 * num2;
	}

	public int multiplyThree(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}

	public static void main(String args[]) {
		Multiply m = new Demo();
		System.out.println(m.multiplyTwo(4, 6));
		System.out.println(m.multiplyThree(3, 5, 7));

	}

}
