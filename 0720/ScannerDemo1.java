/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

import java.util.Scanner;			//utilī�װ��� Scanner�� ������.

public class ScannerDemo1 {
	public static void main(String[] args) {
		/*System.out.print("������ ���̴� ? ");
		Scanner scan; //1�ܰ� ����
		scan = new Scanner(System.in);  //2�ܰ� �Ҵ�
		int age;  //����
		age= scan.nextInt();	 //�Է¹��ۿ��� �� ���� ������ �о���̴� �Լ�.
		System.out.println("������ ���̴� " + age + "���̱���");
		System.out.printf("������ ���̴� %d���̱���.\n", age);  */

		/*double height;  //1. ������ ����
		double weight;
		
		Scanner scan;   //1. �ּҺ��� ����
		scan = new Scanner(System.in);   //�ּ� �Ҵ�

		System.out.print("Ű : ");
		height = scan.nextDouble();   //�� �Ҵ�

		System.out.print("������ : ");
		weight = scan.nextDouble();  //�� �Ҵ�  //height, weight : �� �����̹Ƿ� ���� �Ҵ�

		System.out.printf("Ű = %.1fcm\t������ = %.1fKg\n", height, weight);  */

		String name;   //�ּ� ���� ����
		Scanner scan;   //�ּ� ���� ����  //�� �� Ŭ��������
		
		scan = new Scanner(System.in);   //�ּ� ���� �Ҵ�
		System.out.print("���� : ");
		name = scan.nextLine();   //�ּ� ���� �Ҵ�

		System.out.println("������ �̸��� " + name + " �̱���.");

	}
}
