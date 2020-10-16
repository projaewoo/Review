/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;

public class ArrayDemo3 {
	public static void main(String[] args) {
		//String [] array = {"Hello", "World", "Java", "Android", "Python", "Oracle"};
		Scanner scan = new Scanner(System.in);
		//1번문제 
		//do-while문
		int input, out;
		int [] money = {50_000, 10_000, 5_000, 1_000, 500, 100, 50, 10, 5, 1};
		String check; 
		do {
			System.out.print("Money : ");	input = scan.nextInt();
			for(int i = 0; i < money.length ; i++) {
				out = input / money[i];
				System.out.print(money[i] + "원권 : " + out + "\n");
				input %= money[i];
			}
			System.out.print("Again(y / n) ? ");	check = scan.next();
		}
		while("y".equals(check));
		
		/*int [] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		String y_n = null;
		do{
			System.out.print("Money : ");
			int money = scan.nextInt();
			for(int i = 0; i < array.length ; i++) {
				System.out.println(array[i] + "원권 : " + money / array[i] );
				money %= array[i];
			}
			System.out.print("Again(y / n) ? : ");
			y_n = scan.next();
		}while(y_n.equals("y")); */


		//2번 문제
		//문자열 거꾸로 출력
		
	}
}