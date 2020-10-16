import java.util.Arrays;

public class SelectionSorting {
	public static void main(String[] args) {
		int [] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10 + 1);
		}
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		//Bubble Sorting
//		for(int i = 0; i < array.length -1; i++) {
//			for(int j = 0; j < array.length -1; j++) {
//				if(array[j] < array[j+1]) {
//					int temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				}
//			}
//		}
		//Selection Sorting
		for(int i = 0; i < array.length -1 ; i++) {	//끝까지 가기 전 범위
			for(int j = i + 1; j < array.length ; j++) {
				if(array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(array));
	}
}
