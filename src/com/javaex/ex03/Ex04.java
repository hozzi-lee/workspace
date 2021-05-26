package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 조건문 예제 - 1
		System.out.println("철수의 편의점 아르바이트 일급 계산^^");
		System.out.print("철수의 근무시간: ");

		/*...기존 혼자 코딩한 불필요한 계산식이 발생하는 코드...

		  int time = sc.nextInt();
		  int time_if = time * 10000;
		  int time_else = 8 * 10000 + (time-8) * 12000;

		  if (time <= 8) {
		   System.out.println("오늘의 급여는 "+time_if+"원 입니다."); 
		   }
		   else {
		  System.out.println("오늘의 급여는 "+time_else+"원 입니다."); 
		  }
		 */

		int time = sc.nextInt();
		int pay10 = 10000;
		int pay12 = 12000;
		int sum;

		if (time > 8) {
			sum = 8 * pay10 + (time - 8) * pay12;
			// System.out.println(sum);
		} else {
			sum = time * pay10;
			// System.out.println(sum);
		}
		// else {
		// System.out.println("잘못된 값");
		// }

		System.out.println(sum);

		sc.close();
	}

}
