package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	// 알파벳을 입력 받아 자음 모음을 구분하세요.
	// ⚫ switch~case문을 사용합니다.
	// ⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다.
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 알파벳을 입력 받기 
		System.out.print("알파벳 1글자(소문자)를 입력하세요\n알파벳 : ");
		char alpha = sc.next().charAt(0);
		
		
		// switch~case문을 사용하여 자음 모음을 구분
		// 영문 소문자 이외의 입력 값은 고려하지 않음
		switch (alpha) 
		{
			case 'a', 'e', 'o', 'u', 'i' -> {
				System.out.println("모음입니다.");
			}
			default -> {
				System.out.println("자음입니다.");
			}
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
