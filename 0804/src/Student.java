
public class Student {
	private String name;
	private int age;
	public Student() {		//기본 생성자
		//Student s = new Student("Unknown", 20);
		this("Unknown", 20);
	}
	public Student(String name) {	//이름만 넘어오는 생성자
//		this.name = name;
//		Student s = new Student(name, 20);
		this(name, 20);
	}
	public Student(int age) {		//나이만 받는 생성자
//		this.age = age;
//		Student s = new Student("Unknown", age);
		this("Unknown", age);
	}
	public Student(String name, int age) { //둘 다 받는 생성자
		this.name = name;							//오버로딩으로 가능
		this.age = age;								//이름 같고, parameter 다른 경우 = 오버로딩
	}
	public void print() {
		System.out.println("이름 = " + name + ", 나이 = " + age);
	}
}
