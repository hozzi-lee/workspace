package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		// 콘솔입력과 출력 예제 - 2
		Scanner sc = new Scanner(System.in); // import 불러오기 == ctrl + shift + O 또는 sc.close();
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름: ");
		
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이: ");
		
		int age = sc.nextInt();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다");
		
		
		sc.close();
		
	}

}
