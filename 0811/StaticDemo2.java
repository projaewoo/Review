
public class StaticDemo2 {
	public static void main(String[] args) {
		Outer.Inner in = new Outer.Inner();	//static클래스 -> Outer주소 필요없음.
		in.print();	//member메소드 : 주소로 접근.
	}
}
class Outer {
	static int a = 5;			//바깥 클래스의 static변수
	int b = 10;					//바깥 클래스의 member변수
	static class Inner {		//내부클래스 : static사용가능
		int c = 100;						//내부클래스의 member변수
		static int d = 1000;			//내부클래스의 static변수
		public void print() {			//내부클래스의 member메소드
			System.out.println(a);	//static끼리 접근가능
//			System.out.println(b);	//ERROR 	//내부member메소드 -> 외부static변수 접근X
			System.out.println(c);	//내부member메소드 -> 내부member변수 접근가능	
			System.out.println(d);	//내부member메소드 -> 내부 static변수 접근가능
		}
	}
}