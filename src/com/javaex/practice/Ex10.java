package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 두 개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세요

		// 스캐너 열기
		Scanner sc = new Scanner(System.in);

		// 두 개의 숫자를 입력
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();

		// 큰 수와 작은 수를 분류
		int bigNum;
		int smallNum;

		if (num1 > num2) {
			bigNum = num1;
			smallNum = num2;
		} 
		else {
			bigNum = num2;
			smallNum = num1;	
		}

		// 출력하세요
		System.out.print("큰수 : " + bigNum + "\t");
		System.out.println("작은수 : " + smallNum + "입니다.");
		// 스캐너 닫기
		sc.close();
	}
}
