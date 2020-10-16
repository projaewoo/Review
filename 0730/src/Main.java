import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();		//print가 member메소드이므로
		int [] array = {4, 7, 2, 1, 4, 8, 3, 5, 9};
		System.out.println("Before Sorting");
		main.print(array);
		
		EverySort.insertionSort(array);
		System.out.println("After Sorting");
		main.print(array);
	}
	void print(int [] array) {				//member 메소드
		System.out.println(Arrays.toString(array));
	}
}
