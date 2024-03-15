package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		// 숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 숫자(정수) 3개를 입력
		// 숫자(정수) 3개 생성
		int num1;
		int num2;
		int num3;
		
		// 숫자(정수) 3개 값 입력
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();
		System.out.print("숫자3 : ");
		num3 = sc.nextInt();
		
		// 가장 작은 수 판별
		int smallNum = (num1 < num2 ? num1 : num2);
		
		if(smallNum > num3)
			smallNum = num3;
		
		// 출력하세요
		System.out.println("가장 작은 수는 " + smallNum + "입니다.");
		
		// 스캐너 종료
		sc.close();
	}
}
