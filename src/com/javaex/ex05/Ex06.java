package com.javaex.ex05;

public class Ex06 {
	public static void main(String[] args) {

		int[] intArray = new int[3];
		int i;

		intArray[0] = 11;
		intArray[1] = 3;
		//		intArray[2] = 78; --> 값을 넣지 않은경우 정수형은 0(기본값)을 출력 // double, boolean, char의 기본값 알아보기

		System.out.println("=====================================");
		System.out.println(intArray.length);
		System.out.println("=====================================");

		for ( i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("=====================================");

		// ArrayIndexOutOfBoundsException --> 없는 방을 사용 하려고 할 때
		for ( i = 0; i <= intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
