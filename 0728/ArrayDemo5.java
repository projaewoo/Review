/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ArrayDemo5{
	public static void main(String[] args) {
		String [] array = new String[]{new String("������"), 
													new String("������"),
													new String("������"),
														"ȫ����"};
		for(int i = 0 ; i < array.length ; i++) {
			System.out.printf("array[%d] = %s%n", i, array[i]);
		}
		
	}
}
