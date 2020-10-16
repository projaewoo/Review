/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {

		//1번 문제  cm 키를 피트와 인치로 변환하는 프로그램
		int height, pit;
		double inch;
		Scanner scan = new Scanner(System.in);

		System.out.print("키 : ");	height = scan.nextInt();
		inch = height / 2.54;
		pit = (int)(inch / 12);

		System.out.printf("%dcm는 %d피트, %.2f인치 입니다.\n", height, pit, inch);



		System.out.println("-------------------------");
		//2번 문제  원기둥의 부피를 구하는 프로그램
		final double PI = 3.14;
		double r, roundHeight;
		double v;

		System.out.print("원기둥 밑면의 반지름 : ");	r = scan.nextInt();
		System.out.print("원기둥 높이 : ");				roundHeight = scan.nextInt();
		v = PI * r * r * roundHeight;

		System.out.printf("원기둥의 부피는 %.2f입니다.\n", v);
		System.out.println("원기둥의 부피는 " + v + "입니다.");



		System.out.println("-------------------------");
		//3번 문제  BMI지수 구하는 프로그램
		double bmiHeight, bmiWeight, bmiDegree;
		
		System.out.print("키 : ");		bmiHeight = scan.nextDouble();
		System.out.print("몸무게 : ");			bmiWeight = scan.nextDouble();
		bmiDegree = (bmiWeight /  ((bmiHeight/100)*(bmiHeight/100)) );

		System.out.printf("귀하의 BMI지수는 %.2f입니다.", bmiDegree);
	}
}
