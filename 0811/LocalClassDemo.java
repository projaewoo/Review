

public class LocalClassDemo {
	public static void main(String[] args) {
	
	}
}
class Outer2 {
	int a = 5;				//�ٱ�Ŭ������ member����
	static int b = 10;		//�ٱ�Ŭ������ static����
	public void print() {		//�ٱ�Ŭ������ member�޼ҵ�
		int c = 50;				//local����		//print()�޼ҵ� ȣ���ؾ� ������
		class Inner2 {			//localŬ���� : �޼ҵ� �ȿ� ��ġ	//print()�޼ҵ� ȣ���ؾ� ������
			public void display() {		//localŬ������ member�޼ҵ�
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
		}
		Inner2 in = new Inner2();	//print()�޼ҵ� ȣ���ؾ� �۵�	//�޼ҵ� �ȿ��� ���������� ����
		in.display();							//���� : 13~17��(=localŬ������ �����ֱ�)
	}
}
