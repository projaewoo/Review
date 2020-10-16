/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ReferenceCopyTest2 {
	public static void main(String[] args) {
		String original = "Hello";
		String copy = original;
		System.out.printf("original = %s, copy = %s\n", original, copy);
		original = "World";
		System.out.printf("original = %s, copy = %s\n", original, copy);
	}
}
