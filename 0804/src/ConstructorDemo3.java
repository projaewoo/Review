
public class ConstructorDemo3 {
	public static void main(String[] args) {
		Employee chulsu = new Employee("김철수");
		Employee younghee = new Employee("이영희");
		Employee jimin = new Employee("한지민");
		jimin.print();				//종업원 수 = 1로 나옴
	}									//count변수가 Employee의 멤버변수여서
}
