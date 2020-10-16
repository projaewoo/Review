/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ReferenceCopyTest1 {
	public static void main(String[] args) {
		Student chulsu = new Student();
		chulsu.age = 24;
		/*Student younghee = new Student();
		younghee.age = chulsu.age; */
		Student younghee = new Student();

		younghee = chulsu;

		System.out.printf("철수의 나이 = %d, ", chulsu.age);
		System.out.printf("영희의 나이 = %d\n", younghee.age);

		chulsu.age = 34;
		System.out.printf("철수의 나이 = %d, ", chulsu.age);
		System.out.printf("영희의 나이 = %d\n", younghee.age);
	}
}
