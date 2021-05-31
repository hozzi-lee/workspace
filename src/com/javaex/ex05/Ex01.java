package com.javaex.ex05;

public class Ex01 {
	public static void main(String[] args) {

		int lotto1;
		int lotto2;
		int lotto3;
		int lotto4;
		int lotto5;
		int lotto6;
		
		lotto1 = (int)(Math.random() * 45) + 1;
		lotto2 = (int)(Math.random() * 45) + 1;
		lotto3 = (int)(Math.random() * 45) + 1;
		lotto4 = (int)(Math.random() * 45) + 1;
		lotto5 = (int)(Math.random() * 45) + 1;
		lotto6 = (int)(Math.random() * 45) + 1;


		/*
		System.out.print(lotto1 + "   ");
		System.out.print(lotto2 + "   ");
		System.out.print(lotto3 + "   ");
		System.out.print(lotto4 + "   ");
		System.out.print(lotto5 + "   ");
		System.out.println(lotto6);
		 */

		/*
		int i;
		for ( i = 1; i < 7; i++ ) {
			System.out.print(lotto + i); --> 변수명을 조합할 수 없다.
			System.out.print("lotto" + i);		
		}
		 */
	}

}
