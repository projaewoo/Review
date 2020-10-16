/*
*class설계 시, 변수를 멤버변수 또는 클래스변수 어느 것으로 결정할 것인가??
*member variable : Member마다 각각 생성
*class variable : Member들이 접근하는 공유지역이기 때문에 단 1개만 생성.
*member variable 초기화 : 초기화 블록 / 생성자가 수행
*class variable 초기화 : static초기화 블록이 수행
*/

public class Employee {
	private String name;
	private int salary;
	private static int count;				//static변수 = Employee끼리 공유하는 변수
	static {			//class Initialization Block
		//Instance Initialization Block
		count = 10;			//똑같이 들어가는 변수는 초기화 블럭으로 한 번만.
	}
	public Employee(String name) {
		this.name = name;     count++;		//static변수는 Employee생성자 밖에서 미리 생성되어있어서
	}
	public void print() {
		System.out.println("종업원 수 = " + count);
	}
}
