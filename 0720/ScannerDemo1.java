/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;			//util카테고리에 Scanner만 가져와.

public class ScannerDemo1 {
	public static void main(String[] args) {
		/*System.out.print("귀하의 나이는 ? ");
		Scanner scan; //1단계 선언
		scan = new Scanner(System.in);  //2단계 할당
		int age;  //선언
		age= scan.nextInt();	 //입력버퍼에서 한 개의 정수를 읽어들이는 함수.
		System.out.println("귀하의 나이는 " + age + "살이군요");
		System.out.printf("귀하의 나이는 %d살이군요.\n", age);  */

		/*double height;  //1. 값변수 선언
		double weight;
		
		Scanner scan;   //1. 주소변수 선언
		scan = new Scanner(System.in);   //주소 할당

		System.out.print("키 : ");
		height = scan.nextDouble();   //값 할당

		System.out.print("몸무게 : ");
		weight = scan.nextDouble();  //값 할당  //height, weight : 값 변수이므로 값만 할당

		System.out.printf("키 = %.1fcm\t몸무게 = %.1fKg\n", height, weight);  */

		String name;   //주소 변수 선언
		Scanner scan;   //주소 변수 선언  //둘 다 클래스여서
		
		scan = new Scanner(System.in);   //주소 변수 할당
		System.out.print("성명 : ");
		name = scan.nextLine();   //주소 변수 할당

		System.out.println("귀하의 이름은 " + name + " 이군요.");

	}
}
