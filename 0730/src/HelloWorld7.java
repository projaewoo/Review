

public class HelloWorld7 {
	public static void main(String[] args) {
		Demo d = new Demo();		//Demo�� �޸� heap�� �ö󰡴� ���ÿ� member method�� ����
		d.display();			//member method�� �ּҸ� ���� ����		
	}
}

class Demo {		//�ٸ� class�� display()�޼��尡 ����
	void display() {			//member method (instance method) 
		System.out.println("Hello, World");		// instance = (�޸𸮿� �÷��� ������)
	}
}