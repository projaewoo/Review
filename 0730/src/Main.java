import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();		//print�� member�޼ҵ��̹Ƿ�
		int [] array = {4, 7, 2, 1, 4, 8, 3, 5, 9};
		System.out.println("Before Sorting");
		main.print(array);
		
		EverySort.insertionSort(array);
		System.out.println("After Sorting");
		main.print(array);
	}
	void print(int [] array) {				//member �޼ҵ�
		System.out.println(Arrays.toString(array));
	}
}
