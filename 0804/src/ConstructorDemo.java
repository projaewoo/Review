
public class ConstructorDemo {
	String name;
	int price;
	boolean flag;
	double avg;
//	public ConstructorDemo() {			//default constructor	//public, 메소드 이름 = 클래스 이름
//		this.name = null;    this.price = 0;  this.flag = false;
//		this.avg = 0.0;
//	}
	public ConstructorDemo() {		//default constructor's overriding (재정의)
		this.name = "한지민";    this.price = 0;  this.flag = false;
		this.avg = 0.0;
	}
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();		//new는 디폴트 생성자를 자동으로 call.
//		System.out.println("name = " + cd.name);		//member변수는 주소로 접근
//		System.out.println("price = " + cd.price);
//		System.out.println("flag =" + cd.flag);
//		System.out.println("avg = " + cd.avg);			//기본 생성자 (ConstructorDemo())가 다 초기화
//		String str = new String();  		//API에서 String클래스에 기본 생성자 제공해줘서 사용가능
		System.out.println(cd.name);
		
	}
}
