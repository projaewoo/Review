/*
 * 2. �Ű������� lambda�� ���		(���ٽ��� ����ó�� ���)
 */

public class LambdaDemo1 {
	public static void main(String[] args) {
		//1. �������̽��� ������ ���ٽ� ����.
//		PrintString lambdaStr = s -> System.out.println(s);
						//lambdaStr : PrintString�� ��������	//���� myMethod�� parameter�� �� �� ����
		
		//2. �Ű������� lambda�� ���
//		myMethod(s -> System.out.println(s));	//= myMethod(lambdaStr);	//���ٽ��� �Ű������� �ް�, �� ���ٽ��� lambdaStr�� �Ǿ 16�� showString ����.
		
//		
//		PrintString ps = returnString();
//		ps.showString("Hello");
//		3. ����Ÿ������ lambda�� ���  (���ٽ��� ����ó�� ���)
		//15,16���� 3�� �������.
		returnString().showString("Hello");		//returnString() =  s -> System.out.println(s + ", from Lambda Experssion") //�ڿ� showString()���̸� "Hello, from Lambda Experssion"���.
		
	}
	static void myMethod(PrintString lambdaStr) {
//		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Wolrd");
	}
//	3. ����Ÿ������ lambda�� ���  (���ٽ��� ����ó�� ���)
	static PrintString returnString() {		//���� Ÿ�� : PrintString : ���ٽ�
		return s -> System.out.println(s + ", from Lambda Experssion");
	}
}
@FunctionalInterface			//�߻�޼ҵ�� ���� �Ѱ���, ��! Java1.8 ���ķ� static�޼ҵ�, default�޼ҵ� ���� ���� ���� �� �� ����
interface PrintString {
	void showString(String s1);
}