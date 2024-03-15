package com.javaex.practice;

public class Ex04 {
	// 다음 코드는 오류가 있습니다. 오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요.
//	public static void main(String[] args) {
//		int x = 0;
//		
//		// x = 0과 같으면
//		if (x = 0){
//			System.out.println("x는 0이다.");
//		}
//	}
	public static void main(String[] args) {
		int x = 0;
		
		// "x가 0과 같으면"이라는 작업을 시키고 싶다면
		// x = 0 이 아닌 x == 0을 써주어야 한다.
		if (x == 0){
			System.out.println("x는 0이다.");
		}
	}
}
