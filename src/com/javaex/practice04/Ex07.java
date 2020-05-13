package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int wonArray[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 }; // 금액 배열지정
		int woncount[] = new int[wonArray.length]; // 10개의 빈 배열 생성

		boolean run = true;

		while (run) {
			System.out.print("금액: ");
			int money = sc.nextInt(); // 스캐너값
			if (money <= 0) { // 스캐너값이 0보다 작거나 같을경우
				System.out.println("올바른 금액을 입력해주세요.");
				run = true;
			} else {
				for (int i = 0; i < wonArray.length; i++) { // wonArray배열 갯수만큼 반복
					woncount[i] = money / wonArray[i]; // 내가 친 값을 woncount로 나눈뒤 개수를 woncount배열에 저장
					money -= woncount[i] * wonArray[i]; // 스캐너 값을 빼주기
					if (wonArray[i] > 500) { // 만약 500원보다 크면 "장"으로 출력
						System.out.println(wonArray[i] + "원:" + woncount[i] + "장");
					} else { // 아닐 경우 "개"로 출력
						System.out.println(wonArray[i] + "원:" + woncount[i] + "개");
					}
					run = false; // run값을 false로 저장하여 반복문 종료
				}
			}
			System.out.println("===================");
		}
		sc.close();
	}
}
