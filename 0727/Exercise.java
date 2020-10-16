/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년 월 일 : ");
		String yearStr = scan.next();		
		int year = Integer.parseInt(yearStr);		//"2020" --> 2020

		String monthStr = scan. next();			//"7"
		int month = Integer.parseInt(monthStr);

		String dayStr = scan. next();				//"27"
		int day = Integer.parseInt(dayStr);

		int total = 0;
		for(int i = 1; i < year; i++) {
			if(i % 400 == 0 || (i % 4 == 0 && i % 100 == 0)) total += 366;
			else total += 365;
		}  //2019년 12월 31일까지 더함.

		switch(total % 7) {
			case 0 : System.out.println("일요일입니다."); break;


		}


	}
}
