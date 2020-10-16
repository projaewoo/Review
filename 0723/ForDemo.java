/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ForDemo {
	public static void main(String[] args) {
		
		int count = 0;
		long factory = 1;
		for(int i = 1 ; i < 101 ; i++) {
			//System.out.print(a + "     ");   //for의 조건이 참일 경우 해야할 작업
			//factory *= i;		//1 * 2 * 3 * ... * 10
			if(i % 5 == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n1부터 100까지의 숫자 중 5의 배수의 개수는 " + count + "입니다.");

	}
}