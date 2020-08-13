//책임 전가
public class ExceptionDemo3 {
	public static void main(String[] args) {
		a();
	}
//	static void a() { b(); }
//	static void b() { c(); }
//	static void c() { d(); }
//	static void d() {			//Exception발생 -> Exception 던짐	//d()를 호출한 c()가 처리 -> catch로 처리 안함 -> ...b()가 처리 안함 -> ... -> main이 처리 안함 -> JVM이 화면에 exception 출력 	
//		System.out.println(4 / 0);					//printStackTrace()
//	}
	
	//다른 방법
	static void a() { b(); }
	static void b() {
		try {
			c();
		}catch(Exception ex) {System.out.println("b()에서 잡았음"); }		//b()에서 잡아서 책임이 main()까지 안올라감. 
	}
	static void c() { d(); }
	static void d() {			//Exception발생 -> c()가 처리 안함 -> b()가 catch로 잡아서 처리함.	 	
		System.out.println(4 / 0);
	}
}
