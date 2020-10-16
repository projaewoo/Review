/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ValueCopyTest {
	public static void main(String[] args) {
			/*int first, second;
            first = 7;
            second = first;
            System.out.println("first = " + first);
            System.out.println("second = " + second);

            System.out.println("값 변환 후");
            second = 10;
            System.out.println("first = " + first);
            System.out.println("second = " + second); */

		double original = 173.6;
		double copy = original;  //복사
		System.out.printf("original = %.1f, copy = %.1f\n", original, copy);
		
		original = 190.4;
		System.out.printf("original = %.1f, copy = %.1f\n", original, copy);

		/*
			값 복사
			1. 대상 : primitive type
			2. 동작 : 원본이 바뀐다고 카피본이 바뀌지 않음
	}
}
