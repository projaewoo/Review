/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ForDemo {
	public static void main(String[] args) {
		
		int count = 0;
		long factory = 1;
		for(int i = 1 ; i < 101 ; i++) {
			//System.out.print(a + "     ");   //for�� ������ ���� ��� �ؾ��� �۾�
			//factory *= i;		//1 * 2 * 3 * ... * 10
			if(i % 5 == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n1���� 100������ ���� �� 5�� ����� ������ " + count + "�Դϴ�.");

	}
}