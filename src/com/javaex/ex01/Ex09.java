package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		// 관계 연산자 --> 결과는 true or false --> 결과는 boolean 자료형
		int n01 = 5;
		int n02 = 3;
		int n03 = 5;
		
		System.out.println(n01 < n02); // 5 < 3 --> false
		System.out.println(n01 > n02); // 5 > 3 --> true
		System.out.println(n01 <= n02); // 5 <= 3 --> false
		System.out.println(n01 <= n03); // 5 <= 5 --> true
		System.out.println(n01 >= n02); // 5 >= 3 --> true
		System.out.println(n01 >= n03); // 5 >= 5 --> true
		
		System.out.println(n01 == n02); // 5 == 3 --> false
		// System.out.println(n01=n02); // n01 에 n02(3)를 대입 --> 3
		
		System.out.println(n01 != n02); // 5 != 3 --> true
		
		
	}

}
