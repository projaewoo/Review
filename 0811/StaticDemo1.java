//� ���� ���� ���� �޸𸮿� �ö��??

public class StaticDemo1 {
//	private static int count = getCount();				//a���.1��(static����), a���.3��(count�� 100�Ѱ���)
	
//	private static int getCount() {						//a���.2��(static������ getCount()ȣ��)
//		System.out.println("���� static�޼ҵ�");
//		return 100;
//	}
	
	//�ڹٿ��� static�ʱ�ȭ ���
	private static int count;								//b���.1��
	static {														//b���.2�� -> mainȣ��
		System.out.println("���� static���");
		count = 100;
	}
	
	public static void main(String[] args) {			//a���.4��   //b���.3��
		System.out.println("���� ���� �޼ҵ�");
		System.out.println("count = " + count);
	}
	
	
	
}
