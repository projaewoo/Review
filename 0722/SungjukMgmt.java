/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		Student jimin = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 : ");	String id = scan.nextLine();	//2020-001
		jimin.id = id;  //2020-001  //지역변수가 받아서 멤버변수에 넣어줌
		System.out.print("이름 : ");	String name = scan.nextLine();  //한지민
		jimin.name = name;  //한지민
		System.out.print("국어 : ");	 jimin.kor = scan.nextInt();
		System.out.print("영어 : ");	jimin.eng = scan.nextInt();
		System.out.print("수학 : ");	jimin.math = scan.nextInt();

		jimin.total = jimin.kor + jimin.eng + jimin.math;
		jimin.avg = jimin.total / 3.;
		jimin.grade = (jimin.avg >= 90) ? 'A' :
								(jimin.avg >= 80) ? 'B' :
									(jimin.avg >= 70) ? 'C' :
										(jimin.avg >= 60) ? 'D' : 'F';

		System.out.printf("%s(%s)의 성적표\n", jimin.name, jimin.id);
	}
}
