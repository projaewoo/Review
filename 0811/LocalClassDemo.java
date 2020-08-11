

public class LocalClassDemo {
	public static void main(String[] args) {
	
	}
}
class Outer2 {
	int a = 5;				//바깥클래스의 member변수
	static int b = 10;		//바깥클래스의 static변수
	public void print() {		//바깥클래스의 member메소드
		int c = 50;				//local변수		//print()메소드 호출해야 생성됨
		class Inner2 {			//local클래스 : 메소드 안에 위치	//print()메소드 호출해야 생성됨
			public void display() {		//local클래스의 member메소드
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
		}
		Inner2 in = new Inner2();	//print()메소드 호출해야 작동	//메소드 안에서 순차적으로 진행
		in.display();							//생명 : 13~17행(=local클래스의 생명주기)
	}
}
