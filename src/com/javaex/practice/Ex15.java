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
		// 기호의 종류 ( + - * / ) 4가지
		// 4가지를 제외한 다른 기호가 입력되면 "계산 할 수 없는 기호입니다."
		// 입력된 내용으로 계산하여 결과값을 출력
		// 나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.
		
		// 스캐너 닫기
		sc.close();
	}
}
