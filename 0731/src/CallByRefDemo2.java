import java.util.Arrays;
import java.util.Scanner;

//�Է°��� ���������� ���� �ڵ�
public class CallByRefDemo2 {
	public static void main(String[] args) {
		int [] array = new int[1000];
		int su = input(array); 
		output(array, su);		//output�� int�迭 �����Ƿ� int�迭�� �Ѱ���
	}
	static int input(int [] array) {			// 
		Scanner scan = new Scanner(System.in);		//Scanner�� �ʿ��� ������ �����ص� ��
		int su = 0;
		int i = 0;			//while���� �ʱⰪ �ۿ�
		System.out.println("���� �Է�(0�� ����) : ");
		while((su = scan.nextInt()) != 0 && i < 1000) {
			array[i++] = su;
		}
		return i;			//���° ����� ä���ٴ� int�� �ѱ�
	}	//
	static void output(int [] array, int su) {  
		for(int i = 0 ; i < su ; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
