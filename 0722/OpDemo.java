/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class OpDemo {
	public static void main(String[] args) {
		int su = -128;
		int result = ~su;		//su의 1의 보수

		int test = su;

		System.out.printf("su = %d, result = %s\n",
											su,   Integer.toBinaryString(result));
		
		System.out.printf("su = %d, result = %s\n", 
										su,	Integer.toBinaryString(su));	//원본

		boolean flag = true;
		boolean answer = !flag;

		System.out.printf("result = %d, result = %s\n", 
										result,	Integer.toBinaryString(result));
	}
}
