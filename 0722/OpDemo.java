/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class OpDemo {
	public static void main(String[] args) {
		int su = -128;
		int result = ~su;		//su�� 1�� ����

		int test = su;

		System.out.printf("su = %d, result = %s\n",
											su,   Integer.toBinaryString(result));
		
		System.out.printf("su = %d, result = %s\n", 
										su,	Integer.toBinaryString(su));	//����

		boolean flag = true;
		boolean answer = !flag;

		System.out.printf("result = %d, result = %s\n", 
										result,	Integer.toBinaryString(result));
	}
}
