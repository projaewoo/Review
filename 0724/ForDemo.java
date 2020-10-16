/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ForDemo {
	public static void main(String[] args) {
		int count = 0, line = 1;
		for(int i = 65 ; i <= 90 ; i++) {  //z = 90
			if(line % 2 == 0) {				//라인이 짝수줄이라면
				System.out.printf("%-5c", (char)(i + 32)); //소문자
			} else {   //라인이 홀수줄이라면
				System.out.printf("%-5c", (char)i);   //- : 왼쪽정렬  //대문자와 소문자 값 차이 = 32 //소문자 뽑으려면 (char)(i + 32)
			}
			count++;				//if문 통해 문자 찍고 count++
			if(count % 5 == 0) {			//5개 문자마다 줄 바꿈.
				System.out.println();	//count가 5의 배수일때, 줄 바꿈	
				line++;
			}
		}
	}
}
