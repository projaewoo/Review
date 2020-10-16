/*
작성자 : 정재우
작성목적 : 학점 산출
작성일시 : 7월 22일
작성환경 : Windows
*/

import java.util.Scanner;

public class ScoreMgmt {
	public static void main(String[] args) {
		String id, name;
		int kor, eng, math, total;
		double avg;
		char grade;
		Scanner scan = new Scanner(System.in);

		System.out.print("학번 : ");	id = scan.nextLine();
		System.out.print("이름 : ");	name = scan.nextLine();
		System.out.print("국어 : ");	kor = scan.nextInt();
		System.out.print("영어 : ");	eng = scan.nextInt();
		System.out.print("수학 : ");	math = scan.nextInt();
		System.out.println("--------------------");
		System.out.printf("<<%s(%s)의 성적표>>\n", name, id);

		total = kor + eng + math;
		avg = (kor + eng + math) / 3.0;
		grade = (avg >= 90) ? 'A' : 
						(avg >= 80) ? 'B' :
							(avg >= 70) ? 'C' :
								(avg >= 60) ? 'D' : 'F';

		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.2f, 평점 : %c\n",
										      kor,          eng,       math,      total,             avg,          grade);    
		
	}
}
