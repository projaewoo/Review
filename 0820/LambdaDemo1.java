
public class LambdaDemo1 {
	public static void main(String[] args) {
		//���ٽ� ��� ���Ҷ� (�͸�Ŭ����)
//		MyInterface mi = new MyInterface() {
//			@Override
//			public void saySomething() {
//				System.out.println("Hello, World");
//			}
//		};
//		mi.saySomething();
		
		//���ٽ� ����ϸ� (�ڵ� ����) //1�� ��� : MyInterface�� �Ķ����X , ���ϰ� X
//		MyInterface mi = () -> System.out.println("Hello, World");
//		mi.saySomething();
		
		//2�� ��� : MyInterface�� �Ķ����X , ���ϰ� O
//		MyInterface mi = () -> {
//				System.out.println("Hello, World");	//���� 2���� {} �����Ұ�
//				return 100;
//			};
//		int result = mi.saySomething();
		
		//3�� ��� : MyInterface�� parameter O, ���ϰ� O
//		MyInterface mi = name -> {			//()���� ������Ÿ�� �߷а����ϸ� ������Ÿ�� ����.	//�Ű����� 1���̸� ()����
//			System.out.println("Your name is" + name + ".");	//���� 2���� {} �����Ұ�
//			return 100;
//		};
//		int result = mi.saySomething("Sujan");
		
		//4�� ��� : MyInterface�� �Ű����� 2�� �̻�, ���ϰ� O
		MyInterface mi = (a, b) -> a + b; 
		int result = mi.add(5, 9);
		
		
	}
}
@FunctionalInterface		//�� �Ѱ��� �߻�޼ҵ常 ����. -> ���ٽ� ��밡��
interface MyInterface {
//	int saySomething(String name);	//3�� ���
	int add(int a, int b);						//4�� ���
}