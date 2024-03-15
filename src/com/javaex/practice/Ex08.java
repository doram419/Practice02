package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
//		사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하는
//		프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)
		
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 키 입력 
		System.out.println("키와 몸무게를 입력해 주세요. ");
		//centimeter로 입력
		System.out.print("키 : ");
		double height = sc.nextDouble();
		//내부적으로 meter로 변환
		height = height / 100;
		
		// 몸무게를 입력 
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		
		// BMI을 계산. BMI가 약자라서 사회적인 약속으로는 대문자가 맞는 거 같은데
		// 프로그래밍적인 가독성(변수라는걸 알리기)을 위해 소문자로 작성
		double bmi;
		bmi = weight / (height * height);
		
		// BMI에 따라 구분 및 출력
		// 저체중 BMI <= 18.5
		if(bmi <= 18.5) {
			System.out.println("저체중입니다.");
		} 
		// 과체중 BMI >= 24.9
		else if(bmi >= 24.9) {
			System.out.println("과체중입니다.");
		}
		// 정상체중 저체중과 과체중을 제외한 나머지  18.5 <= BMI <= 24.9
		else {
			System.out.println("정상체중입니다.");
		}
		System.out.println("BMI : " + bmi);
		
		// 스캐너 닫기
		sc.close();
	}
}
