/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Arrays;

public class BubbleSorting {
	public static void main(String[] args) {
		//��������
		int [] array = {5, 8, 2, 1, 4, 6, 2, 3, 7, 9};  //n - 1= 9�� ���ƾ���
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		for(int i = 0 ; i < array.length -1 ; i++) {  //9�� ����
			for(int j = 0; j < array.length - 1 /*- i */; j++) {		//�� �������� ���� Ŀ�� i��ŭ �� ����
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;		//Swaping�˰���
				}
			}
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(array));
	}
}
