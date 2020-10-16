
public class SungjukMgmt {
	public static void main(String[] args) {
		Student chulsu = new Student();
		input(chulsu);		//철수의 주소 //call by Reference
		output(chulsu);		//철수의 주소 //메소드에 주소를 복사해서 넘겨줌
	}
	static void input(Student younghee) {		//영희가 철수를 가리킴 //영희의 주소를 철수의 주소로 바꿈
		younghee.name = "이영희";
		younghee.hakbun = "2020-001";
	}
	static void output(Student jimin) {
		System.out.println("name = " + jimin.name);
		System.out.println("hakbun = " + jimin.hakbun);
	}
	//heap에서 3개의 Student가 같은 주소를 가리키고 있음
}
