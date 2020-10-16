import java.util.Arrays;
import java.util.Scanner;

//입력개수 정해져있지 않은 코드
public class CallByRefDemo2 {
	public static void main(String[] args) {
		int [] array = new int[1000];
		int su = input(array); 
		output(array, su);		//output이 int배열 받으므로 int배열을 넘겨줌
	}
	static int input(int [] array) {			// 
		Scanner scan = new Scanner(System.in);		//Scanner가 필요한 곳에서 선언해도 됨
		int su = 0;
		int i = 0;			//while문은 초기값 밖에
		System.out.println("정수 입력(0은 종료) : ");
		while((su = scan.nextInt()) != 0 && i < 1000) {
			array[i++] = su;
		}
		return i;			//몇번째 방까지 채웠다는 int값 넘김
	}	//
	static void output(int [] array, int su) {  
		for(int i = 0 ; i < su ; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
