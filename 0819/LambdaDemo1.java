/*
 * 2. 매개변수로 lambda식 사용		(람다식을 변수처럼 사용)
 */

public class LambdaDemo1 {
	public static void main(String[] args) {
		//1. 인터페이스형 변수에 람다식 대입.
//		PrintString lambdaStr = s -> System.out.println(s);
						//lambdaStr : PrintString형 참조변수	//따라서 myMethod의 parameter로 들어갈 수 있음
		
		//2. 매개변수로 lambda식 사용
//		myMethod(s -> System.out.println(s));	//= myMethod(lambdaStr);	//람다식을 매개변수로 받고, 그 람다식이 lambdaStr가 되어서 16행 showString 수행.
		
//		
//		PrintString ps = returnString();
//		ps.showString("Hello");
//		3. 리턴타입으로 lambda식 사용  (람다식을 변수처럼 사용)
		//15,16행을 3번 방법으로.
		returnString().showString("Hello");		//returnString() =  s -> System.out.println(s + ", from Lambda Experssion") //뒤에 showString()붙이면 "Hello, from Lambda Experssion"출력.
		
	}
	static void myMethod(PrintString lambdaStr) {
//		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Wolrd");
	}
//	3. 리턴타입으로 lambda식 사용  (람다식을 변수처럼 사용)
	static PrintString returnString() {		//리턴 타입 : PrintString : 람다식
		return s -> System.out.println(s + ", from Lambda Experssion");
	}
}
@FunctionalInterface			//추상메소드는 오직 한개만, 단! Java1.8 이후로 static메소드, default메소드 개수 제한 없이 올 수 있음
interface PrintString {
	void showString(String s1);
}