/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		Student jimin = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.print("�й� : ");	String id = scan.nextLine();	//2020-001
		jimin.id = id;  //2020-001  //���������� �޾Ƽ� ��������� �־���
		System.out.print("�̸� : ");	String name = scan.nextLine();  //������
		jimin.name = name;  //������
		System.out.print("���� : ");	 jimin.kor = scan.nextInt();
		System.out.print("���� : ");	jimin.eng = scan.nextInt();
		System.out.print("���� : ");	jimin.math = scan.nextInt();

		jimin.total = jimin.kor + jimin.eng + jimin.math;
		jimin.avg = jimin.total / 3.;
		jimin.grade = (jimin.avg >= 90) ? 'A' :
								(jimin.avg >= 80) ? 'B' :
									(jimin.avg >= 70) ? 'C' :
										(jimin.avg >= 60) ? 'D' : 'F';

		System.out.printf("%s(%s)�� ����ǥ\n", jimin.name, jimin.id);
	}
}
