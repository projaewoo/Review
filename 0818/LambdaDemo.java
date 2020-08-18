
public class LambdaDemo {
	public static void main(String[] args) {
		
		//익명클래스
//		MyInterface mi = new MyInterface() {
//			@Override
//			public int calculate(int a, int b) {
//				return a + b;
//			}
//		};				//5~10행이 한문장 //따라서 ; 필수.
//		int result = mi.calculate(5, 9);
//		System.out.println("result = " + result);
		
		//람다식 = 익명 메소드.		//메소드 이름 생략.			//람다식 : (int a, int b) -> a * b
		MyInterface mi = (int a, int b) -> a * b;				//int로 판단될 경우, parameter안에 int도 생략가능.
		int result = mi.calculate(34, 12);
		System.out.println("result = " + result);
		
	}
}
