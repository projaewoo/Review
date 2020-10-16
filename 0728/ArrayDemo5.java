/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ArrayDemo5{
	public static void main(String[] args) {
		String [] array = new String[]{new String("한지민"), 
													new String("김지민"),
													new String("박지민"),
														"홍지민"};
		for(int i = 0 ; i < array.length ; i++) {
			System.out.printf("array[%d] = %s%n", i, array[i]);
		}
		
	}
}
