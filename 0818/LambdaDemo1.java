
public class LambdaDemo1 {
	public static void main(String[] args) {
		
		//�͸� Ŭ����
//		Say say = new Say() {
//			@Override
//			public void saySomething() {
//				System.out.println("Hello, Wolrd");
//				System.out.println("Nice to meet you");
//			}
//		};
//		say.saySomething();
		
		//���ٽ�	(�޼ҵ� �̸��� ����)
//		Say say = () -> {
//				System.out.println("Hello, Wolrd");
//				System.out.println("Nice to meet you");
//			};			//15~18���� �� ����
//		say.saySomething();
		
		//PersonŬ����, �͸�Ŭ���� �̿� 	//5���� ����� ����.
//		Person chulsu = new Person();
//		chulsu.greeting(new Say() {		//�͸� Ŭ����		//parameter �ȿ� Ŭ���� ����. -> ���� ��� �ȹ޾Ƶ� �������̽��� �޼ҵ� ������ ����.
//			@Override
//			public void saySomething() {
//				System.out.println("Hello, World");
//				System.out.println("Nice to meet you!!");
//			}
//		});
		
		//22�� ����� ���ٽ�����			//���� : �ڵ� ����
		Person chulsu = new Person();
		chulsu.greeting( () -> {					//greeting()�� parameter�ȿ� Say�� say ���;���.	-> �����Ϸ��� �� �޼ҵ�� �������̽��� saySomething()�̶�� �Ǵ�.
			System.out.println("Hello, World");
			System.out.println("Nice to meet you!!");
			}
		);
	}
}
class Person {
	public void greeting(Say say) {			//Say�� �ڽ��� parameter�� ����.
		say.saySomething();
	}

}
@FunctionalInterface		//�޼ҵ尡 1���ۿ� ������ ����
interface Say {		
	void saySomething();
}
