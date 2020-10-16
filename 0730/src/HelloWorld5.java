
public class HelloWorld5 {
	public static void main(String[] args) {
		HelloWorld5 hw = new HelloWorld5();
		hw.display();				//member는 주소로 접근
		//member method도 주소로 접근
	}
	void display() {		//method의 선언부, member method (static 안붙어서)
		System.out.println("Hello, World");							//method의 몸통
	}
}
