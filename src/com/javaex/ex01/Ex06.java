package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {

		// 자동 형변환 - 1 : 자동형변환 규칙을 알아야 자료형을 결정 할 수 있다.
		System.out.println(2 + 3.5);
		double var01 = 2 + 3.5; // = float var01 = 2 + 3.5f; // 자료형을 알아야 한다.
		System.out.println(var01);
		
		// 자동 형변환 - 2 : (long + float)
		long var02 = 12345l; // integer의 범위가 넘어가면 L(l)을 붙인다.
		float var03 = 1.1f; // float은 무조건 F(f)를 붙인다.
		System.out.println(var02 + var03); // Test --> 실수(float)
		
		float result01 = var02 + var03; // long(var02) --> float로 자동 변환 되었음.
		System.out.println(result01);
		
		
		//////////////////////////////////////////////////////////////
		System.out.println("--------------------------------------");
		//////////////////////////////////////////////////////////////
		
		
		// 강제 형변환
		int var04 = (int)3.14;
		System.out.println(var04);
		
		// 강제 확대 변환
		byte var05 = 127;
		int result02 = (int)var05; // 강제 확대 형변환 (byte --> int)
		System.out.println(result02);
		
		// 강제 축소 변환 - 1
		int var06 = 10;
		byte result03 = (byte)var06;
		System.out.println(result03);
		
		// 강제 축소 변환 - 2
		int var07 = 10232132;
		byte result04 = (byte)var07;
		System.out.println(result04); // 출력되는 값 이유 확인
		
		
		// 실수 --> 정수 : 소수점 없어짐
		double var08 = 1235.5734334;
		int result05 = (int)var08;
		System.out.println(result05);
		
		// 정수 --> 실수 : 소수점이 0으로 표현된다.
		int var09 = 7;
		double result06 = (double)var09;
		System.out.println(result06);
		
		/* 개인연습
		// character의 번호를 알고싶을 때 - 굳이???
		int num11 = 0;
		char ch11 = 'c';
		int result11 = num11 + ch11;
		System.out.println(result11);
		*/

	}
}
