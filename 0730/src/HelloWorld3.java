
public class HelloWorld3 {
	public static void main(String[] args) {
		//System.out.println(str);		//class �޶� ��ã��
		Test t = new Test();
		System.out.println(t.str);		//��������� �ּҷ� ����
	}
}
class Test {
	String str = "Hello, World";		//member variable (�׻� �ּҷ� ����) //class�� �ٸ�
}