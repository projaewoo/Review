/*
�ۼ��� : �����
�ۼ����� : ��������
�ۼ��Ͻ� : 7�� 23��
�ۼ�ȯ�� : Windows
*/
import java.util.Scanner;

public class IfDemo3 {
	public static void main(String[] args) {
		int year;
		Scanner scan = new Scanner(System.in);

		System.out.print("�⵵ : ");
		year = scan.nextInt();

		if(year % 400 == 0 && year %100 == 0 && year % 4 == 0) {
			System.out.printf("%d���� �����Դϴ�.\n", year);
		} else {
			System.out.printf("%d���� ������ �ƴմϴ�.\n", year);
		}

	}
}
