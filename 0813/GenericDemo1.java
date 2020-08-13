
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Collection FramWork������ ���  =    < > �ִ� Ŭ����
public class GenericDemo1 {
	public static void main(String[] args) {
//		//���׸� Ȱ��
//		ArrayList<String> array = new ArrayList<String>();
////		array.add(5);		//ERROR	//string�� ��ƾ��ؼ�
//		array.add("Hello");
//		array.add("World");
//		array.add("Java");
//		for(int i = 0 ; i < array.size(); i++) {		//�÷����� ���� ���� : size()	//�迭�� ���� ���� : length()
//			System.out.println(array.get(i));
//		}
//		
//		ArrayList<Integer> array1 = new ArrayList<Integer>();
//		array1.add(5);	array1.add(7);	array1.add(9);
//		int su = array1.get(0);
//		
		
		//���ѵ� ���׸� Ŭ����
//		Object obj = new String("Hello");
//		ArrayList<Object> obj = new ArrayList<String>();	//���׸� : ����ȯX
		
//		ArrayList<? extends Car> obj = new ArrayList<String>();	//Car�� �ڽĵ鸸 ����ȯ ����.	//Car�� ����. ���� Car�� �ڽĵ鸸 ���� �� ����
//		ArrayList<? super Car> obj = new ArrayList<String>();		//Car�� �θ�鸸 ����.			//Car�� ����.	���� Car�� �θ�鸸 ���� �� ����.
		
		//���׸� ����ȯ
//		ArrayList<Integer> intList = (ArrayList<Integer>)Arrays.asList(4,5,6,7,8);		//List Integer�� �ڽ�Ŭ������ ArrayList Integer�� ����ȯ
//		ArrayList<Double> doubleList = (ArrayList<Double>)Arrays.asList(2.3, 4.5, 6.7, 8.9);
//		ArrayList<String> stringList = (ArrayList<String>)Arrays.asList("Hello", "World", "Java", "Python");
		
		//print()�޼ҵ�� ������ ���ϵ�ī��
		ArrayList<Integer> intList = new ArrayList<Integer>();		//ARrayList�� 52���� List�� ����ȯ ���� (�θ��ڽİ���)	//Integer�� 52���� ? ���ϵ�ī��� ��ȯ		//?�� 53���� Object�� ��ȯ��.
		intList.add(4);	intList.add(5);	intList.add(6);
		print(intList);
		
		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(2.3);	doubleList.add(4.5);	doubleList.add(7.8);
		print(doubleList);
		
		//NumberŬ����
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Hello");		stringList.add("World");
		print(stringList);			//String�� (52��)Number�� �ڽ��� �ƴϾ ERROR 
	}
	
	//����ȯ�� generics
	static void print(List<? extends Number> list) {		//ArrayList�� �θ�  : List�� ����		//? : Number�� �ڽĸ� ����.		
		for(Object a : list) {				//�÷���, �迭 : ��ȭ�� for���		//?�� Object�� ����
			System.out.print(a + ", ");
		}
		System.out.println();
	}
}
