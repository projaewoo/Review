/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class OpDemo5 {
	public static void main(String[] args) {
		//���� ������ ���� ������ �� : +, -, ~�� ����� ������ int
		//byte a = 5;
		//byte result = ~a;		// Error. //���� ������ ���� ������ �� : +, -, ~�� ����� ������ int
		//int result = -a;
		//System.out.println("result = " + result);

		//���׿����� �̿�� ������ �� : ���׿���(���, �̵�, ����, ��Ʈ, ��)�� ����� ������ int �̻�.
		//byte a = 5;
		//byte b = 9;
		//byte sum = a + b;		//+������ ��������Ƿ� int�̻�. //Error.
		
		int a = 5, b = 9, x = 100;
		if(a < x || ++b > 20) {		//
			System.out.println("��");
		}else {
			System.out.println("����");
		}
		System.out.println("b = " + b);

		if( a < x | ++b > 20) {
			System.out.println("��");
		}else {
			System.out.println("����");
		}
		System.out.println("b = " + b);
	}
}
