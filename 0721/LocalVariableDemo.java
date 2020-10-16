/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
/*
	지역변수
*/
import java.util.Scanner;

public class LocalVariableDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int yearOfBorn;   //지역변수

		System.out.print("귀하의 출생년도는 ? : ");
		yearOfBorn = scan.nextInt();	//이때 초기화
		
		int age = 2020 - yearOfBorn + 1;		//지역변수
		System.out.println("귀하의 나이는 " + age + "살이군요.");






		/*int age = 34;
		{
			int age;
			System.out.println("age = " + age);
		}
		System.out.println("age = " + age); */


	}
}
