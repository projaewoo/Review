/*
�ۼ��� : �����
�ۼ����� : ��������
�ۼ��Ͻ� : 7�� 23��
�ۼ�ȯ�� : Windows
*/
import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		String name, degree;
		double cmHeight, mHeight, weight, bmi; 
		Scanner scan = new Scanner(System.in);

		System.out.print("�̸� : ");	name = scan.nextLine();
		System.out.print("Ű : ");		cmHeight = scan.nextDouble();

		System.out.print("������ : "); weight = scan.nextDouble();
		System.out.println("---------------");
		
		mHeight = cmHeight / 100;
		bmi = weight / (mHeight * mHeight);
		if(bmi >= 40) {
			degree = "�� ��";
		} else if(bmi >= 35) {
			degree = "�ߵ ��";
		} else if(bmi >= 30) {
			degree = "�浵 ��";
		} else if(bmi >= 25) {
			degree = "��ü��";
		} else if(bmi >= 18.5) {
			degree = "����";
		} else {
			degree = "��ü��";
		}
		
		System.out.printf("%s���� BMI������ %.2f�̰�, %s�Դϴ�.",
									name,                 bmi,         degree);

	}
}
