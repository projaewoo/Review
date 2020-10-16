/*
작성자 : 정재우
작성목적 : 연습문제
작성일시 : 7월 23일
작성환경 : Windows
*/
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		String name, tti = "\0";
		int year, age;
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 : ");	name = scan.nextLine();
		System.out.print("출생년도 : ");	year = scan.nextInt();

		age = 2020 - year + 1;
		
		switch(year % 12) {
			case 0 : tti = "원숭이"; break;
			case 1 : tti = "닭"; break;
			case 2 : tti = "개"; break;
			case 3 : tti = "돼지"; break;
			case 4 : tti = "쥐"; break;
			case 5 : tti = "소"; break;
			case 6 : tti = "호랑이"; break;
			case 7 : tti = "토끼"; break;
			case 8 : tti = "용"; break;
			case 9 : tti = "뱀"; break;
			case 10 : tti = "말"; break;
			case 11 : tti = "양";
		}

		System.out.printf("%s님은 %d살이고, %s띠입니다.\n",
									name,   age,         tti);

	}
}
