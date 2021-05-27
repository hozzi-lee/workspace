package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dan;
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		dan = sc.nextInt();

		for ( int i = 1; i <= 9; i++ ) { //초기화 // 반복조건 // 증감식
			int danXi = dan * i;
			System.out.println(dan + " * " + i + " = " + danXi);
		}
		sc.close();
	}

}
