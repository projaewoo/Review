

public class InheritanceDemo1 {
	public static void main(String[] args) {
		Child child = new Child(24, 59.2);			//자식 클래스 만들기 전에, 부모 클래스 만듬
		Child child1 = new Child(24);
		Child child2= new Child();
	}
}
class Parent {
	public Parent() {}			//overriding
	public Parent(String name) { System.out.println("방금 부모 클래스가 생성됐습니다.");
	}
}
class Child extends Parent{
	public Child() {
		super("한지민");				//자동으로 생성됨
		System.out.println("방금 자식 클래스가 생성됐습니다.");}
	public Child(int age) { 
		super();
		System.out.println("방금 자식 클래스가 생성됐습니다."); }
	public Child(int age, double weight) {
		super();
		System.out.println("방금 자식 클래스가 생성됐습니다.");
	}
}