package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// 두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 두 개의 정수를 입력
		System.out.print("첫번째 숫자: ");
		int firstNum = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int secondNum = sc.nextInt();
		
		// 큰 수를 작은 수로 나눈 몫과 나머지 구하기
		int bigNum;
		int smallNum;
		int quotient;
		int remainder;
		
		//큰 수 판별
		if(firstNum > secondNum) {
			bigNum = firstNum;
			smallNum = secondNum;
		}
		else {
			bigNum = secondNum;
			smallNum = firstNum;
		}
		
		quotient = bigNum / smallNum;
		remainder = bigNum % smallNum;
		
		// 출력
		System.out.println("몫 : " + quotient + 
				"\n나머지 : " + remainder);
		
		// 스캐너 해제
		sc.close();
	}
}
