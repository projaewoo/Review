
public class HelloWorld4 {
	public static void main(String[] args) {
		System.out.println(Test1.str);		//class������ class�̸����� ����
										//Test ts = new Test(); ���� ���ص� class ����(static����)�� �̹� �����Ǿ�����
		System.out.println(Test2.str);		//class���� = static����
															//�ּ� ���� class�̸����� ã�ư� �� ����
	}
}
class Test1 {
	static String str = "Hello, World";		//class variable (class�̸����� ����)
															//
}
class Test2 {
	static String str = "������";		//class variable (class�̸����� ����)
															//
}