
public class LambdaDemo {
	public static void main(String[] args) {
		//1. 인터페이스형 변수 = 람다식  //참조변수에 람다식 사용하기
//		Comparable com = (a, b) -> b - a;
		//2. 람다식을 매개변수로 보내기 
//		myMethod((a, b) -> b - a);			//=myMethod(com);과 동일 //com : 5행
		//3.return type에 람다식 사용하기
		Comparable com = myMethod1();		//람다식 리턴되면 Comparable형으로 반환되므로 com으로 받음.
		System.out.println(com.compareTo(5, 9));
	}
	static void myMethod(Comparable comp) {
		int a = 5, b = 9;
		int result = comp.compareTo(a, b);
		System.out.println("result = " + result);
	}
	static Comparable myMethod1() {
		//3. 람다식으로 리턴하기
		return (a, b) -> b - a;		//람다식이 Comparable이어서 리턴타입과 일치.
	}
}
@FunctionalInterface
interface Comparable {		//임의로 정의한 Functional인터페이스
	int compareTo(int a, int b);
}

/* interface Comparable <T> {		
 * 		int compareTo(T o);		//메소드 1개밖에 없어서 람다 사용가능		//그러나 엄밀히 말해서 fuctional 인터페이스 아님.	//API에 그렇게 안써있음
 * }
 */
