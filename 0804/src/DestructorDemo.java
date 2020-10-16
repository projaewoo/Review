
public class DestructorDemo {
	 public static void main(String[] args) {
		Box box = new Box();			//Box()라는 메소드 호출 //생성자 = 메소드
		box = null;		//주소 끊어짐		//grabage콜렉터의 대상이 됨
		System.gc();		//grabage 콜렉터 명시적 호출	//grabage콜렉터가 finailze()호출		
	}																	//finalize()없으면 그냥 grabage수거
}
class Box {
	public Box() {			//constructor
		System.out.println("방금 객체가 생성됐습니다.");
	}
	protected void finalize() {		//destructor	//소멸할때 호출
		System.out.println("방금 객체가 소멸됐습니다.");
	}
}