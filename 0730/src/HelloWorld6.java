
public class HelloWorld6 {
	public static void main(String[] args) {
		display();		//���� class�̸� Ŭ���� �̸� ��������
		HelloWorld6.display();	//���� class method ȣ����
				//class method�̹Ƿ� class�̸����� ����
	}
	static void display() {		//method�� �����, class method
		System.out.println("Hello, World");							//method�� ����
	}
}
