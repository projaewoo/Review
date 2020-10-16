/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class CastingExample {
	public static void main(String[] args) {
		/*int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue); */

		//int age = (int)24L;
		byte age = 24;		
		double avg = 89;		//89.0

		age = (byte)avg;		//89

		byte a = 5;
		byte b = 9;
		byte sum = a + b;
	}
}
