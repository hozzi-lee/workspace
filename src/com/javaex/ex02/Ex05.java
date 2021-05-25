package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // import 불러오기 == ctrl + shift + O 또는 sc.close();
		
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이: ");
		int age = sc.nextInt(); // 3 입력, 엔터 남아있음
		
		// 숫자 뒤에 문자가 올 경우에만 발생하는 오류
		sc.nextLine(); // 엔터 오류 해결방안 --> 개행 문자 사용
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름: ");
		String name = sc.nextLine(); // 엔터 오류 해결 입력 안하면 nextInt에 남아있던 엔터가 입력됨
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다");
		
		sc.close();
	}

}
