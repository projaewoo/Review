
public class LambdaDemo {
	public static void main(String[] args) {
		
		//�͸�Ŭ����
//		MyInterface mi = new MyInterface() {
//			@Override
//			public int calculate(int a, int b) {
//				return a + b;
//			}
//		};				//5~10���� �ѹ��� //���� ; �ʼ�.
//		int result = mi.calculate(5, 9);
//		System.out.println("result = " + result);
		
		//���ٽ� = �͸� �޼ҵ�.		//�޼ҵ� �̸� ����.			//���ٽ� : (int a, int b) -> a * b
		MyInterface mi = (int a, int b) -> a * b;				//int�� �Ǵܵ� ���, parameter�ȿ� int�� ��������.
		int result = mi.calculate(34, 12);
		System.out.println("result = " + result);
		
	}
}
