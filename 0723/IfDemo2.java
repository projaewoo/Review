/*
작성자 : 정재우
작성목적 : 연습문제
작성일시 : 7월 23일
작성환경 : Windows
*/

import java.util.Scanner;

public class IfDemo2 {
	public static void main(String[] args) {
		String season;
		Scanner scan = new Scanner(System.in);
		System.out.print("계절을 입력하시오. (소문자 영문 또는 한글로 입력) : ");
		season = scan.nextLine();
		
		System.out.printf("입력받은 계절은 %s입니다.\n", season);

		if(season.equals("spring") || season.equals("봄")) {
			System.out.println("개나리, 진달래");
		} else if (season.equals("summer") || season.equals("여름")) {
			System.out.println("장미, 아카시아");
		} else if(season.equals("fall") || season.equals("가을")) {
			System.out.println("백합, 코스모스");
		} else if(season.equals("winter") || season.equals("겨울")){
			System.out.println("동백, 매화");
		}

		//연습 //isBlank()메소드가 String클래스에 속하고, static아님
				//따라서 String의 참조변수에 주소로 접근.
		System.out.println(season.isBlank());
		
	}
}
