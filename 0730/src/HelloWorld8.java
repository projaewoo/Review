

public class HelloWorld8 {
	public static void main(String[] args) {
		Demo1.display();		//class method는 class이름으로 접근
	}
}

class Demo1 {		//다른 class에 display()메서드가 있음
	static void display() {			//class method = static method 
		System.out.println("Hello, World");		//공유 목적으로 만들어진 method
	}
}