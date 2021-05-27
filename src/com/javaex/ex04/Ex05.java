package com.javaex.ex04;

public class Ex05 {
	public static void main(String[] args) {

		int dan;
		int i;

		for ( dan = 2; dan < 10; dan++ ) {

			for (i = 1; i < 10; i++ ) {

				int danXi = dan * i;

				System.out.println(dan + " * " + i + " = " + danXi );
			}
		}

	}

}
