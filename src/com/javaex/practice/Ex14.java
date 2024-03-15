package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
//		사번(양의정수)을 입력하면 팀을 확인할 수 있는 프로그램을 작성하세요.
//		⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
//		⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
//		(사번 0은 고려하지 않습니다.)
		
// 		스캐너 생성
		Scanner sc = new Scanner(System.in);
		
//		사번(양의정수)을 입력
//		(사번 0은 고려하지 않습니다.)
		System.out.print("사번(정수)를 입력하세요\n사번 : ");
		int employeeNum = sc.nextInt();
		int quo = employeeNum % 3;
		
		// 팀 구분
		// 사번을 3으로 나누어서 나머지가 0이면 A팀
		if(employeeNum >= 0)
		{
			// 기본을 A팀으로 둠 
			String team = "A팀";
			
			// 나머지가 1이면 B팀
			if(quo == 1)
			{
				team = "B팀";
			}
			// 나머지가 2이면 C팀
			else if(quo == 2)
			{
				team = "C팀";
			}
			// 팀 출력
			System.out.println(team + "입니다.");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
