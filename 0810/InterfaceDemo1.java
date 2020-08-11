
public class InterfaceDemo1 {
	public static void main(String[] args) {
		//Datable d = new Datable();		//인터페이스 : 추상클래스의 일종  //따라서 new사용불가
		Datable d = new Date();			//다형성
		d.set(Datable.FRI);
		System.out.println(d.get());
	}
}
