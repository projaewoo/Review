/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] array;   //����
		array = new int[4];	//���� // �ʱⰪ : 0, 0, 0, 0 //�迭�� �ּҸ� array�� ����
		System.out.print("���� : ");	array[0] = scan.nextInt();
		System.out.print("���� : ");	array[1] = scan.nextInt();
		System.out.print("���� : ");	array[2] = scan.nextInt();
		//array[3] = array[0] + array[1] + array[2];
		for(int i = 0; i < array.length - 1; i++) {	//��ĭ �� ������
			array[3] += array[i];
		}
		System.out.printf("���� = %d, ���� = %d, ���� = %d, ���� = %d, ��� = %.1f\n",
										array[0], array[1],     array[2],        array[3],       array[3] / 3.);
	}
}
