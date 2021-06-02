package com.javaex.ex05;

public class Ex07 {
	public static void main(String[] args) {

		// int numA = 3;
		// int numB = numA;
		// 위의 경우와 비교해보기		


		//		int[] arrA = { 3, 6, 9 };

		//		int[] arrA = new int[]{ 3, 6, 9 };

		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;

		for ( int i = 0; i < arrA.length; i++ ) {
			System.out.println(arrA[i]);
		}

		System.out.println("--------------------------");

		int[] arrB = arrA;

		for ( int i = 0; i < arrB.length; i++ ) {
			System.out.println(arrB[i]);
		}

		System.out.println("==================================================");

		// arrA[1] = 100 --> arrA의 두번째 값을 6에서 100으로 바꿧을 때
		// arrA[1] 변경확인 arraB[1] 동일하게 변경확인

		arrA[1] = 100;
		for ( int i = 0; i < arrA.length; i++ ) {
			System.out.println(arrA[i]);
		}

		System.out.println("--------------------------");

		for ( int i = 0; i < arrB.length; i++ ) {
			System.out.println(arrB[i]);
		}

	}

}
