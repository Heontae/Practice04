package com.javaex.practice04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;

		int result = 0;

		for (int i = 0; i < intArray.length; i++) {// 배열이 5개인데 length를 선언하면 intArray.length는 5가되는데 <=를 사용하면 6번반복이라 오류
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
