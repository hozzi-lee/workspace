package com.javaex.ex01;

public class Ex11 {
	public static void main(String[] args) {

		// 연산자 우선순위 실습
		/* ① ② ③ ④ ⑤ ⑥ ⑦ ⑧ ⑨ ⑩
		1) result = x * y % z – a / b ;
                 ⑤   ①  ②  ④  ③
		
		2) m = x + y + z / 3 ;               2-1) m = ( x + y + z ) / 3 ;
		    ④  ②  ③  ①                          ④   ①  ②    ③
		
		3) result = x % y * z ;
		         ③   ①  ②
		
		4) x = y = w = z ;
		    ③   ②  ①
		
		5) x = y = 3 / 5 * 2 % 6 ;
		    ⑤   ④ ①  ②  ③
		
		6) y = a * x * x + b * x + c ;
		    ⑥  ①  ②  ④  ③  ⑤
		
		 */
		

	}

}