package com.javaex.ex04;

public class Ex10 {
	public static void main(String[] args) {

		int i;

		System.out.println("==continue======================================");
		
		for ( i = 1; i < 21; i++ ) { // 1~20까지 반복
			if ( i % 2 == 0 || i % 3 == 0 ) { // 2의배수 또는 3의배수
				continue; // 조건에 맞는 숫자(2의배수와 3의배수)는 출력하지 않고 반복문으로 올라간다
			}
			System.out.println(i);
		}

		System.out.println("==if~else======================================");

		for ( i = 1; i < 21; i++ ) {

			if ( i % 2 == 0 || i % 3 == 0 ) {
				// 아무것도 안한다
			} else {
				System.out.println(i);
			}
		}

		System.out.println("==if======================================");

		for ( i = 1; i < 21; i++ ) {
			if ( !(i % 2 == 0 || i % 3 == 0) ) {
				System.out.println(i);
			}
		}
	}

}
