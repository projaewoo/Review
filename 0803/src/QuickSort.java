import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int [] array = {3, 4, 7, 1, 2, 9, 3, 4, 6};
		quickSort(array, 0, array.length -1);		//시작과 마지막 방 넘겨줌
		System.out.print(Arrays.toString(array));
	}
	static void quickSort(int [] array, int start, int end) {
		int low = start, high = end, mid = array[(start + end) / 2];	//start : 처음 인덱스, end : 마지막 인덱스
		do {
			while(array[low] < mid) low++;
			while(array[high] > mid) high--;
			if(low <= high) {
				int temp = array[low];   array[low] = array[high];   array[high] = temp;
				low++;  high--;
			}
		}while(low <= high);
		if(start < high) quickSort(array, start, high);		//start ~ high까지만 부분sorting
		if(low < end) quickSort(array, low, end);			//low ~ end까지만 부분sorting
	}
}
