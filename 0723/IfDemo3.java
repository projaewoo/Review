/*
작성자 : 정재우
작성목적 : 연습문제
작성일시 : 7월 23일
작성환경 : Windows
*/
import java.util.Scanner;

public class IfDemo3 {
	public static void main(String[] args) {
		int year;
		Scanner scan = new Scanner(System.in);

		System.out.print("년도 : ");
		year = scan.nextInt();

		if(year % 400 == 0 && year %100 == 0 && year % 4 == 0) {
			System.out.printf("%d년은 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년은 윤년이 아닙니다.\n", year);
		}

	}
}
