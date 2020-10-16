/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class OpDemo5 {
	public static void main(String[] args) {
		//단항 연산자 사용시 주의할 점 : +, -, ~의 결과는 무조건 int
		//byte a = 5;
		//byte result = ~a;		// Error. //단항 연산자 사용시 주의할 점 : +, -, ~의 결과는 무조건 int
		//int result = -a;
		//System.out.println("result = " + result);

		//이항연산자 이용시 주의할 점 : 이항연산(산술, 이동, 관계, 비트, 논리)의 결과는 무조건 int 이상.
		//byte a = 5;
		//byte b = 9;
		//byte sum = a + b;		//+연산자 사용했으므로 int이상. //Error.
		
		int a = 5, b = 9, x = 100;
		if(a < x || ++b > 20) {		//
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		System.out.println("b = " + b);

		if( a < x | ++b > 20) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		System.out.println("b = " + b);
	}
}
