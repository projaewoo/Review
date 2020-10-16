/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ContinueDemo {
	public static void main(String[] args) {
		int i = 1;		//초기치
		do{
			if(i % 7 ==0) System.out.printf("%-3d", i);
			//else continue;		//7의 배수가 아니면 증감으로 가기
			i++;			//증감치
		}while(i < 101);	//조건
	}
}
