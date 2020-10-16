/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ArrayDemo6 {
	public static void main(String[] args) {
		String str = "서울시 강남구 역삼동";
		char [] array = str.toCharArray();		//string을 char로 각각 하나의 글자로 인식
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%3c", array[i]);
		}
		array[0] = '경';   array[1] = '기';   array[2] = '도';
		System.out.println();
		str = new String(array);			//값을 바꾸려면 new사용
		System.out.println(str);	
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%3c", array[i]);
		}
	}
}
