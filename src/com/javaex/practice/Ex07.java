package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 나이를 입력 받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 나이를 입력
		System.out.println("나이를 입력해주세요. ");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// age에 따라서 입장료가 출력되게 하기
		// 20세 ~ : 성인//5000원입니다.
		if (age >= 20) {
			System.out.println("성인//5000원입니다.");
		}
		// 17세 ~ 19세 : 고등학생//4000원입니다.
		else if (age >= 17) {
			System.out.println("고등학생//4000원입니다.");
		}
		// 14세 ~ 16세 : 중학생//3000원입니다.
		else if (age >= 14) {
			System.out.println("중학생//3000원입니다.");
		}
		// 8세 ~ 13세 : 초등학생//2000원입니다.
		else if (age >= 8) {
			System.out.println("초등학생//2000원입니다.");
		}
		// 0세 ~ 7세 : 취학전아동//무료 입니다.
		else if (age >= 0) {
			System.out.println("취학전아동//무료입니다.");
		}
		else {
			System.out.println("나이는 음수일수 없습니다!");
		}
		// 스캐너 닫기
		sc.close();
	}
}
