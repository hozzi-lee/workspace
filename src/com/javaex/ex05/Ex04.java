package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {

		// 방개수 변경될때 for문에서 개수 부분을 변경 해줘야 함

		int[] no = new int[8]; // 개수 6 --> 8
		int i;

		for ( i = 0; i < no.length; i++ ) {
			no[i] = (int)(Math.random() * 45) + 1;
		}
		
		System.out.println(no.length);
		System.out.println("=====================================");

		for ( i = 0; i < no.length; i++ ) {
			System.out.println(no[i]);
		}

		System.out.println("=====================================");

		for ( i = 0; i < no.length; i++ ) { // 개수 보다 작은 수를 설정 할 경우 오류가 나지 않음
			System.out.println(no[i]);
		}

	}

}
