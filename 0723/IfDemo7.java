/*
�ۼ��� : �����
�ۼ����� : ��������
�ۼ��Ͻ� : 7�� 23��
�ۼ�ȯ�� : Windows
*/
import java.util.Scanner;

public class IfDemo7 {
	public static void main(String[] args) {
		int first, second, third, max, min;
		Scanner scan = new Scanner(System.in);

		System.out.print("ù°�� : ");		first = scan.nextInt();
		System.out.print("��°�� : ");		second = scan.nextInt();
		System.out.print("��°�� : ");		third = scan.nextInt();

		if(first > second) max = first;
		else max = second;
		if(max < third) max = third;

		System.out.println("---------------");
		System.out.printf("%d�� %d�� %d�߿� ���� ū ���� %d�Դϴ�.\n",
									first,   second, third,               max);
		
		if(first > second) min = second;
		else min = first;
		if(min > third) min = third;
		System.out.println("---------------");
		System.out.printf("%d�� %d�� %d�߿� ���� ���� ���� %d�Դϴ�.\n",
									first,   second, third,               min);
		
	}
}
