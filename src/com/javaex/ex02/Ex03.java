package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		// 콘솔입력과 출력 예제
		Scanner sc = new Scanner(System.in); // new == 메모리에 올려줘!
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름: ");
		
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 "+name+" 입니다");
		
		sc.close();		

	}

}
