package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("점수: ");

		int point = sc.nextInt();

		if(point >= 60) { // 60이상 == true     60미만 == false
			System.out.println("합격입니다.");
		}
		//		if(point < 60) { // 60이상 == true     60미만 == false
		//			System.out.println("불합격입니다.");
		//		}
		//		else {
		//			System.out.println("불합격입니다.");
		//		}
		sc.close();
	}

}
