import java.util.Arrays;
import java.util.List;

//Generic�޼ҵ�
public class GenericDemo2 {
	public static void main(String[] args) {
		//Sonata : Car�� �ڽ�, Comparable ����X
		Sonata [] array = { new Sonata("Red Sonata", 25_000_000, "red"),
									new Sonata("Blue Sonata", 28_000_000, "blue"),
									new Sonata("Black Sonata", 30_000_000, "black")
									};
		List<Sonata> sonataList = Arrays.asList(array);		//Sonata�迭�� List�� ��ȯ		//�迭�� 12�࿡ �������� List������.
//		sort(sonataList);
		
		//Carnival : Car�� �ڽ�, Comparable����.
		Carnival [] array1 = { new Carnival("Red Carnival", 25_000_000, "red"),
				new Carnival("Blue Carnival", 28_000_000, "blue"),
				new Carnival("Black Carnival", 30_000_000, "black")
				};
		List<Carnival> carnivalList = Arrays.asList(array1);
		sort(carnivalList);
//		List<Integer> intList = Arrays.asList(new Integer []{1,2,3,4,5});
//		sort(insList);		//ERROR	//Integer : Car�� �ڽ� X	 
	}							//Car�� �ڽ�, Comparable�� �ڽ��̾�� Generic sort�޼ҵ� ��밡��		//�������̽� : ���߻�� ����		// ����ϴ� Ŭ����  & ����ϴ� �������̽�
	static <T extends Car & Comparable>void sort(List <T> carList) {			//Generic �޼ҵ�	(����Ÿ�� �տ� <T>����)	//T : Car�� �ڽĸ� �� �� ����.
		System.out.println("<<Before Sorting>>");
		System.out.println(carList);
		Object [] array = carList.toArray();		//toArray() : List -> Object����ȯ 	//carList.toArray()�� return type : Object
		Arrays.sort(array);				//sort�� parameter : Object, primitive type�� ���� �� ����
		System.out.println("<<After Sorting>>");
		System.out.println(Arrays.toString(array));
	}
}
