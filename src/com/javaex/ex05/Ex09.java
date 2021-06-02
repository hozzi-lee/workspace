package com.javaex.ex05;

public class Ex09 {
	public static void main(String[] args) {

		// 배열 같음 판단

		// int[] arrA = { 10, 20, 30 };
		// int[] arrA = new int[] { 10, 20, 30 };
		int[] arrA = new int[3];
		arrA[0] = 50;
		arrA[1] = 20;
		arrA[2] = 70;
//		arrA[3] = 40;

		// int[] arrB = { 10, 20, 30 };
		// int[] arrB = new int[] { 10, 20, 30 };
		int[] arrB = new int[3];
		arrB[0] = 10;
		arrB[1] = 70;
		arrB[2] = 30;
//		arrB[3] = 50;

		// 배열A, 배열B 같은지 판단 --> 배열의 개수, 값, 순서가 같아야 한다.

		if ( arrA.length == arrB.length ) { // 배열의 개수가 같다면
			// 첫번째 값부터 비교
			for ( int i = 0; i < ((arrA.length > arrB.length) ? arrA.length : arrB.length); i++ ) {
				if ( arrA[i] != arrB[i] ) {
					System.out.println((i + 1) + "번째 값이 다릅니다.");
				}
			}
		} else {
			System.out.println("배열의 크기가 다릅니다.");
		}




	}

}
