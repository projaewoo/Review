/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {

		//1�� ����  cm Ű�� ��Ʈ�� ��ġ�� ��ȯ�ϴ� ���α׷�
		int height, pit;
		double inch;
		Scanner scan = new Scanner(System.in);

		System.out.print("Ű : ");	height = scan.nextInt();
		inch = height / 2.54;
		pit = (int)(inch / 12);

		System.out.printf("%dcm�� %d��Ʈ, %.2f��ġ �Դϴ�.\n", height, pit, inch);



		System.out.println("-------------------------");
		//2�� ����  ������� ���Ǹ� ���ϴ� ���α׷�
		final double PI = 3.14;
		double r, roundHeight;
		double v;

		System.out.print("����� �ظ��� ������ : ");	r = scan.nextInt();
		System.out.print("����� ���� : ");				roundHeight = scan.nextInt();
		v = PI * r * r * roundHeight;

		System.out.printf("������� ���Ǵ� %.2f�Դϴ�.\n", v);
		System.out.println("������� ���Ǵ� " + v + "�Դϴ�.");



		System.out.println("-------------------------");
		//3�� ����  BMI���� ���ϴ� ���α׷�
		double bmiHeight, bmiWeight, bmiDegree;
		
		System.out.print("Ű : ");		bmiHeight = scan.nextDouble();
		System.out.print("������ : ");			bmiWeight = scan.nextDouble();
		bmiDegree = (bmiWeight /  ((bmiHeight/100)*(bmiHeight/100)) );

		System.out.printf("������ BMI������ %.2f�Դϴ�.", bmiDegree);
	}
}
