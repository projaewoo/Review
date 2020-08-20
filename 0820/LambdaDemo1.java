
public class LambdaDemo1 {
	public static void main(String[] args) {
		//람다식 사용 안할때 (익명클래스)
//		MyInterface mi = new MyInterface() {
//			@Override
//			public void saySomething() {
//				System.out.println("Hello, World");
//			}
//		};
//		mi.saySomething();
		
		//람다식 사용하면 (코드 간결) //1번 방법 : MyInterface에 파라미터X , 리턴값 X
//		MyInterface mi = () -> System.out.println("Hello, World");
//		mi.saySomething();
		
		//2번 방법 : MyInterface에 파라미터X , 리턴값 O
//		MyInterface mi = () -> {
//				System.out.println("Hello, World");	//문장 2개라 {} 생략불가
//				return 100;
//			};
//		int result = mi.saySomething();
		
		//3번 방법 : MyInterface에 parameter O, 리턴값 O
//		MyInterface mi = name -> {			//()안의 데이터타입 추론가능하면 데이터타입 생략.	//매개변수 1개이면 ()생략
//			System.out.println("Your name is" + name + ".");	//문장 2개라 {} 생략불가
//			return 100;
//		};
//		int result = mi.saySomething("Sujan");
		
		//4번 방법 : MyInterface에 매개변수 2개 이상, 리턴값 O
		MyInterface mi = (a, b) -> a + b; 
		int result = mi.add(5, 9);
		
		
	}
}
@FunctionalInterface		//단 한개의 추상메소드만 가짐. -> 람다식 사용가능
interface MyInterface {
//	int saySomething(String name);	//3번 방법
	int add(int a, int b);						//4번 방법
}