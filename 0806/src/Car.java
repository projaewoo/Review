//import java.lang.Object;		//�����Ǿ�����

public class Car /* extends Object */ {
	private int speed;  //private�� �����ϸ� �ڽ�, �ڽĵ� ���� �Ұ�
	private int price;			//private : ���x
	public static String name;
	
	public Car(int speed, int price) {
		this.speed = speed;
		this.price = price;
//		this.name = name;
	}

	public void run() {
		System.out.println(name + "(" + price +")��(��)" + speed + "Km�� �ӵ��� �����մϴ�.");
	}
	
}
