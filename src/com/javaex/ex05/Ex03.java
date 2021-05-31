package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {

		// 방개수를 초과하는 갯수 출력시 오류 발생
		
		int[] no = new int[6]; // int[개수]
		int i;

		for ( i = 0; i < 6; i++ ) {
			no[i] = (int)(Math.random() * 45) + 1;
		}
		
		for ( i = 0; i < 6; i++ ) { // i < 6 --> i <= 6 (6번방이 없으므로 오류 발생)
			System.out.println(no[i]);
		}


	}

}
