/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
/*
	��������
*/
import java.util.Scanner;

public class LocalVariableDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int yearOfBorn;   //��������

		System.out.print("������ ����⵵�� ? : ");
		yearOfBorn = scan.nextInt();	//�̶� �ʱ�ȭ
		
		int age = 2020 - yearOfBorn + 1;		//��������
		System.out.println("������ ���̴� " + age + "���̱���.");






		/*int age = 34;
		{
			int age;
			System.out.println("age = " + age);
		}
		System.out.println("age = " + age); */


	}
}
