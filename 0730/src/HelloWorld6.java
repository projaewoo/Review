
public class HelloWorld6 {
	public static void main(String[] args) {
		display();		//동일 class이면 클래스 이름 생략가능
		HelloWorld6.display();	//정석 class method 호출방법
				//class method이므로 class이름으로 접근
	}
	static void display() {		//method의 선언부, class method
		System.out.println("Hello, World");							//method의 몸통
	}
}
