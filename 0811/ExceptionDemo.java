import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 : ");
		int first = scan.nextInt();
		System.out.println("두번째 정수 (0은 제외) : ");
		int second = scan.nextInt();
		try {
			System.out.println(first / second);
		}catch(NullPointerException ex) {		//값이 null인 참조변수 호출할때의 exception을 잡음
			System.out.println("널포인트");
		}catch(ArrayIndexOutOfBoundsException ex) {		//배열의 범위 초과할때의 exception을 잡음
			System.out.println("배열범위 초과");
		}catch(ClassCastException ex) {		//클래스 형변환 잘못했을 때의 exception을 잡음
			System.out.println("클래스 형변환 오류");
		}catch(ArithmeticException ex) {		//정수를 0으로 나눌 때의 exception을 잡음
			System.out.println("수학적 오류");
		}catch(RuntimeException ex) {		//Runtime때 발생하는 모든 excetpion을 잡음 (Rumtime때 발생하는 모든 exception의 부모클래스) 
			System.out.println("런타임 오류 (부모 클래스)");
		}
	}
}
class Student1 {
	String name = "Sally";
}