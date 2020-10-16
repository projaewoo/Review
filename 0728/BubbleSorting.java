/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Arrays;

public class BubbleSorting {
	public static void main(String[] args) {
		//내림차순
		int [] array = {5, 8, 2, 1, 4, 6, 2, 3, 7, 9};  //n - 1= 9번 돌아야함
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		for(int i = 0 ; i < array.length -1 ; i++) {  //9번 돌기
			for(int j = 0; j < array.length - 1 /*- i */; j++) {		//맨 오른쪽이 제일 커서 i만큼 덜 돌기
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;		//Swaping알고리즘
				}
			}
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(array));
	}
}
