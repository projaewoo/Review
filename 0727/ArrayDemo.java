/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ArrayDemo {
	public static void main(String[] args) {
		/*//Declaration
		int su;
		int [] array = null;	//int arry;�� ������ //int [] array;�� �ּҺ���
		
		//2. Creation
		array = new int[4];

		//3. Assignment
		su = 5;
		array[0] = 3; array[1] = 4; array[2] = 5; array[3] = 6; */

		//---------------------------------------------------------
		//1. Declaration
		//int [] array;
		//2. Creation & Assignment
		//array = new int[]{3, 4, 5, 6};

		//1. Declaration, Creation & Assignment  ---> initialization
		int [] array = {3, 4, 5, 6};
		//System.out.println(array[0]);
		//System.out.println(array[1]);
		//System.out.println(array[2]);
		//System.out.println(array[3]);
		array[0] = array[0] * 100;	//write

		for(int i = 0; i <=3; i++) {		//���۰� ���� ���. ���� for��
			System.out.println(array[i]);		//read
		}
	}
}