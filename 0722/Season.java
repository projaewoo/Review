/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		String season, flower;
		Scanner scan = new Scanner(System.in);
	
		System.out.println("�����ϴ� ���� (����� �Է�) : ");
		season = scan.nextLine();

		flower = (season.equals("spring")) ? "������, ���޷�" : 
						(season.equals("summer")) ? "���, ��ī�þ�" :
							(season.equals("fall")) ? "����, �ڽ���" : "����, ��ȭ";

		System.out.printf("���� : %s\n�� : %s", season, flower);
	}
}
