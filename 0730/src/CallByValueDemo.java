
public class CallByValueDemo {
	public static void main(String[] args) {
		int a = 5, b = 9;
		System.out.println("Before Change");
		System.out.println("a = " + a + ", b = " + b);
		//change(a);
//		swap(a, b);
		System.out.println("After Change");
		System.out.println("a = " + a + ", b = " + b);
	}								//��ȣ �ȿ� �ƹ��͵� ������ call by name
//	static void change(int su) {			//int su = 5, call by value (5��� ���� �־) (�� ����)
//		su = su * 1000;
//		System.out.println("In the Change");
//		System.out.println("su = " + su);
//	}
	
	static void swap(int c, int d) {
		int temp = c;
		c = d;
		d = temp;
		System.out.println("In the Swap");
		System.out.println("c = " + c + ", d = " + d);
//		return c, d;			//return�� 2�� �̻� �Ұ�
	}
}
