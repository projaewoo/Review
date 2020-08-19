/*���ٽ� Ȱ��
 * 1. �������̽��� ������ lambda�� ����
 */
public class LambdaDemo {
	public static void main(String[] args) {
		//�͸�Ŭ����
//		MyInterface mi = new MyInterface() {
//			@Override
//			public void myConcat(String s1, String s2) {
//				System.out.println(s1 + ", " + s2);
//			}
//		};
//		mi.myConcat("Hello", "Wolrd");
		
		//10���� ���ٽ����� ��ȯ.
		//1. �������̽��� ������ ���ٽ� ����.
		MyInterface mi = (s1, s2) -> System.out.println(s1 + ", " + s2);
		mi.myConcat("Hello", "Wolrd");
		
		
		
	}
}

//�� string�̾��ִ� �޼ҵ� ����
@FunctionalInterface				//������ �� ���� �߻�޼ҵ常 ������ ����.
interface MyInterface {
	void myConcat(String s1, String s2);
}