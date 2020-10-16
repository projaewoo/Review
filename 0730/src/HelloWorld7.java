

public class HelloWorld7 {
	public static void main(String[] args) {
		Demo d = new Demo();		//Demo가 메모리 heap에 올라가는 동시에 member method도 생성
		d.display();			//member method는 주소를 통해 접근		
	}
}

class Demo {		//다른 class에 display()메서드가 있음
	void display() {			//member method (instance method) 
		System.out.println("Hello, World");		// instance = (메모리에 올려야 생성됨)
	}
}