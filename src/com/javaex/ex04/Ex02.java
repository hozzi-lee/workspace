package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		/* ...예제 코드 안보고 해본것...
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		int num1_9 = sc.nextInt();
		int answer;

		while ( i < 9 ) {
			answer = ( i + 1 ) * num1_9;
			System.out.println(""+num1_9+" * "+( i + 1 )+" = "+(long)answer+"");
			i++;
		}
		sc.close();
		 */

		Scanner sc = new Scanner(System.in);
		
		int dan;
		int i = 1; // 초기화
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		dan = sc.nextInt();
		int danXi;

		while ( i <= 9 ) { // 반복조건
			danXi = dan * i;
			System.out.println(dan + " * " + i + " = " + danXi);
			i++; // 증감식
		}
		sc.close();
	}

}
