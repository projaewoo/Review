/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class IfDemo8 {
	public static void main(String[] args) {
		/*double avg = 89.12345678;			//�Ҽ��� ��°�ڸ����� �ݿø��ϴ� ���
		avg *= 10;		//891.2345678
		double result = Math.round(avg);  //891 //round�� �Ҽ��� ù°�ڸ����� �ݿø��ؼ�
		result /= 10;
		System.out.println("result = " + result);
	} */

		double avg = 89.123;			//�Ҽ��� ��°�ڸ����� �ݿø��ϴ� ���
		avg *= 100;						//8912.3
		double result = Math.round(avg);	//8912 //round�� �Ҽ��� ù°�ڸ����� �ݿø�
		result /= 100;						//89.12
		System.out.println("result = " + result);
}
}