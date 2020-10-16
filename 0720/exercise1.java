/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;

public class exercise1 {
	public static void main(String[] args) {

		int height, pit;
		double inch;
		Scanner scan = new Scanner(System.in);

		System.out.print("키 : ");		height = scan.nextInt();
		inch = height / 2.54;
		pit = (int)(inch / 12);

		System.out.printf("%dcm는 %d피트, %.2f인치입니다.\n", height, pit, inch);
		

		final double PI = 3.14;
		double r, roundHeight, v;
		
		System.out.print("원기둥 밑면의 반지름 : ");		r = scan.nextInt();
		System.out.print("원기둥 높이 : ");					roundHeight = scan.nextInt();

		v = PI * r * r * roundHeight;

		System.out.println("원기둥의 부피는 " + v + "입니다.");
	}
}
