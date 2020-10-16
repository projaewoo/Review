
public class InheritanceDemo2 {
	private String name;				
	public static void main(String[] args) {		//static메소드 안에서는 this 사용불가
		this.name = "한지민";			
		Derived d = new Derived(100, "한지민");
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
class Derived extends Base{		//부모 : Base
	private int salary;
//	public Derived(int salary) {
//		this.salary = salary;
//	}
	public Derived(int salary, String name) {
		super(name);
		this.salary = salary;
	}
}