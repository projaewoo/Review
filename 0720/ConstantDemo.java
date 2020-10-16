/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ConstantDemo {
	public static void main(String[] args) {
		//final double PI = 3.141592;  //상수 : 초기화 후에 값 변경 불가.
		//System.out.printf("pi의 값은 %f입니다. \n", PI);
		//PI = 3.2;

		/*int max; //키워드만 파란색으로 바뀜
		max = Integer.MAX_VALUE; //Interger의 MAX_VALUE찾음. Integer : 클래스 변수.
		System.out.println("가장 큰 값은 " + max);
		System.out.println("가장 큰 값 다음 값은 " + (max + 1)); */
	
		byte min;
		min = Byte.MIN_VALUE;
		System.out.printf("가장 작은 값보다 더 작은 값은 %d입니다. \n", (byte)(min-1));
		System.out.println("가장 작은 값보다 더 작은 값은 " + (byte)(min - 1) + "입니다.");
	}
}
