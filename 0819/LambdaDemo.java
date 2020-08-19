/*람다식 활용
 * 1. 인터페이스형 변수에 lambda식 대입
 */
public class LambdaDemo {
	public static void main(String[] args) {
		//익명클래스
//		MyInterface mi = new MyInterface() {
//			@Override
//			public void myConcat(String s1, String s2) {
//				System.out.println(s1 + ", " + s2);
//			}
//		};
//		mi.myConcat("Hello", "Wolrd");
		
		//10행을 람다식으로 변환.
		//1. 인터페이스형 변수에 람다식 대입.
		MyInterface mi = (s1, s2) -> System.out.println(s1 + ", " + s2);
		mi.myConcat("Hello", "Wolrd");
		
		
		
	}
}

//두 string이어주는 메소드 정의
@FunctionalInterface				//오로지 한 개의 추상메소드만 있음을 보장.
interface MyInterface {
	void myConcat(String s1, String s2);
}