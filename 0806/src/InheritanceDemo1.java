

public class InheritanceDemo1 {
	public static void main(String[] args) {
		Child child = new Child(24, 59.2);			//�ڽ� Ŭ���� ����� ����, �θ� Ŭ���� ����
		Child child1 = new Child(24);
		Child child2= new Child();
	}
}
class Parent {
	public Parent() {}			//overriding
	public Parent(String name) { System.out.println("��� �θ� Ŭ������ �����ƽ��ϴ�.");
	}
}
class Child extends Parent{
	public Child() {
		super("������");				//�ڵ����� ������
		System.out.println("��� �ڽ� Ŭ������ �����ƽ��ϴ�.");}
	public Child(int age) { 
		super();
		System.out.println("��� �ڽ� Ŭ������ �����ƽ��ϴ�."); }
	public Child(int age, double weight) {
		super();
		System.out.println("��� �ڽ� Ŭ������ �����ƽ��ϴ�.");
	}
}