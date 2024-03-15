package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		// 두 개의 정수를 입력 받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
		// 0은 입력하지 않습니다.
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 두 개의 정수를 입력 
		System.out.print("첫번째 숫자 : ");
		int firstNum = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int secondNum = sc.nextInt();
		
		// 큰 수와 작은 수 구하기 
		int bigNum;
		int smallNum;
		
		// 첫번째 숫자보다 두번째 숫자가 크면? 큰 수는 첫번째 수
		// 작은 수는 두번째 수
		// 아니면 반대
		// 0은 입력하지 않습니다!
		if(firstNum < secondNum)
		{
			bigNum = secondNum;
			smallNum = firstNum;
		}
		else
		{
			bigNum = firstNum;
			smallNum = secondNum;
		}
			
		// 작은 수가 큰 수의 약수인지 판별
		boolean isDivisor = (bigNum % smallNum == 0);
		
		// 약수 출력
		if(isDivisor)
		{
			System.out.println(smallNum + "는(은) " +
					bigNum + "의 약수입니다.");			
		}
		else
		{
			System.out.println(smallNum + "는(은) " +
					bigNum + "의 약수가 아닙니다.");			
		}
		
		// 스캐너 종료
		sc.close();
	}
}
