
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Parent p = new Child();		
		p.print();		//�θ��ּ�.�ڽ��� �����ǵ� �޼ҵ� = ������
	}
}
class Parent {				//Exception ����, ���� : �ڽ� < �θ�
	public void print() throws Exception { System.out.println("���� �θ��� �޼ҵ�"); }
}
class Child extends Parent {
	@Override									//Checked Exception -> try-catch�����
	public void print() throws RuntimeException { System.out.println("���� �ڽ��� �޼ҵ�"); }
}												