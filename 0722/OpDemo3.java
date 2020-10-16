/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class OpDemo3 {
	public static void main(String[] args) {
		int su = -128;
		int result = su >> 5;
		int result1 = su >>> 5;
		System.out.println("su = " + Integer.toBinaryString(su));  //원본
		System.out.println("result = " + Integer.toBinaryString(result));
		System.out.println("result1 = " + Integer.toBinaryString(result1));	//5칸 오른쪽 이동, 따라서 양수 됨.
		System.out.println("result = " + result);
		System.out.println("result1 = " + result1);
	}
}
