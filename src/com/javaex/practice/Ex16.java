package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		// 다음과 같이 정의되는 함수의 함수 값을 계산해보자
		// x가 0보다 작거나 같으면 위의 식을, x의 값이 0보다 크면 아래의 식을 사용.
		// 스캐너 입력
		Scanner scanner = new Scanner(System.in);
		
		// x 입력 필요
		System.out.print("숫자를 입력해 주세요\n숫자 : ");
		double x = scanner.nextInt();
		
		// x 비교 변수
		boolean isXOverZero = (x > 0 ? true : false);
		
		// x가 0보다 작거나 같으면 위의 식을, x의 값이 0보다 크면 아래의 식을 사용.
		double result;
		if (isXOverZero) {
			result = 7 * x + 2; 
		}
		else
			result = (x * x * x) + ((-1) * 9 * x) + 2;
		
		System.out.println("계산결과는 " + result + "입니다");
		// 스캐너 닫기
		scanner.close();
	}
}
