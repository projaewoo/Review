/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ArrayDemo {
	public static void main(String[] args) {
		/*//Declaration
		int su;
		int [] array = null;	//int arry;는 값변수 //int [] array;는 주소변수
		
		//2. Creation
		array = new int[4];

		//3. Assignment
		su = 5;
		array[0] = 3; array[1] = 4; array[2] = 5; array[3] = 6; */

		//---------------------------------------------------------
		//1. Declaration
		//int [] array;
		//2. Creation & Assignment
		//array = new int[]{3, 4, 5, 6};

		//1. Declaration, Creation & Assignment  ---> initialization
		int [] array = {3, 4, 5, 6};
		//System.out.println(array[0]);
		//System.out.println(array[1]);
		//System.out.println(array[2]);
		//System.out.println(array[3]);
		array[0] = array[0] * 100;	//write

		for(int i = 0; i <=3; i++) {		//시작과 끝이 명료. 따라서 for문
			System.out.println(array[i]);		//read
		}
	}
}