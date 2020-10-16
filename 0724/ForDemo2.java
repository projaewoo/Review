/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Scanner;

public class ForDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 단 ? : ");
		int dan = scan.nextInt();
		for(int i = 1 ; i < 10 ; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
	}
}
