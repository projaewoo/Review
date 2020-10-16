import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//김철수, 24, 경영 / 이영희, 34, 심리 / 한지민, 28, 컴공
		
		//학생 입력
		Student [] array = new Student[3];
		for(int i = 0 ; i < array.length; i++) {
			String name, major;
			int age;
			System.out.print("학생 이름 : ");		name = scan.next();
			System.out.print("나이 : ");		age = scan.nextInt();
			System.out.print("학생 전공 : ");		major = scan.next();
			array[i] = new Student(name, age, major);
			System.out.println();
		}
		//학생 출력
		for(int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
