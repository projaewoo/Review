
public class Bumo {
	private String name;

	public Bumo(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bumo [name=" + name + "]";
	}
	
	public void print() {
		System.out.println("나는 부모 메소드");
	}
	
}
