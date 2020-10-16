/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/



public class Exercise {
//	static int age;	//클래스 변수(static 변수)
	//int age;				//멤버변수(인스턴스 변수)
	public static void main(String[] args) {
		int age;			//지역변수(local 변수)
		Exercise mvd = new Exercise();
		System.out.println("나이 = " + mvd.age);
	}
}