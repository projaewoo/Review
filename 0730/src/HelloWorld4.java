
public class HelloWorld4 {
	public static void main(String[] args) {
		System.out.println(Test1.str);		//class변수는 class이름으로 접근
										//Test ts = new Test(); 생성 안해도 class 변수(static변수)는 이미 생성되어있음
		System.out.println(Test2.str);		//class변수 = static변수
															//주소 없이 class이름으로 찾아갈 수 있음
	}
}
class Test1 {
	static String str = "Hello, World";		//class variable (class이름으로 접근)
															//
}
class Test2 {
	static String str = "한지민";		//class variable (class이름으로 접근)
															//
}