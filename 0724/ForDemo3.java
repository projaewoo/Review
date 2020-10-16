/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ForDemo3 {
	public static void main(String[] args) {
		/*int count = 0;
		for(int i = 1; i <= 50; i++) {		//i : 횟수
			System.out.print("★  ");
			count++;
			if(count % 10 == 0)  System.out.println();
		} */


		/*for(int i = 1 ; i < 6 ; i++) {	//별을 아래로 출력
			System.out.println("★");
		} */


		/*for(int i = 1; i < 6 ; i++) {	//나중에 //1 ~ 5 //5줄이라는 역할
			for(int j = 1 ; j < 11 ; j++) {			//중첩for문 //먼저  //1 ~ 10 //옆으로 10개 찍는다는 역할
				System.out.print("★  ");
			}
			System.out.println();
		} */


		/*for(int i = 1 ; i <=26 ; i++) {  //5줄
			for(int j = 65 ; j <= 90 ; j++) {  //26개 문자 찍기
				System.out.print((char)j + "  ");
			}
			System.out.println();
		} */
		

		/*for(int i = 1 ; i <= 10 ; i++) {
			for(int j = 1; j <= i; j++) {		//j : 1 ~ i
				System.out.print("★  ");
			}
			System.out.println();		//1줄에 별 다 찍고 줄 바꿈
		} */ 


		/*for(int i = 0 ; i <= 25 ; i++) {		//26Line
			for(int j = 65 ; j <= (65 + i) ; j++) {	
				System.out.print((char)j + " ");
			}
			System.out.println();
		} */

		/*char ch = 65;
		for(int i = 1 ; i <= 7 ; i++) {
			for(int j = 1 ; j <= i && ch <= 90 ; j++) {		//ch<=90 없으면 z이후로도 출력됨
				System.out.printf("%5c", (char)ch);	
				ch++;
			}
			System.out.println();
		} */


		// 범위 : 1 ~ i ~ 5
		// 범위 : 0 ~ j ~ 5
		/*for(int i = 1; i <= 5 ; i++) {  //5Line // i : 1~5
			for(int j = 0; j <= 5 ; j++ ) { // j : 0~5
				System.out.print(j + " ");
			}
			System.out.println();		//j끝나면 줄바꿈
		} */

		//범위 : 0 ~ i ~ 5
		//j의 범위 : i를 5번(1~5) 찍음  //j : 횟수
		/*for(int i = 0 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}*/


		System.out.println("------------");
		System.out.println("------------");
		//0 ~ i ~ 4
		//j의 범위 : i ~ i+5
		/*for(int i = 0 ; i <= 4 ; i++) {
			for(int j = i ; j <= i+5 ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		System.out.println("------------");
		//별 5개, 4개, 3... 1개 찍는 프로그램
		//5 ~ i ~ 1 (5Line)
		// j의 범위 : 5 ~ 1 (5번 찍기)
		/*for(int i = 5; i >= 1 ; i--) {
			for(int j = i ; j >= 1 ; j--) {
				System.out.print("★ ");
			}
			System.out.println();
		}*/

		System.out.println("------------");
		//구구단
		for(int i = 1 ; i <= 9 ; i++) {  //곱하는 숫자
			for(int j = 2 ; j <= 9 ; j++) {	//곱해지는 숫자
				System.out.printf("%d x %d = %d   ",  j,  i,  j*i);
			}
			System.out.println();
		}


	}
}