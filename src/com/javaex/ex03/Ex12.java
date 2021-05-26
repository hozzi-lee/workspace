package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하세요");

		int month = sc.nextInt();

		// 1 3 5 7 8 10 12 --> 31일
		// 4 6 9 11 --> 30일
		// 2 --> 28일
		// default --> 없습니다
		
		// ==========================
		
		// 4 6 9 11 --> 30일
		// 2 --> 28일
		// default --> 31일
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(""+month+"월은 31일까지 있습니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(""+month+"월은 30일까지 있습니다.");
				break;
			case 2:
				System.out.println("2월은 28일까지 있습니다.");
				break;
			default:
				System.out.println(""+month+"월은 존재하지 않습니다. 1년은 1월 ~ 12월까지 있습니다.");
				break;
		}
		//break; 없는 switch-case조건문은 권장하지 않음

		sc.close();
	}
}
