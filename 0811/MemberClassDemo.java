

public class MemberClassDemo {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		//out.a		//ERROR 	//member변수 : 반드시 클래스의 주소 필요
		Outer1.Inner1 in = out.new Inner1();
		//외부클래스 주소(Outer1)로 접근.	//생성자 써야해서 new
		in.print();
	}
}
class Outer1 {
	int a = 5;					//바깥클래스 member변수
	static int b = 10;		//바깥클래스 static변수
	class Inner1 {			//내부member클래스 : 외부클래스 주소로 접근
		int c = 100;			
//		static int d = 10000;				//내부member클래스 : static변수 못가짐
//		public static void print() {}	//내부member클래스 : static메소드 못가짐.
		
		public void print() {				//내부member클래스의 member메소드 : Inner1주소로 접근
			System.out.println(a);		//내외부member끼리 접근가능
			System.out.println(b);		//내부member -> 외부static : 접근가능
			System.out.println(c);		//내부member끼리 접근가능
		}
	}
}