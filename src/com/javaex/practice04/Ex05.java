package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arrA[] = new int[5];
		int sum = 0;
		System.out.println("숫자를 입력하세요");

		for (int i = 0; i < arrA.length; i++) { // 스캐너 값을 5개입력받아 합계를 저장
			System.out.print(">>");
			arrA[i] = sc.nextInt(); // 스캐너값을 arrA[i]그릇에 저장
			sum += arrA[i]; // arr[i]값을 sum변수에 계속 더하기
		}
		System.out.println("평균은 " + (double) (sum / arrA.length) + " 입니다.");
		sc.close();
	}

}
