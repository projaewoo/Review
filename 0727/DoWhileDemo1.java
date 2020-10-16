/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;		//while, for문 조건에 따라 실행할지 안할지 정함
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q") );
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
