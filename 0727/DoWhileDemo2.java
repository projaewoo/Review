/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class DoWhileDemo2 {
	public static void main(String[] args) {
		for(int i = 1 ; i < 6 ; i++) {
			int j = 1;  //초기치
			do{
				if(i == j) System.out.printf("%3d", i);
				else System.out.printf("%3d", 0);
				j++;				//증감치
			}while(j < 6);		//조건
			System.out.println();


		}
	}
}
