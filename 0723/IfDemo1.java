/*
�ۼ��� : �����
�ۼ����� : ��������
�ۼ��Ͻ� : 7�� 23��
�ۼ�ȯ�� : Windows
*/
import java.util.Scanner;

public class IfDemo1 {
	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� : ");
		number = scan.nextInt();
		
		//����1
		System.out.println("����1");
		if(number % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		if(number % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		}

		//����2
		System.out.println();
		System.out.println("����2");
		if(number % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}

		//����3
		System.out.println();
		System.out.println("����3");
		if(number % 2 == 0) {
			System.out.println("¦���Դϴ�.");	
		} else if(number % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		} else {
			System.out.println("¦���� Ȧ���� �ƴ� ���� �����ϴ�.");
		}


	}
}