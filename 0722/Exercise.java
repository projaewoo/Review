/*
�ۼ��� : �����
�ۼ����� : ��������
�ۼ��Ͻ� : 7�� 22��
�ۼ�ȯ�� : Windows
*/

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		
	//1�� ���� ���� ���� �Ž����� ���
	int cost, input, rost;
	Scanner scan = new Scanner(System.in);
	System.out.print("��ǰ �ݾ��� �Է��ϼ��� : ");
	cost = scan.nextInt();
	System.out.print("���� ���� �Է��ϼ��� : ");
	input = scan.nextInt();

	rost = input - cost;
	System.out.printf("�Ž������� %d�� �Դϴ�.\n", rost);



	//2������ �� ���� ���� �Է¹޾�, �ú��� ������ ȯ��
	int time, hours, minutes, second;
	System.out.print("�ð��� �� ������ �Է��Ͻÿ� : ");
	time = scan.nextInt();

	hours = time / 3600;
	minutes = (time % 3600) / 60;
	second = time % 60;
	//second = time - (hours * 3600 + minutes * 60);

	System.out.printf("%d�ʴ� %d�ð� %d�� %d�� �Դϴ�.\n",
								time,    hours, minutes, second);



	//3������ ��ǰ���� �Է�, �� ����� ���, ������ �ݾ� ǥ��
	int money, fiftyThous, tenThous, fiveThous, oneThous, penny;
	System.out.print("��ǰ������ �Է��ϼ��� : ");
	money = scan.nextInt();
	
	fiftyThous = money / 50000;
	tenThous = (money % 50000) / 10000;
	fiveThous = (money % 10000) / 5000;
	oneThous = (money % 5000) / 1000;
	penny = money % (oneThous * 1000);

	System.out.printf("%d���� 5������ %d��, 1������ %d��, 5õ���� %d��, 1õ���� %d���� �����ϰ� %d���� �����ϴ�.\n",
								money,     fiftyThous,       tenThous,           fiveThous,   oneThous,          penny);
	
	}
}
