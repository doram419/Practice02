package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {
	// 숫자(정수) 3개를 입력받아 가장 큰 수를 출력하세요
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 숫자(정수) 3개를 입력
		int num1;
		int num2;
		int num3;
		
		// 숫자(정수) 3개 값 입력
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1 : ");
		num1=sc.nextInt();
		System.out.print("숫자2 : ");
		num2=sc.nextInt();
		System.out.print("숫자3 : ");
		num3=sc.nextInt();
		
		// 가장 큰 판별
		int bigNum = (num1 > num2 ? num1 : num2);
		
		if(bigNum < num3)
			bigNum = num3;
		
		// 출력하세요
		System.out.println("가장 큰 수는 " + bigNum + "입니다.");
		
		// 스캐너 종료
		sc.close();
	}
}
