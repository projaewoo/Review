

public class Student extends Human{
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public String toString() {
		return String.format("Student [name = %s, age = %s, major=%s]",
															this.getName(), super.getAge(), major);
	}															//부모 메소드도 내 메소드처럼 접근가능

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
