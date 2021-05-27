package com.javaex.ex04;

public class Ex08 {
	public static void main(String[] args) {

		int num = 1;

		while (true) { // 반복 횟수를 알 수 없을때(while(true))

			if ( (num % 6) == 0 && (num % 14) == 0 ) { // 조건이 됐을때 break;(가장 가까운 반복문(while) 탈출)
				System.out.println(num);
				break;
			} 
				num++;
		}
	}

}
