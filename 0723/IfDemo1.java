/*
작성자 : 정재우
작성목적 : 연습문제
작성일시 : 7월 23일
작성환경 : Windows
*/
import java.util.Scanner;

public class IfDemo1 {
	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 : ");
		number = scan.nextInt();
		
		//유형1
		System.out.println("유형1");
		if(number % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		if(number % 2 == 1) {
			System.out.println("홀수입니다.");
		}

		//유형2
		System.out.println();
		System.out.println("유형2");
		if(number % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		//유형3
		System.out.println();
		System.out.println("유형3");
		if(number % 2 == 0) {
			System.out.println("짝수입니다.");	
		} else if(number % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수도 홀수도 아닌 수는 없습니다.");
		}


	}
}