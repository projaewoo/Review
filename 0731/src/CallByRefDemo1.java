import java.util.Arrays;
import java.util.Scanner;

public class CallByRefDemo1 {
	public static void main(String[] args) {
		int [] array = input(); //배열의 주소가 넘어오니까 배열의 주소로 받음
		output(array);		//output이 int배열 받으므로 int배열을 넘겨줌
	}
	static int [] input() {			//반환타입 : 참조형 (참조형의 주소를 반환해서)
		Scanner scan = new Scanner(System.in);		//Scanner가 필요한 곳에서 선언해도 됨
		int [] array = new int[7];
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print("정수 >> ");		array[i] = scan.nextInt();
		}
		return array;			//참조형 반환타입 = 주소를 반환
	}	//int배열의 시작주소가 return됨 //참조형 반환타입
	static void output(int [] array) {
		System.out.println(Arrays.toString(array));
	}
}
