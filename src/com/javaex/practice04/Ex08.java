package com.javaex.practice04;

import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int rotto[] = new int[6]; // 배열6개생성
		int temp = 0; // 빈그릇 생성

		for (int i = 0; i < rotto.length; i++) { // rotto 배열 6개에 1~45숫자 랜덤생성
			rotto[i] = random.nextInt(44) + 1;
			for (int j = 0; j < i; j++) {
				if (rotto[i] == rotto[j]) { // 중복검사를해서 중복되면 i값을 -시켜 새로운값 덮어쓰기
					System.out.println("중복되었습니다.");
					System.out.println("새롭게 숫자를 배정하겠습니다.");
					i--;
				}
			}
		}
		for (int i = 0; i < rotto.length; i++) { // 생성된 rotto값을 오름차순 정렬
			for (int j = 0; j < 5; j++) {
				if (rotto[j] > rotto[j + 1]) {
					temp = rotto[j];
					rotto[j] = rotto[j + 1];
					rotto[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < rotto.length; i++) {// 배열에 생선된 로또 숫자 출력
			System.out.print(rotto[i] + "\t");

		}
	}

}
