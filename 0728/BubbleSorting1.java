/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Scanner;
import java.util.Arrays;		//�迭 ����� ����

public class BubbleSorting1 {
	public static void main(String[] args) {
		int [] array = new int[1000];		//�ִ��� ���� �������� //�ʱ�ȭ 0��
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���. �� 0�� ����");
		int	 idx = 0;			//while�� ����, �ʱ�ġ �ۿ�
		while(true) {
			int su = scan.nextInt();
			if(su == 0) break;
			array[idx++] = su;		//�����ϰ� ++
		}
		System.out.println("Before Sorting");
		for(int i = 0 ; i < idx ; i++) {			//i�� ���� ��
			System.out.printf("%4d", array[i]);
		}
		//��������
		for(int i = 0; i < idx -1 ; i++) {			//idx : 0 ~ 2 // �迭��� : 3��
			for(int j = 0; j < idx - 1; j++) {			//0��°�� 1��° �� : 1�� �� //1��°�� 2��° �� : 2�� �� //�� 2�� �� = 0~1�� �� = 0~ idx-1(=2-1)�� ��
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int i = 0 ; i < idx ; i++) {			
			System.out.printf("%4d", array[i]);
		}


	}
}
