
public class CallByRef {
	public static void main(String[] args) {
		int [] array = {5, 9};
		System.out.println("Before Swap");
		System.out.println("a = " + array[0] + ", b = " + array[1]);
		swap(array);   //Call By Reference  //주소를 복사해서 줌
		System.out.println("After Swap");
		System.out.println("a = " + array[0] + ", b = " + array[1]);
	}
	static void swap(int [] target) {		//int [] target = original;   //주소복사
		int temp = target[0];
		target[0] = target[1];
		target[1] = temp;
		System.out.println("In the Swap");
		System.out.println("array[0] = " + target[0] + ", array[1] = " + target[1]);
	}
}
