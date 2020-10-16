/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class SungjukMgmt {
	public static void main(String[] args) {
		Student chulsu = new Student();
		Student.mat = 100;
		chulsu.kor = 90;	chulsu.eng = 85;
		int total = chulsu.kor + chulsu.eng + Student.mat;
		System.out.println("철수 총점 = " + total);

		Student younghee = new Student();
		younghee.kor = 95;  younghee.eng = 100;
		total = younghee.kor + younghee.eng + Student.mat;
		System.out.println("영희 총점 = " + total);
	}
}
