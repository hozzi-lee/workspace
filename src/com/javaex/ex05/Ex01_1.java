package com.javaex.ex05;

public class Ex01_1 {

	public static void main(String[] args) {

		/*
//		int[] intArray = new int[6]; --> 추천하지 않음
		int[] intArray = new int[] { (int)( (Math.random() * 45) + 1 ), (int)( (Math.random() * 45) + 1 ), (int)( (Math.random() * 45) + 1 ), (int)( (Math.random() * 45) + 1 ), (int)( (Math.random() * 45) + 1 ), (int)( (Math.random() * 45) + 1 ) };
//		int[] intArray = { (int)( (Math.random() * 45) + 1 ) }; --> 더 간단하게 표현
		int i;

		for ( i = 0; i < intArray.length; i++ ) {
			System.out.println(intArray[i]);
		}
		 */

		int[] intArray = new int[6];
		int i;
		
		for ( i = 0; i < intArray.length; i++ ) {
			intArray[i] = (int)( (Math.random() * 45) + 1 );
			System.out.print(intArray[i] + "   ");
		}

	}

}
