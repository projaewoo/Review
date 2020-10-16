/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class OpDemo4 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		boolean a1 = true;
		boolean b1 = false;
		System.out.printf("a == b ==>%b\n", (a == b));
		System.out.printf("a == b ==>%b\n", (a1 == b1));
		System.out.printf("a != b ==>%b\n", (a != b));
		System.out.printf("a != b ==>%b\n", (a1 != b1));

		String name = "한지우";
		System.out.printf("한지민 == name ==> %b\n", ("한지민" == name));
		System.out.printf("한지민 == name ==> %b\n", ("한지민".equals(name)));
		//문자열의 값 비교는 == 연산자가 아니라 equals() 메소드를 사용

		System.out.printf("한지민 == name ==> %d\n", ("한지민".compareTo(name)));
		
	}
}
