
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Collection FramWork에서만 사용  =    < > 있는 클래스
public class GenericDemo1 {
	public static void main(String[] args) {
//		//제네릭 활용
//		ArrayList<String> array = new ArrayList<String>();
////		array.add(5);		//ERROR	//string만 담아야해서
//		array.add("Hello");
//		array.add("World");
//		array.add("Java");
//		for(int i = 0 ; i < array.size(); i++) {		//컬렉션의 방의 개수 : size()	//배열의 방의 개수 : length()
//			System.out.println(array.get(i));
//		}
//		
//		ArrayList<Integer> array1 = new ArrayList<Integer>();
//		array1.add(5);	array1.add(7);	array1.add(9);
//		int su = array1.get(0);
//		
		
		//제한된 제네릭 클래스
//		Object obj = new String("Hello");
//		ArrayList<Object> obj = new ArrayList<String>();	//제네릭 : 형변환X
		
//		ArrayList<? extends Car> obj = new ArrayList<String>();	//Car의 자식들만 형변환 가능.	//Car의 상한. 따라서 Car의 자식들만 들어올 수 있음
//		ArrayList<? super Car> obj = new ArrayList<String>();		//Car의 부모들만 가능.			//Car의 하한.	따라서 Car의 부모들만 들어올 수 있음.
		
		//제네릭 형변환
//		ArrayList<Integer> intList = (ArrayList<Integer>)Arrays.asList(4,5,6,7,8);		//List Integer을 자식클래스인 ArrayList Integer로 형변환
//		ArrayList<Double> doubleList = (ArrayList<Double>)Arrays.asList(2.3, 4.5, 6.7, 8.9);
//		ArrayList<String> stringList = (ArrayList<String>)Arrays.asList("Hello", "World", "Java", "Python");
		
		//print()메소드랑 연동한 와일드카드
		ArrayList<Integer> intList = new ArrayList<Integer>();		//ARrayList가 52행의 List로 형변환 가능 (부모자식관계)	//Integer가 52행의 ? 와일드카드로 변환		//?가 53행의 Object로 변환됨.
		intList.add(4);	intList.add(5);	intList.add(6);
		print(intList);
		
		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(2.3);	doubleList.add(4.5);	doubleList.add(7.8);
		print(doubleList);
		
		//Number클래스
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Hello");		stringList.add("World");
		print(stringList);			//String은 (52행)Number의 자식이 아니어서 ERROR 
	}
	
	//형변환된 generics
	static void print(List<? extends Number> list) {		//ArrayList의 부모  : List로 받음		//? : Number의 자식만 받음.		
		for(Object a : list) {				//컬렉션, 배열 : 강화된 for사용		//?를 Object로 받음
			System.out.print(a + ", ");
		}
		System.out.println();
	}
}
