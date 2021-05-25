package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {
		
		// 논리 연산자
		int a = 5;
		int b = 7;
		
		// 논리 연산자 기본 &&
		System.out.println("======= &&연산자 =======");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true); // Dead Code --> false && 다음은 무조건 false이기 때문에 이후 code는 Dead Code
		System.out.println(false && false); // Dead Code --> false && 다음은 무조건 false이기 때문에 이후 code는 Dead Code 
		
		// 논리 연산자 기본 ||
		System.out.println("======= ||연산자 =======");
		System.out.println(true || true); // Dead Code --> true || 다음은 무조건 true이기 때문에 이후 code는 Dead Code
		System.out.println(true || false); // Dead Code --> true || 다음은 무조건 true이기 때문에 이후 code는 Dead Code 
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		// 논리 연산자 응용
		System.out.println("======= 논리 연산자 응용 =======");
		System.out.println((a > b) && (a < b)); // (5 > 7) --> false, (5 < 7) --> true ∴ F && T --> False
		System.out.println((a > b) && (a > b)); // (5 > 7) --> false, (5 > 7) --> false ∴ F && F --> False
		System.out.println((a > b) || (a < b)); // (5 > 7) --> false, (5 < 7) --> true ∴ F || T --> True
		System.out.println((a > b) || (a < b) && (a < b)); // (5 > 7) --> false, (5 < 7) --> true, (5 < 7) --> true ∴ F || T && T --> True
		System.out.println((a > b) && (a < b) || (a < b)); // (5 > 7) --> false, (5 < 7) --> true, (5 < 7) --> true ∴ F && T || T --> True
		
		System.out.println((a > b) && (a < b) && (a < b)); // (5 > 7) --> false, (5 < 7) --> true, (5 < 7) --> true ∴ (F && T)=F && T --> False
															// if문 할때 설명 --> 모두 true해야 true다 --> 모두 만족 해야 한다
		
		System.out.println("======= 논리 연산자 ! =======");
		System.out.println((a < b)); // 5 < 7 --> true
		System.out.println(!(a < b)); // 5 < 7 --> true ∴ !true --> false
		
		System.out.println( (a > b) && (a > b) ); // (5 > 7) --> false, (5 > 7) --> false ∴ F && F --> F
		System.out.println( !( (a > b) && (a > b) ) ); // F && F --> F ∴ !F --> T
		
		System.out.println( (a > b) && !(a < b) ); // (5 > 7) --> false, !(5 < 7) --> !true = false ∴ F && F --> F
		System.out.println( !(a > b) && !(a < b) ); // !(5 > 7) --> !false = true, !(5 < 7) --> !true = false ∴ T && F --> F
		}

}
