package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {

		// 일반적인 방식
		double pi = 3.14;
		double result01 = 5 * 5 * pi;
		System.out.println(result01);
		
		// pi는 항상 3.14로 사용되어야 한다. -> 변경되었음
		pi = 3.14159265;
		double result02 = 5 * 5 * pi;
		System.out.println(result02);
		
		// 상수로 정의한 경우
		final double PI = 3.14;
		double result03 = 5*5*PI;
		System.out.println(result03);
		
		// 상수로 정의한 경우 -> 변경하면 오류
		/*
		PI = 3.1415926;
		double result04 = 5*5*PI;
		System.out.println(result04);
		*/		
		
		
		/* 개인연습
		double math01 = 5 * (Math.PI); = // double math01 = 5 * Math.PI;
		System.out.println(math01);
		
		double pi = 3.1415;
		double result01 = 5 * 5 * pi;
		System.out.println(result11);
		
		pi = 3.14159265;
		double result02 = 5 * 5 * pi;
		System.out.println(result12);
		
		boolean result13 = result11==result12;
		System.out.println(result13);
		*/

	}

}
