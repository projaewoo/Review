/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

import java.util.Scanner;

public class exercise1 {
	public static void main(String[] args) {

		int height, pit;
		double inch;
		Scanner scan = new Scanner(System.in);

		System.out.print("Ű : ");		height = scan.nextInt();
		inch = height / 2.54;
		pit = (int)(inch / 12);

		System.out.printf("%dcm�� %d��Ʈ, %.2f��ġ�Դϴ�.\n", height, pit, inch);
		

		final double PI = 3.14;
		double r, roundHeight, v;
		
		System.out.print("����� �ظ��� ������ : ");		r = scan.nextInt();
		System.out.print("����� ���� : ");					roundHeight = scan.nextInt();

		v = PI * r * r * roundHeight;

		System.out.println("������� ���Ǵ� " + v + "�Դϴ�.");
	}
}
