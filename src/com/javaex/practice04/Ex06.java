package com.javaex.practice04;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = { 'T', 'H', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };
		char copy[] = new char[16]; // 복사본

		for (int i = 0; i < c.length; i++) { // 배열 프린트
			System.out.print(c[i]);
			copy[i] = c[i]; // c[i]값을 copy[i]값으로 복사
		}

		System.out.println(); // 지정 배열값을 덮어씌우 변경
		copy[4] = ',';
		copy[7] = ',';
		copy[9] = ',';
		for (int i = 0; i < c.length; i++) { // 바뀐 배열값을 출력
			System.out.print(copy[i]);
		}
	}

}
