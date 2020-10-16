/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
/*

*/
public class MemberVariableDemo {
	//static int age;		//클래스변수
	int age;					//멤버변수
	public static void main(String[] args) {
		//int age;		//지역변수
		MemberVariableDemo mvd = new MemberVariableDemo();
		System.out.println("나이 = " + mvd.age);
	}
}
