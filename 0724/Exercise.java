/*
작성자 : 정재우 
작성목적 : 연습문제
작성일시 : 7월 24일
작성환경 : Windows
*/

public class Exercise {
	public static void main(String[] args) {
		
		System.out.println("1번문제");
		//1번문제. 100이하의 자연수 중 4의 배수이며 5의 배수가 아닌 값 출력
			for(int j = 1 ; j <= 100 ; j++) {
				if( (j % 4 == 0) && (j % 5 != 0))
				System.out.print(j + " ");
			}
		

		System.out.println();
		System.out.println("2번문제");
		//2번문제. 100이하의 자연수 중에서 7 또는 9의 배수인 값 출력
		for(int i = 1 ; i <= 100 ; i++) {
			if( (i % 7 == 0) || (i % 9 == 0)) System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("3번문제");
		//3번문제. 자연수 중 100의 약수를 모두 찾아 1줄에 3개씩 출력
		//약수 : 100을 나눌 수 있는 수 //100%i == 0인 i
		int count = 0;
		for(int i = 2 ; i <= 99 ; i++) {
			if (100 % i == 0){
				System.out.print(i + " ");
				count++;
				if(count % 3 == 0 ) System.out.println();
			}
		}


		System.out.println();
		System.out.println("4번문제");
		//4번문제. 1~5, 2~5, 3~5, 4~5, 5 줄 바꾸며 찍기
		// 1 ~ i ~ 5
		// i ~ j ~ 5 (1씩 감소)
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = i ; j <= 5 ; j++) {	 //i가 1일때, j도 1로 시작 //j가 시작할때 i부터 시작
				System.out.print(j + " ");
			}
			System.out.println();
		}

		/*int i = 1;
		while(i < 6) {
			int j = i;
			while(j < 6) {
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
			i++;
		} */


		System.out.println();
		System.out.println("5번문제");
		//5번문제. 유니코드 41~122번까지의 코드와 문자를 한 줄에 8개씩 출력
		//첫줄 : 8개, 둘째줄 : 8개
		//몇 줄인지 모름 1 ~ i ~ ?
		int counts = 0;
		for(int i = 41 ; i <= 122; i++) {
			System.out.print(i + " : " + (char)i + "    ");
			counts++;
			if(counts % 8 ==0) System.out.println();
		}

		/*int i = 41, count = 0;
		while(i < 123) {
			System.out.print(i + " : " + (char)i);
			count++;
			if(count % 8 == 0) System.out.println();
			i++;
		}*/
		


	}
}
