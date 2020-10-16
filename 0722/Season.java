/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		String season, flower;
		Scanner scan = new Scanner(System.in);
	
		System.out.println("좋아하는 계절 (영어로 입력) : ");
		season = scan.nextLine();

		flower = (season.equals("spring")) ? "개나리, 진달래" : 
						(season.equals("summer")) ? "장미, 아카시아" :
							(season.equals("fall")) ? "백합, 코스모스" : "동백, 매화";

		System.out.printf("계절 : %s\n꽃 : %s", season, flower);
	}
}
