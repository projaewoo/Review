/*
�ۼ��� : �����
�ۼ����� : ���� ����
�ۼ��Ͻ� : 7�� 22��
�ۼ�ȯ�� : Windows
*/

import java.util.Scanner;

public class ScoreMgmt {
	public static void main(String[] args) {
		String id, name;
		int kor, eng, math, total;
		double avg;
		char grade;
		Scanner scan = new Scanner(System.in);

		System.out.print("�й� : ");	id = scan.nextLine();
		System.out.print("�̸� : ");	name = scan.nextLine();
		System.out.print("���� : ");	kor = scan.nextInt();
		System.out.print("���� : ");	eng = scan.nextInt();
		System.out.print("���� : ");	math = scan.nextInt();
		System.out.println("--------------------");
		System.out.printf("<<%s(%s)�� ����ǥ>>\n", name, id);

		total = kor + eng + math;
		avg = (kor + eng + math) / 3.0;
		grade = (avg >= 90) ? 'A' : 
						(avg >= 80) ? 'B' :
							(avg >= 70) ? 'C' :
								(avg >= 60) ? 'D' : 'F';

		System.out.printf("���� : %d, ���� : %d, ���� : %d, ���� : %d, ��� : %.2f, ���� : %c\n",
										      kor,          eng,       math,      total,             avg,          grade);    
		
	}
}
