
public class InstanceInitializationBlock {
	public static void main(String[] args) {
		Car car = new Car();
		car.print();
	}
}
class Car {
// private String name = "�ҳ�Ÿ";    //����� �ʱ�ȭ (���� x)
//	private String name;		
//	public Car(String name) {   //������ �̿��� �ʱ�ȭ //member����
//		this.name = name;
//	}
	private String name;			//�ʱ�ȭ ���� �켱?
	{
		System.out.println("���� �ʱ�ȭ ���");
		this.name = "ī�Ϲ�";
	}
	public Car() {						//������ �̿��� �ʱ�ȭ�� �켱?
		System.out.println("���� �������Դϴ�.");
		this.name = "�ҳ�Ÿ";
	}
	public void print() {
		System.out.println("name = " + this.name);
	}
}