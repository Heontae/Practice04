package com.javaex.practice04;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = { 'T', 'H', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };
		char copy[] = new char[c.length]; // 복사본

		for (int i = 0; i < c.length; i++) { // 배열 프린트
			System.out.print(c[i]);
			copy[i] = c[i]; // c[i]값을 copy[i]값으로 복사
		}

		System.out.println(); // 지정 배열값을 덮어씌우 변경

		for (int i = 0; i < c.length; i++) { // 바뀐 배열값을 출력
			if (c[i] == ' ') {// c[i]가 ' ' 공백일경우
				copy[i] = ','; // ','변경
				System.out.print(copy[i]);
			} else {
				System.out.print(copy[i]);
			}
		}
	}

}
