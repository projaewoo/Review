/*
�ۼ��� : �����
�ۼ����� : ��������
�ۼ��Ͻ� : 7�� 23��
�ۼ�ȯ�� : Windows
*/
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		String name, tti = "\0";
		int year, age;
		Scanner scan = new Scanner(System.in);

		System.out.print("�̸� : ");	name = scan.nextLine();
		System.out.print("����⵵ : ");	year = scan.nextInt();

		age = 2020 - year + 1;
		
		switch(year % 12) {
			case 0 : tti = "������"; break;
			case 1 : tti = "��"; break;
			case 2 : tti = "��"; break;
			case 3 : tti = "����"; break;
			case 4 : tti = "��"; break;
			case 5 : tti = "��"; break;
			case 6 : tti = "ȣ����"; break;
			case 7 : tti = "�䳢"; break;
			case 8 : tti = "��"; break;
			case 9 : tti = "��"; break;
			case 10 : tti = "��"; break;
			case 11 : tti = "��";
		}

		System.out.printf("%s���� %d���̰�, %s���Դϴ�.\n",
									name,   age,         tti);

	}
}
