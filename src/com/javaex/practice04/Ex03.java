package com.javaex.practice04;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intA = { 3, 6, 9 };

		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;

		for (int i = 0; i < intA.length; i++) { // i <3까지 반복
			System.out.println(intA[i]);
		}

		// 3,6,9였는데 0번이랑 2번에 각 20,10을 덮어 20,6,10 값 출력
	}

}
