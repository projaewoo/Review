/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class Prime {
	public static void main(String[] args) {
		int [] array = new int[200];
		int count = 0;
		for(int i = 2; i < 200; i++) {
			array[i] = i;   //0  0  2  3  4  5  6  ...  199
		}
		for(int i = 2; i < 200; i++) {
			if(array[i] != 0) {
				System.out.printf("%5d", i);   //2, 3, 5, 7, ...
				count++;
				if(count % 10 ==0) System.out.println();
				for(int j = i ; j < 200; j += i) {
				array[j] = 0;						//i의 배수마다 0이 됨
				}
			}
		}
		System.out.println("\n소수의 갯수 : " + count);

	}
}