package com.javaex.practice;

public class Ex03 {
//다음 코드는 오류가 있습니다. 오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.
//	public static void main(String[] args) {
//		int age = 15;
//		
//		//age가 0살 초과이고 18살 미만이면
//		if(0 < age <18) {
//			System.out.println("청소년입니다.");
//		}
//	}
	
	public static void main(String[] args) {
		int age = 15;
		
		// 프로그래밍 언어는 사람이 쓰는 언어와 다르다.
		// 그래서 0 < age < 18을 쓰고 싶다면 다음과 같이 사용해야 한다.
		if(0 < age && age <18) {
			System.out.println("청소년입니다.");
		}
	}
}
