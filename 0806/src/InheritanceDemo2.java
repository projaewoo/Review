
public class InheritanceDemo2 {
	private String name;				
	public static void main(String[] args) {		//static�޼ҵ� �ȿ����� this ���Ұ�
		this.name = "������";			
		Derived d = new Derived(100, "������");
	}
}
class Base{
	private String name;
	public Base(String name) {
		this.name = name;
	}
	public void printBase() {
		System.out.println("name = " + this.name);
	}
}
class Derived extends Base{		//�θ� : Base
	private int salary;
//	public Derived(int salary) {
//		this.salary = salary;
//	}
	public Derived(int salary, String name) {
		super(name);
		this.salary = salary;
	}
}