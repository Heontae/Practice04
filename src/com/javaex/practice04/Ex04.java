package com.javaex.practice04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < data.length; i++) {	//배열값 포문
			if (data[i] % 3 == 0) {	//data배열을 3으로 나눠서 참일경우
				sum += data[i];	// 합계를 더함
				count++;	//배수 개수를 카운터+1
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수==>"+count);
		System.out.println("주어진 배열에서 3의 배수의 합==>"+sum);
	}

}
