package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
//	아래와 같은 계산기 프로그램을 작성하세요.
//	⚫ 기호, 숫자1, 숫자2 순서로 입력 받습니다.
//	⚫ 기호는 ( + - * / ) 4가지 입니다.
//	⚫ 입력된 내용으로 계산하여 결과값을 출력합니다.
//	⚫ 나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.
	
	public static void main(String[] args) {
		// 스캐너 생성 
		Scanner sc = new Scanner(System.in);
		
		// 기호, 숫자1, 숫자2 순서로 입력
		System.out.print("출력되는 내용을 입력하세오\n기호 : ");
		char sign = sc.next().charAt(0);
		
		System.out.print("숫자1 : ");
		double num1 = sc.nextInt();
		
		System.out.print("숫자2 : ");
		double num2 = sc.nextInt();
		
		// 기호의 종류 ( + - * / ) 4가지만 입력해야해
		// 기본 값 false로 로직 이득과 오류 방지 도모.
		Boolean isFourBasic = false;	
		
		switch (sign) {
			case '+', '-', '*', '/' -> {
				isFourBasic = true;
			}
		}

		if(isFourBasic)
		{
			// 사칙연산이 아니면 계산 안 하므로 안쪽에서 선언
			// 로직상 result에 값이 안 들어가는 곳은 조회를 안하니 상관없지만,  warning 뜨는게 싫어서 초기화
			double result = 0;
			
			// 입력된 내용으로 계산하여 결과값을 출력
			if(sign == '+')
			{
				result = num1 + num2;				
			}
			else if(sign == '-')
			{
				result = num1 - num2;				
			}
			else if(sign == '/')
			{
				//아래쪽에서 한번 더 거르지만 0이면 프로그램 에러 가능성 있으므로 방지용
				if(num2 != 0)
					result = num1 / num2;
			}
			// 어쩌피 다른 문자들은 다 걸러서 남는 건 *이지만 해야하는게 있으니 명시적 표시
			else if(sign == '*')
			{
				result = num1 * num2;				
			}
			
			// 나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.
			if(sign == '/' && num2 == 0)
				System.out.println("계산할 수 없습니다.");
			else
				System.out.println("결과는 "+ result );
		}
		else
		{
			System.out.println("계산 할 수 없는 기호입니다.");
		}
		
		
		// 스캐너 닫기
		sc.close();
	}
}
