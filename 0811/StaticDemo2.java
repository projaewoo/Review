
public class StaticDemo2 {
	public static void main(String[] args) {
		Outer.Inner in = new Outer.Inner();	//staticŬ���� -> Outer�ּ� �ʿ����.
		in.print();	//member�޼ҵ� : �ּҷ� ����.
	}
}
class Outer {
	static int a = 5;			//�ٱ� Ŭ������ static����
	int b = 10;					//�ٱ� Ŭ������ member����
	static class Inner {		//����Ŭ���� : static��밡��
		int c = 100;						//����Ŭ������ member����
		static int d = 1000;			//����Ŭ������ static����
		public void print() {			//����Ŭ������ member�޼ҵ�
			System.out.println(a);	//static���� ���ٰ���
//			System.out.println(b);	//ERROR 	//����member�޼ҵ� -> �ܺ�static���� ����X
			System.out.println(c);	//����member�޼ҵ� -> ����member���� ���ٰ���	
			System.out.println(d);	//����member�޼ҵ� -> ���� static���� ���ٰ���
		}
	}
}