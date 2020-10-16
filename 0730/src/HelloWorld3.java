
public class HelloWorld3 {
	public static void main(String[] args) {
		//System.out.println(str);		//class 달라서 못찾음
		Test t = new Test();
		System.out.println(t.str);		//멤버변수는 주소로 접근
	}
}
class Test {
	String str = "Hello, World";		//member variable (항상 주소로 접근) //class가 다름
}