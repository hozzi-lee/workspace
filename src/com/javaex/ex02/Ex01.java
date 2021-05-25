package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {

		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		String name = "이호진";

		System.out.println("안녕하세요");
		
		System.out.println(str); // "굿모닝"
		System.out.println("str"); // "srt"
		
		System.out.println(i); // 2345
		System.out.println("i"); // "i"
		System.out.println('i'); // "i"
		System.out.println("ii"); // "ii"
		
		/*
		System.out.print("안녕");
		System.out.println("하"); // "안녕하"
		*/
		
		System.out.println("안녕"); // "안녕"
		System.out.println("하"); // "하"
		
		System.out.println("=============");
		
		System.out.println(i); // 2345
		System.out.println(i+i); // 4690
		
		System.out.println(str); // "굿모닝"
		System.out.println(str+str); // "굿모닝굿모닝"
		
		System.out.println(str+i); // "굿모닝2345" --> "굿모닝" + "2345" --> 문자 + 숫자 일때 숫자를 string으로 변환
		System.out.println(str+d); // "굿모닝3.14" --> "굿모닝" + "3.14" --> 문자 + 숫자 일때 숫자를 string으로 변환
		System.out.println(str + " 이랑 " + i + " 다");
		System.out.println(str + " " + i + " 다");
		
		// 주의
		System.out.println(c); // '한'
		System.out.println(c + c); // '한' 코드값(54620) + '한' 코드값(54620) = 109240
		System.out.println(s + s); // "한" + "한" --> "한한"
		System.out.println(c + s); // '한' + "한" --> "한한"
		System.out.println((int)'한'); // '한' 코드값 54620
		
		// 제 이름은 이호진 입니다.
		System.out.println("제 이름은 " + name + " 입니다.");
		
		// 안녕하세요
		System.out.println("안녕하세요");
		
		// 안녕'하'세요
		System.out.println("안녕'하'세요");
		
		// 안녕"하"세요
		System.out.println("안녕\"하\"세요");
		
		// 안녕\하\세요
		System.out.println("안녕\\하\\세요");
		
		// 안녕		하		세요
		System.out.println("안녕\t하\t세요");
		
		// 안녕
		// 하세요
		System.out.println("안녕\n하세요");



	}

}
