/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ConstantDemo {
	public static void main(String[] args) {
		//final double PI = 3.141592;  //��� : �ʱ�ȭ �Ŀ� �� ���� �Ұ�.
		//System.out.printf("pi�� ���� %f�Դϴ�. \n", PI);
		//PI = 3.2;

		/*int max; //Ű���常 �Ķ������� �ٲ�
		max = Integer.MAX_VALUE; //Interger�� MAX_VALUEã��. Integer : Ŭ���� ����.
		System.out.println("���� ū ���� " + max);
		System.out.println("���� ū �� ���� ���� " + (max + 1)); */
	
		byte min;
		min = Byte.MIN_VALUE;
		System.out.printf("���� ���� ������ �� ���� ���� %d�Դϴ�. \n", (byte)(min-1));
		System.out.println("���� ���� ������ �� ���� ���� " + (byte)(min - 1) + "�Դϴ�.");
	}
}
