/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

import java.util.Scanner;

public class NewOpDemo {
	public static void main(String[] args) {
		Scanner scan = null;		//����, �������� �ʱ�ȭ, ������������ ��������
		scan = new Scanner(System.in);
		scan = new Scanner(new File());
		String irum = null;
		irum = new String("������");		//���� new String()�Ƚᵵ ��
		System.out.printf("�̸� = %s\n", irum);

		irum = new String("������");
		System.out.printf("�̸� = %s\n", irum);

		irum = "��";		//new String("��");
		irum = irum + "����";			//irum + new String("����"); => new String("��" + "����"); ���� �ּҸ� ����
	}
}
