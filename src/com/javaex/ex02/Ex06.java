package com.javaex.ex02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // import 불러오기 == ctrl + shift + O 또는 sc.close();
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.println("키를 입력해 주세요");
		System.out.print("키: ");
		// double tall = sc.nextFloat(); // 8byte 안에 4byte
		// float tall = sc.nextDouble(); // 4byte 안에 8byte == 안됨
		double tall = sc.nextDouble();
		
		System.out.println("당신의 이름은 "+name+", 나이는 "+age+"세, 키는 "+tall+"cm 입니다");

		sc.close();
	}

}
