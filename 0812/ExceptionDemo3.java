//å�� ����
public class ExceptionDemo3 {
	public static void main(String[] args) {
		a();
	}
//	static void a() { b(); }
//	static void b() { c(); }
//	static void c() { d(); }
//	static void d() {			//Exception�߻� -> Exception ����	//d()�� ȣ���� c()�� ó�� -> catch�� ó�� ���� -> ...b()�� ó�� ���� -> ... -> main�� ó�� ���� -> JVM�� ȭ�鿡 exception ��� 	
//		System.out.println(4 / 0);					//printStackTrace()
//	}
	
	//�ٸ� ���
	static void a() { b(); }
	static void b() {
		try {
			c();
		}catch(Exception ex) {System.out.println("b()���� �����"); }		//b()���� ��Ƽ� å���� main()���� �ȿö�. 
	}
	static void c() { d(); }
	static void d() {			//Exception�߻� -> c()�� ó�� ���� -> b()�� catch�� ��Ƽ� ó����.	 	
		System.out.println(4 / 0);
	}
}
