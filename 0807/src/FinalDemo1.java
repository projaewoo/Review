
public class FinalDemo1 {
	public static void main(String[] args) {
		Sub sub = new Sub();		//상속은 자식 주소로 접근
		sub.print();
	}
}
class Super {
	public final void print() {			//final메소드 : 재정의 안되는 메소드
		System.out.println("나는 부모의 메소드");
	}
}
class Sub extends Super {
	@Override
	public void print() {
		System.out.println("나는 자식의 메소드");
	}
}