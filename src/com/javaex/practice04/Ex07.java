package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int wonArray[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };  //금액 배열지정
		int woncount[] = new int[10];	// 10개의 빈 배열 생성
		System.out.print("금액: ");	
		int money = sc.nextInt();	//스캐너값

		for (int i = 0; i < wonArray.length; i++) {
			woncount[i] = money / wonArray[i];	//내가 친 값을 woncount로  나눈뒤 개수를 woncount배열에 저장
			money -= woncount[i] * wonArray[i];	//스캐너 값을 빼주기
			if (money > 500) {	//만약 500원보다 크면 "장"으로 출력
				System.out.println(wonArray[i] + "원:" + woncount[i] + "장");

			} else {	//아닐 경우 "개"로 출력
				System.out.println(wonArray[i] + "원:" + woncount[i] + "개");
			}
		}
	}

}
