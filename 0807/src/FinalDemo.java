
public class FinalDemo {
	int age;			//member변수
	final double PI;		//member constant
	static int kor;		//class 변수
	static final int ENG;		//static constant
	static{				//static 초기화 블록
		kor = 90;		//static variable 초기화
		ENG = 100;		//static constant 초기화
	}
	public FinalDemo() {		//생성자
		this.age = 24;		//member변수 초기화
		this.PI = 3.14;		//member상수 초기화
	}
	public static void main(String[] args) {
		final String NAME = "한지민";			//local상수
		//NAME = "김지민";
	}
}
