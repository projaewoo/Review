
public class LambdaDemo {
	public static void main(String[] args) {
		//1. �������̽��� ���� = ���ٽ�  //���������� ���ٽ� ����ϱ�
//		Comparable com = (a, b) -> b - a;
		//2. ���ٽ��� �Ű������� ������ 
//		myMethod((a, b) -> b - a);			//=myMethod(com);�� ���� //com : 5��
		//3.return type�� ���ٽ� ����ϱ�
		Comparable com = myMethod1();		//���ٽ� ���ϵǸ� Comparable������ ��ȯ�ǹǷ� com���� ����.
		System.out.println(com.compareTo(5, 9));
	}
	static void myMethod(Comparable comp) {
		int a = 5, b = 9;
		int result = comp.compareTo(a, b);
		System.out.println("result = " + result);
	}
	static Comparable myMethod1() {
		//3. ���ٽ����� �����ϱ�
		return (a, b) -> b - a;		//���ٽ��� Comparable�̾ ����Ÿ�԰� ��ġ.
	}
}
@FunctionalInterface
interface Comparable {		//���Ƿ� ������ Functional�������̽�
	int compareTo(int a, int b);
}

/* interface Comparable <T> {		
 * 		int compareTo(T o);		//�޼ҵ� 1���ۿ� ��� ���� ��밡��		//�׷��� ������ ���ؼ� fuctional �������̽� �ƴ�.	//API�� �׷��� �Ƚ�����
 * }
 */
