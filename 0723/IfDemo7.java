/*
작성자 : 정재우
작성목적 : 연습문제
작성일시 : 7월 23일
작성환경 : Windows
*/
import java.util.Scanner;

public class IfDemo7 {
	public static void main(String[] args) {
		int first, second, third, max, min;
		Scanner scan = new Scanner(System.in);

		System.out.print("첫째수 : ");		first = scan.nextInt();
		System.out.print("둘째수 : ");		second = scan.nextInt();
		System.out.print("셋째수 : ");		third = scan.nextInt();

		if(first > second) max = first;
		else max = second;
		if(max < third) max = third;

		System.out.println("---------------");
		System.out.printf("%d과 %d와 %d중에 가장 큰 수는 %d입니다.\n",
									first,   second, third,               max);
		
		if(first > second) min = second;
		else min = first;
		if(min > third) min = third;
		System.out.println("---------------");
		System.out.printf("%d과 %d와 %d중에 가장 작은 수는 %d입니다.\n",
									first,   second, third,               min);
		
	}
}
