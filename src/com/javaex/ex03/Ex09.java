package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요\n(1. 자바    2. C    3. C++    4. 파이썬)");
		System.out.print("과목번호: ");
		
		// 기본 자료형 8가지 == 사용 가능
		// String은 == 사용 불가
		// Switch-case는 String사용가능 
		int code = sc.nextInt();
		
		if (code == 1) {
			System.out.println("R101호");
		} else if (code == 2) {
			System.out.println("R202호");
		} else if (code == 3) {
			System.out.println("R303호");
		} else if (code == 4) {
			System.out.println("R404호");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}
		
		/* 문자로 적용 하고 싶으면 Char형 사용
		
		String code = sc.nextLine();
		
		if (code == "A") {
			System.out.println("R101호");
		} else if (code == "B") {
			System.out.println("R202호");
		} else if (code == "C") {
			System.out.println("R303호");
		} else if (code == "D") {
			System.out.println("R404호");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}
		
		*/
		
		sc.close();
		
	}

}
