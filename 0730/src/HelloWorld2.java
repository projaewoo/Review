
public class HelloWorld2 {
	static String str = "Hello, World";  //class variable  //class로 접근
	public static void main(String[] args) {
		System.out.println(str);		//같은 클래스 안에 있으면 접근 가능
		System.out.println(HelloWorld2.str);  //원래 class variable 접근 방법
																//class로 접근
	}
}