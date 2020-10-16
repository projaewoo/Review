/*
작성자 : 정재우
작성목적 : 연습문제
작성일시 : 7월 23일
작성환경 : Windows
*/
import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		String name, degree;
		double cmHeight, mHeight, weight, bmi; 
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 : ");	name = scan.nextLine();
		System.out.print("키 : ");		cmHeight = scan.nextDouble();

		System.out.print("몸무게 : "); weight = scan.nextDouble();
		System.out.println("---------------");
		
		mHeight = cmHeight / 100;
		bmi = weight / (mHeight * mHeight);
		if(bmi >= 40) {
			degree = "고도 비만";
		} else if(bmi >= 35) {
			degree = "중등도 비만";
		} else if(bmi >= 30) {
			degree = "경도 비만";
		} else if(bmi >= 25) {
			degree = "과체중";
		} else if(bmi >= 18.5) {
			degree = "정상";
		} else {
			degree = "저체중";
		}
		
		System.out.printf("%s님의 BMI지수는 %.2f이고, %s입니다.",
									name,                 bmi,         degree);

	}
}
