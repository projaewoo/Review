
public class Jasik extends Bumo{
	private int age;

	public Jasik(String name, int age) {
		super(name);
		this.age = age;
	}

	@Override
	public String toString() {
		//return "Jasik [age=" + age + "]";
		return super.toString();
	}
	@Override
	public void print() {
		System.out.println("���� �ڽ� �޼ҵ�");
	}
	public void display() {
		System.out.println("���� �ڽ��� �Ϲ� �޼ҵ�");
	}
	
}
