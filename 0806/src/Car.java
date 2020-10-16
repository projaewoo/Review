//import java.lang.Object;		//생략되어있음

public class Car /* extends Object */ {
	private int speed;  //private로 선언하면 자신, 자식도 접근 불가
	private int price;			//private : 상속x
	public static String name;
	
	public Car(int speed, int price) {
		this.speed = speed;
		this.price = price;
//		this.name = name;
	}

	public void run() {
		System.out.println(name + "(" + price +")이(가)" + speed + "Km의 속도로 주행합니다.");
	}
	
}
