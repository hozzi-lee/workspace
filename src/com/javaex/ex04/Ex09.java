package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		while ( true ) {

			System.out.println("숫자를 입력하세요");
			int num3x = sc.nextInt();

			if ( num3x % 3 == 0 && num3x != 0 ) {
				System.out.println("3의 배수입니다.");				
			} else if ( num3x % 3 != 0 && num3x != 0 ) {
				System.out.println("3의 배수가 아닙니다.");
			} else {
				System.out.println("종료");
				break;
			}	

			/* 강사님 해답 - 1

			if ( num3x == 0 ) {
				System.out.println("종료");
				break;
			}
			if ( num3x % 3 == 0 ) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
			 */

			/* 강사님 해답 - 2

			boolean action = true;
 			while (action)
 			
			if ( num3x == 0 ) {
				System.out.println("종료");
				action = false;
			} else if ( num3x % 3 == 0 ) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}

			 */
		}
		sc.close();
	}

}
