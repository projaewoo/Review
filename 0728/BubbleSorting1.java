/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Scanner;
import java.util.Arrays;		//배열 출력을 위해

public class BubbleSorting1 {
	public static void main(String[] args) {
		int [] array = new int[1000];		//최대한 많이 만들어놓음 //초기화 0값
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력하세요. 단 0은 종료");
		int	 idx = 0;			//while문 쓸때, 초기치 밖에
		while(true) {
			int su = scan.nextInt();
			if(su == 0) break;
			array[idx++] = su;		//대입하고 ++
		}
		System.out.println("Before Sorting");
		for(int i = 0 ; i < idx ; i++) {			//i번 루프 돔
			System.out.printf("%4d", array[i]);
		}
		//오름차순
		for(int i = 0; i < idx -1 ; i++) {			//idx : 0 ~ 2 // 배열요소 : 3개
			for(int j = 0; j < idx - 1; j++) {			//0번째와 1번째 비교 : 1번 비교 //1번째와 2번째 비교 : 2번 비교 //총 2번 비교 = 0~1번 비교 = 0~ idx-1(=2-1)번 비교
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int i = 0 ; i < idx ; i++) {			
			System.out.printf("%4d", array[i]);
		}


	}
}
