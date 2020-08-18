
public class LambdaDemo1 {
	public static void main(String[] args) {
		
		//익명 클래스
//		Say say = new Say() {
//			@Override
//			public void saySomething() {
//				System.out.println("Hello, Wolrd");
//				System.out.println("Nice to meet you");
//			}
//		};
//		say.saySomething();
		
		//람다식	(메소드 이름이 없음)
//		Say say = () -> {
//				System.out.println("Hello, Wolrd");
//				System.out.println("Nice to meet you");
//			};			//15~18행이 한 문장
//		say.saySomething();
		
		//Person클래스, 익명클래스 이용 	//5행의 방법과 동일.
//		Person chulsu = new Person();
//		chulsu.greeting(new Say() {		//익명 클래스		//parameter 안에 클래스 생성. -> 굳이 상속 안받아도 인터페이스의 메소드 재정의 가능.
//			@Override
//			public void saySomething() {
//				System.out.println("Hello, World");
//				System.out.println("Nice to meet you!!");
//			}
//		});
		
		//22행 방법을 람다식으로			//장점 : 코드 간결
		Person chulsu = new Person();
		chulsu.greeting( () -> {					//greeting()의 parameter안에 Say형 say 들어와야함.	-> 컴파일러가 이 메소드는 인터페이스의 saySomething()이라고 판단.
			System.out.println("Hello, World");
			System.out.println("Nice to meet you!!");
			}
		);
	}
}
class Person {
	public void greeting(Say say) {			//Say의 자식을 parameter로 받음.
		say.saySomething();
	}

}
@FunctionalInterface		//메소드가 1개밖에 없음을 보장
interface Say {		
	void saySomething();
}
