/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scan = null;			//����, �������� �ʱ�ȭ, ������������ ��������
		scan = new Scanner(System.in);
		scan = new Scanner(System.in);
		String irum = null;
		irum = new String("������");		//���� new String()�Ƚᵵ ��
		System.out.printf("�̸� = %s\n", irum);

		irum = new String("������");
		System.out.printf("�̸� = %s\n", irum);

		irum = "��";
		irum = irum + "����";
		System.out.printf("�̸� = %s\n", irum);
	}
}
