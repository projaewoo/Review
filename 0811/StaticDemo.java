/*
 * static 4가지 용법
 * 1. static변수
 * 2. static메소드
 * 3. static초기화블록
 * 4. static class
 */
		
public class StaticDemo {
	public static void main(String[] args) {
		Student [] array = new Student[3];
		for(int i = 0 ; i < array.length; i++) {array[i] = new Student();}
		for(Student s : array) System.out.println(s);		//s.toString()호출.	//toString() = public member method
		Student.print();																					//따라서 주소로 접근.
	}
}
class Student {
	public int count;		//member변수		//객체마다 만들어짐
	public static int su;		//static변수		//공유변수 (모든 객체가 공유함)
	public Student() {		//생성자
		count++;
		su++;
	}
	public static void print() {			//static method (클래스 이름으로 접근)
		System.out.println("Hello");
	}
	@Override
	public String toString() {			//member method  (주소로 접근)
		return String.format("count = %d, su = %d", this.count, su);
	}
}