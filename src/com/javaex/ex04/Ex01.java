package com.javaex.ex04;

public class Ex01 {
	public static void main(String[] args) {


		int i = 0; // (초기화)

		while ( i < 5 ) { // 0 < 5(T), 1 < 5(T), 2 < 5(T), 3 < 5(T), 4 < 5(T), 5 < 5(F) 중지 --> while(반복조건)
			System.out.println("I Like java" + (i + 1));
			i++; // 또는 i = i + 1; --> 증감식(탈출조건)
		} // --> while은 (초기화)(반복조건)(탈출조건) 필수!!

		/*
		int num = 0;
		while ( i < 5 ) { // 0 < 5(T), 1 < 5(T), 2 < 5(T), 3 < 5(T), 4 < 5(T), 5 < 5(F) 중지 --> while(반복조건)
			System.out.println("I Like java" + num);
			i++; // 또는 i = i + 1; --> 증감식(탈출조건)
			num++;
		}
		 */



	}

}
