/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Arrays;
public class ArrayDemo3 {
	public static void main(String[] args) {
		int [] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //10개
		int [] target = {10, 9, 8, 7, 6};	//5개
		//System.arraycopy(original, 0, target, 0, 3);
		//System.out.println(Arrays.toString(target));
		
		System.out.println(Arrays.toString(target));
		target = original;   //주소복사, deep copy
		System.out.println(Arrays.toString(target));
		original[0] = 1000;
		System.out.println(Arrays.toString(target));

	}
}
