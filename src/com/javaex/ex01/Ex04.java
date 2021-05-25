package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {
		
		// 기본사용방법
		/*
		char ch01 = 'A';
		char ch02 = '안';
		System.out.println(ch01);
		System.out.println(ch02);
		*/
		
		
		
		// 숫자로 대입이 된다.(int와 헷갈릴 수 있다) -> 2진수 문자표
		char ch03 = 54620;
		System.out.println(ch03);
		
		char ch04 = 65; // 정수 65 대입하려 했으나 자료형은 char선언한 경우.
		System.out.println(ch04);
		
		
		// 문자형 -> 1글자, 문자열 -> 1글자 이상
		char ch05 = '황';
		String ch06 = "안녕하세요";
		String ch07 = "이";
		
		
//		String ch11 = new String("안녕하세요");
		
		
		System.out.println(ch05);
		System.out.println(ch06);
		System.out.println(ch07);
		
//		System.out.println(ch11);
		
//		 수업 질문 - 주형준씨
//		 char a = 'Y';
//		 char b = 'N';
//		 
//		 boolean isEnrolled = a>b;
//		 System.out.println(isEnrolled);

	}

}
