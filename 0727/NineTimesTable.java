/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class NineTimesTable {
	public static void main(String[] args) {
		int i = 1;  //초기화
		do{
			int j = 2;	//j의 초기화
			do{
				System.out.printf("%d x %d = %d   ", j, i, j * i);
				j++;		//증감치
			}while(j < 10);	//조건
			System.out.println();
			i++;   //증감치
		}while(i < 10);  //조건
	}
}