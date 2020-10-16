/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int [] array = {10, 20, 30, 40 ,50};
		/*for(int i = 0 ; i < array.length ; i++) {
			System.out.print("%5d", array[i]);
		}*/

		/*for(int su : array) {
			System.out.printf("%5d", su);
		} */

		System.out.println(Arrays.toString(array));
	}
}