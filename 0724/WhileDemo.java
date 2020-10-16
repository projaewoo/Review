/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		//1,2,3,4,5
		/*int i = 1;	//초기치
		while( i <= 5 ) {		//조건
			System.out.print(i + "   ");
			i++;		//증감치
		} */

	
		
		/*int i = 1;	//초기치
		while( i <= 100) {		//조건
			if(i % 7 == 0) System.out.print(i + " ");
			i++;		//증감치
		} */

		/*Scanner scan = new Scanner(System.in);
		int max = 0, mynum;
		System.out.print("정수 입력 (음수를 입력하시면 끝) : ");

		while((mynum = scan.nextInt()) >= 0) { 
			if(max < mynum) max = mynum;
		}
		System.out.println("max = " + max);	*/

		//구구단을 while문으로 출력
		/*int i = 1;
		while(i <= 9) {		//1~9Line
			int j = 2;
			while(j <= 9) {		//각 Line에 2 ~ j ~ 9
				System.out.printf("%d x %d = %d   ", j, i, j*i);
				j++;
			}
			System.out.println();
		i++;
		} */
		
		//1부터 얼마까지 더해야 그 결과가 100만을 넘어갈까요?
		/*int i = 0, sum = 0;
		while(sum < 1000000) {
			 i++;
			sum += i;
		}
		System.out.println("sum = " + sum);
		System.out.println("i = " + i);  */

		int j = 0, sum1 = 0;
		while(true) {
			if(sum1 > 1000000) break;	
			j++;
			sum1 += j;
			
		}
		System.out.println("sum1 = " + sum1); 

	}
}