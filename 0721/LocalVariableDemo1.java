/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Scanner;

public class LocalVariableDemo1 {
	public static void main(String[] args) {
		double height;	//��������
		Scanner scan;   //��������, ����
		scan = new Scanner(System.in);	//�������� ����
		System.out.print("������ Ű�� ? ");		height = scan.nextDouble();		//�ʱ�ȭ

		double inch = height / 2.54;	//��������  //��������� (���׿�����)
		double fit = inch / 12;			//��������
		System.out.printf("%.1fcm�� %.1f��Ʈ�̰�, %.2f��ġ�Դϴ�.\n", 
										height,      fit,					inch);

	}
}
