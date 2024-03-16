package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
//		아래의 조건과 같이 출력되도록 프로그램을 작성하세요
//		태어난 년도를 입력 받습니다.
//		나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
//		성인(20세 이상) 이면 무료로 건강검진을 받을 수 있습니다.
//		짝수해 태어난 사람은 올해가 짝수해 이면 검사 대상이고 올해가 홀수해 이면 검사대상이 아닙니다.
//		(홀수해 태어난 사람이 올해가 홀수해 이면 검사 대상, 올해가 짝수해이면 검사대상이 아닙니다.) 
//		40세 이상의 경우에는 암 검사도 무료료 검사 받을 수 있습니다
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
//		⚫ 태어난 년도 입력
		System.out.print("태어난 연도를 입력해주세요\n년도 : ");
		int yearBirth = sc.nextInt();
		
//		⚫ 나이는 계산하기 (생일과 관계없이 계산됨.) 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
		final int yearCurrent = 2023;
		int age = yearCurrent - yearBirth;
		
//		성인(20세 이상)이면 무료로 건강검진을 받을 수 있습니다.
		boolean isFreeHealth = false;
		if (age >= 20) {
			isFreeHealth = true;
		}
		
//		짝수해 태어난 사람은 올해가 짝수해 이면 검사 대상이고 올해가 홀수해이면 검사대상이 아닙니다.
		boolean isScreenTarget = false;
		if(yearBirth % 2 == 0 && yearCurrent % 2 == 0) {
			isScreenTarget = true;
		}
		else if(yearBirth % 2 == 1 && yearCurrent % 2 == 1) {
			isScreenTarget = true;
		}
		
//		40세 이상의 경우에는 암 검사 무료
		boolean isFreeCancerTest = false;
		if(age >= 40)
		{
			isFreeCancerTest = true;
		}
		
		// 출력
		System.out.println("올해 : " + yearCurrent);
		System.out.println("태어난해 : " + yearBirth);
		System.out.println("나이 : " + age);
		System.out.println("===========================");
		if(isFreeHealth)
		{
			System.out.println("20살 이상");
			
			if(isScreenTarget)
			{
				System.out.println("건강검진해");
					
				if(isFreeCancerTest)
				{
					System.out.println("암 검사 O");
				}
				else
				{
					System.out.println("암 검사 X");
				}
			}
			else
			{
				System.out.println("건강검진해 아님");
			}

		}
//		"20살미만 건강검진대상이 아님"
		else
		{
			System.out.println("20살미만 건강검진대상이 아님");			
		}
		
		// 스캐너 종료
		sc.close();
	}

}
