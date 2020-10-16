/*
 * this용법
 * 1. this. : '나의', 나의 멤버변수와 멤버 메소드를 명시적으로 지칭하고자 할 때
 * 2. this
 * 3. this()
 * 
 * super용법
 * 1. super. : '부모의', 부모의 (멤버변수)와 멤버메소드를 명시적으로 지칭하고자 할 때
 * 2. super()
 */
public class SuperDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();
		System.out.println(jasik.name);			//자식 클래스의 name이 없으면 부모 클래스의 name사용
		jasik.print();				//자식 클래스에 메소드 있으니까 자식의 메소드
		//자식 클래스에 메소드 없으면 같은 이름의 부모 메소드 호출
		//jasik.display();
	}									
}
class Bumo{
	String name = "한지민";
	public void print() {
		System.out.println("부모의 메소드");
		
	}
}
class Jasik extends Bumo {
	//String name = "박지민";			//부모가 같은 이름의 변수 가져서 실행 x
//	public void display() {
//		this.print();
//		super.print();
//	}
//	@Override						//부모가 public, 자식도 public이어야됨
//	public void print() {					//재정의		//로직이 다름
//		System.out.println("자식의 메소드");
//	
	public void print() {				
		System.out.println("자식의 메소드");
		
	}
		
//		System.out.println("name = " + this.name);
//		System.out.println("name = " + super.name);
		
	}


