
public class FinalDemo1 {
	public static void main(String[] args) {
		Sub sub = new Sub();		//����� �ڽ� �ּҷ� ����
		sub.print();
	}
}
class Super {
	public final void print() {			//final�޼ҵ� : ������ �ȵǴ� �޼ҵ�
		System.out.println("���� �θ��� �޼ҵ�");
	}
}
class Sub extends Super {
	@Override
	public void print() {
		System.out.println("���� �ڽ��� �޼ҵ�");
	}
}