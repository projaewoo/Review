/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ArrayDemo8 {
	public static void main(String[] args) {
		Student chulsu = new Student();		chulsu.name = "김철수";
		Student younghee = new Student();		younghee.name = "이영희";
		Student jimin = new Student();				jimin.name = "한지민";
		Student [] original = {chulsu, younghee, jimin};
		Student [] target = new Student[5];
		//original배열의 첫 학생부터 3명을 target배열에 복사하기
		System.arraycopy(original, 0, target, 0, original.length);  //0x100, 0x200, 0x300, null, null  //배열의 값 복사 //배열에 주소가 있어서 사실 주소복사
		target = original;		//주소복사  //방 5개 버리고 original이 됨
		for(Student std : target) {
			if(std != null) System.out.println(std.name);			//std가 target의 5가지 요소를 다 못 받아서
		}  //std != null  : 주소들끼리 비교 // null : 주소

	}
}