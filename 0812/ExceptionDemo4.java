
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Parent p = new Child();		
		p.print();		//부모주소.자식의 재정의된 메소드 = 다형성
	}
}
class Parent {				//Exception 개수, 범위 : 자식 < 부모
	public void print() throws Exception { System.out.println("나는 부모의 메소드"); }
}
class Child extends Parent {
	@Override									//Checked Exception -> try-catch써야함
	public void print() throws RuntimeException { System.out.println("나는 자식의 메소드"); }
}												