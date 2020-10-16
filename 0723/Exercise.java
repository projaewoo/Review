/*
작성자 : 정재우
작성목적 : 연습문제
작성일시 : 7월 23일
작성환경 : Windows
*/
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		int a, b, max, min, result = 0;
		String operator;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수 : " );		a = scan.nextInt();
		System.out.print("두번째 수 : " );		b = scan.nextInt();
		System.out.print("연산자(+, -, x, /, %) : " );		operator = scan.next();
		
		if(a > b) {
			max = a; min = b;
		} else {
			max = b; min = a;
		}

		switch(operator) {
			case "+" : result = a + b;
							operator = "+"; break;
			case "-" : result = max - min;
							operator = "-"; break;
			case "x" : result = a * b;
							operator = "x"; break;
			case "/" : result = a / b;
							operator = "/"; break;
			case "%" : result = a % b;
							operator = "%";  break;
			default : System.out.println("잘못된 연산자입니다.");
		}

		System.out.println("----------------");
		if(operator == "-")  System.out.printf("%d %s %d = -%d\n",
																a, operator, b,      result);
		else System.out.printf("%d %s %d = %d\n",
										a, operator, b,      result);
	}
}