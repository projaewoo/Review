
public class DestructorDemo {
	 public static void main(String[] args) {
		Box box = new Box();			//Box()��� �޼ҵ� ȣ�� //������ = �޼ҵ�
		box = null;		//�ּ� ������		//grabage�ݷ����� ����� ��
		System.gc();		//grabage �ݷ��� ����� ȣ��	//grabage�ݷ��Ͱ� finailze()ȣ��		
	}																	//finalize()������ �׳� grabage����
}
class Box {
	public Box() {			//constructor
		System.out.println("��� ��ü�� �����ƽ��ϴ�.");
	}
	protected void finalize() {		//destructor	//�Ҹ��Ҷ� ȣ��
		System.out.println("��� ��ü�� �Ҹ�ƽ��ϴ�.");
	}
}