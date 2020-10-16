/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

/*
	배열의 초기화
	1. 정수 ---> byte, short, int, long --> 0
	2. 실수 ---> float, double ---> 0.00~
	3. 불리언 --> boolean --> false
	4. 문자 --> char --> null값(='\0', '\u0000'(=아스키 0) )
	5. 참조형 ( ex)String) )--> 주소 -->null번지 (=null)
*/
public class ArrayDemo1 {
	public static void main(String[] args) {
		String [] array = new String[4];
		for(int i = 0; i < 4; i++) {
			System.out.printf("array[%d] = %s\n", i, array[i]);
		}
	}
}
