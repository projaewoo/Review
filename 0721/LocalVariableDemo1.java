/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Scanner;

public class LocalVariableDemo1 {
	public static void main(String[] args) {
		double height;	//지역변수
		Scanner scan;   //지역변수, 선언
		scan = new Scanner(System.in);	//지역변수 생성
		System.out.print("귀하의 키는 ? ");		height = scan.nextDouble();		//초기화

		double inch = height / 2.54;	//지역변수  //산술연산자 (이항연산자)
		double fit = inch / 12;			//지역변수
		System.out.printf("%.1fcm는 %.1f피트이고, %.2f인치입니다.\n", 
										height,      fit,					inch);

	}
}
