
public class InstanceInitializationBlock {
	public static void main(String[] args) {
		Car car = new Car();
		car.print();
	}
}
class Car {
// private String name = "소나타";    //명시적 초기화 (권장 x)
//	private String name;		
//	public Car(String name) {   //생성자 이용한 초기화 //member변수
//		this.name = name;
//	}
	private String name;			//초기화 블럭이 우선?
	{
		System.out.println("나는 초기화 블록");
		this.name = "카니발";
	}
	public Car() {						//생성자 이용한 초기화가 우선?
		System.out.println("나는 생성자입니다.");
		this.name = "소나타";
	}
	public void print() {
		System.out.println("name = " + this.name);
	}
}