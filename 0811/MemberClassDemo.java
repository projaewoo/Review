

public class MemberClassDemo {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		//out.a		//ERROR 	//member���� : �ݵ�� Ŭ������ �ּ� �ʿ�
		Outer1.Inner1 in = out.new Inner1();
		//�ܺ�Ŭ���� �ּ�(Outer1)�� ����.	//������ ����ؼ� new
		in.print();
	}
}
class Outer1 {
	int a = 5;					//�ٱ�Ŭ���� member����
	static int b = 10;		//�ٱ�Ŭ���� static����
	class Inner1 {			//����memberŬ���� : �ܺ�Ŭ���� �ּҷ� ����
		int c = 100;			
//		static int d = 10000;				//����memberŬ���� : static���� ������
//		public static void print() {}	//����memberŬ���� : static�޼ҵ� ������.
		
		public void print() {				//����memberŬ������ member�޼ҵ� : Inner1�ּҷ� ����
			System.out.println(a);		//���ܺ�member���� ���ٰ���
			System.out.println(b);		//����member -> �ܺ�static : ���ٰ���
			System.out.println(c);		//����member���� ���ٰ���
		}
	}
}