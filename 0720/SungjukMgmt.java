/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		String id, name;
		int koreanScore, englishScore, mathScore, total;
		double average;
		Scanner scan = new Scanner(System.in);

		System.out.print("학번 : ");
		id = scan.nextLine();

		System.out.print("이름 : ");
		name = scan.nextLine();

		System.out.print("국어 성적 : ");
		koreanScore = scan.nextInt();

		System.out.print("영어 성적 : ");
		englishScore = scan.nextInt();

		System.out.print("수학 성적 : ");
		mathScore = scan.nextInt();

		total = koreanScore + englishScore + mathScore;
		average = total / 3.;

		System.out.println();
		System.out.printf("학번 : %s\n이름 : %s\n국어성적 : %d\n영어성적 : %d\n수학성적 : %d\n",
			                                   id,             name,   koreanScore,    englishScore,   mathScore);
		System.out.printf("총점 : %d\n평균 : %.1f", total, average);
	}
}
