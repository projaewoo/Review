/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		String id, name;
		int koreanScore, englishScore, mathScore, total;
		double average;
		Scanner scan = new Scanner(System.in);

		System.out.print("�й� : ");
		id = scan.nextLine();

		System.out.print("�̸� : ");
		name = scan.nextLine();

		System.out.print("���� ���� : ");
		koreanScore = scan.nextInt();

		System.out.print("���� ���� : ");
		englishScore = scan.nextInt();

		System.out.print("���� ���� : ");
		mathScore = scan.nextInt();

		total = koreanScore + englishScore + mathScore;
		average = total / 3.;

		System.out.println();
		System.out.printf("�й� : %s\n�̸� : %s\n����� : %d\n����� : %d\n���м��� : %d\n",
			                                   id,             name,   koreanScore,    englishScore,   mathScore);
		System.out.printf("���� : %d\n��� : %.1f", total, average);
	}
}
