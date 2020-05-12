package com.javaex.practice04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;

		int result = 0;

		for (int i = 0; i < intArray.length; i++) {// 배열이 3개인데 4번 반복문이라서 *3번으로 수정
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
