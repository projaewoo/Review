import java.util.Arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
		
//		  int [][] array = {{3, 4, 5}, {6, 7, 8}};
		  int [][] array = new int[3][];			//선언
		  array[0] = new int[] {3, 4, 5, 6, 7};
		  array[1] = new int[] {8, 9};  //선언(7번째 줄)과 생성(9번째 줄) 동일라인 아니면 생성 다시 해줘야함
		  array[2] = new int[] {10, 11, 12, 13};
		  
		  System.out.println(array.length);  //행의 길이
//		  System.out.println(array[0].length); //열의 길이
//		  for(int i = 0; i <array.length; i++) {
//			  for(int j = 0; j < array[i].length; j++) {
//		  System.out.printf("array[%d][%d] = %d\t\t", i, j, array[i][j]); }
//		  System.out.println(); }
//			}
		
//		int [][][] array = new int[3][4][5];		//3면 4행 5열
//		System.out.println(array.length);		//제일 앞의 숫자 3나옴
//		System.out.println(array[0].length);		//4
//		System.out.println(array[0][0].length);		//5
//	
//		  											//int [] array1 = array[0] (주소),  array1 = array[1] (주소)
//		for(int [] array1 : array) {  //array가 각 층의 주소 갖고 있음 //int의 주소여서 int로 받음 //array1에 0층, 1층의 주소 들어옴
//			for(int su : array1) {		//array의 1층의 주소를 받아서 각 층의 방을 출력
//				System.out.print(su + "\t\t");
//			}
//			System.out.println();
//			System.out.print(Arrays.toString(array1));
//			System.out.println();
//			}
//			
//		}
		
	}
}