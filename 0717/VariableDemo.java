/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
/*
	Variable(변수)
	1. Primitive type : 값
	2. Reference type : 주소
*/
public class VariableDemo {
	public static void main(String[] args) {
		//byte age;	//1. Declaration (선언)
		//age = 24;	//2. Assignment (할당)	나중에 값이 들어올 수 있어서 나중에 할당.
		byte age = 128;	//3. Initialization(초기화)
		//System.out.printf("나이 = %d\n", age);
		/*age = 30;
		System.out.printf("나이 = %d\n", age);
		age = 40;
		System.out.printf("나이 = %d\n", age);*/
		int su = 2147483647;
		System.out.printf("%d", su + 1);
	}
}
