package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		
		double v01 = 5 / 4;
		System.out.println(5 / 4); // integer / integer = integer 따라서 1.25 -> 1
		System.out.println(v01); // 1 -> 1.0
		
		double v02 = (double)5 / 4; // 5.0 / 4 -> 실수가 포함되면 상위권인 실수로 적용.
		System.out.println(v02); // 1.25
		
		double v03 = 5 / (double)4; // v02와 동일
		System.out.println(v03); // 1.25
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04); // 1.25
		
		int v05 = (int)1.3 + (int)1.8; // 1 + 1 = 2
		System.out.println(v05); // 2
		
		int v06 = (int)(1.3 + 1.8); // 3.1 -> 3
		System.out.println(v06);
		
	}

}
