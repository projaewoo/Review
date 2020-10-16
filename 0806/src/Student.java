

public class Student extends Human{
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public String toString() {
		return String.format("Student [name = %s, age = %s, major=%s, ]",
															super.getName(), super.getAge(), major);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
