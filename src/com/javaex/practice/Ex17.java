package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
//		다음과 같이 수익을 입력 받아 소득세를 계산하는 프로그램을 작성하세요
//		세금계산법
//		0원이상 1000만원 이하인 경우 tax: 0.09*수익
//		1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
//		4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
//		8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 수익 입력
		System.out.print("수익을 입력해 주세요\n수익: ");
		double income = sc.nextInt();
		
		// 소득세 계산
		double incomeTax; 

		if(income > 0)
		{
			// 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
			if(income >= 8000)
			{
				incomeTax = 1000 * 0.09 + 3000 * 0.18 
						+ 4000 * 0.27 + 0.36 * (income - 8000);
			}
			// 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
			else if (income > 4000) {
				incomeTax = 1000 * 0.09 + 3000 * 0.18 
						+ 0.27 * (income - 4000);
			}
			// 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
			else if (income > 1000) {
				incomeTax = 1000 * 0.09 + 0.18 * (income - 1000);
			}
			// 0원이상 1000만원 이하인 경우 tax: 0.09*수익
			else {
				incomeTax = 0.09 * (income);
			}
			
			System.out.println("소득세는 " + incomeTax + "입니다.");
		}
		// 음수인 경우 오류 메시지 출력
		else
		{
			System.out.println("잘못 입력했습니다.");
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
