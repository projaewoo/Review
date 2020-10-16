/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] array;   //선언
		array = new int[4];	//생성 // 초기값 : 0, 0, 0, 0 //배열의 주소를 array에 저장
		System.out.print("국어 : ");	array[0] = scan.nextInt();
		System.out.print("영어 : ");	array[1] = scan.nextInt();
		System.out.print("수학 : ");	array[2] = scan.nextInt();
		//array[3] = array[0] + array[1] + array[2];
		for(int i = 0; i < array.length - 1; i++) {	//한칸 덜 도세요
			array[3] += array[i];
		}
		System.out.printf("국어 = %d, 영어 = %d, 수학 = %d, 총점 = %d, 평균 = %.1f\n",
										array[0], array[1],     array[2],        array[3],       array[3] / 3.);
	}
}
