import java.util.Arrays;
import java.util.List;

//Generic메소드
public class GenericDemo2 {
	public static void main(String[] args) {
		//Sonata : Car의 자식, Comparable 구현X
		Sonata [] array = { new Sonata("Red Sonata", 25_000_000, "red"),
									new Sonata("Blue Sonata", 28_000_000, "blue"),
									new Sonata("Black Sonata", 30_000_000, "black")
									};
		List<Sonata> sonataList = Arrays.asList(array);		//Sonata배열을 List로 변환		//배열을 12행에 넣으려면 List여야함.
//		sort(sonataList);
		
		//Carnival : Car의 자식, Comparable구현.
		Carnival [] array1 = { new Carnival("Red Carnival", 25_000_000, "red"),
				new Carnival("Blue Carnival", 28_000_000, "blue"),
				new Carnival("Black Carnival", 30_000_000, "black")
				};
		List<Carnival> carnivalList = Arrays.asList(array1);
		sort(carnivalList);
//		List<Integer> intList = Arrays.asList(new Integer []{1,2,3,4,5});
//		sort(insList);		//ERROR	//Integer : Car의 자식 X	 
	}							//Car의 자식, Comparable의 자식이어야 Generic sort메소드 사용가능		//인터페이스 : 다중상속 가능		// 상속하는 클래스  & 상속하는 인터페이스
	static <T extends Car & Comparable>void sort(List <T> carList) {			//Generic 메소드	(리턴타입 앞에 <T>있음)	//T : Car의 자식만 올 수 있음.
		System.out.println("<<Before Sorting>>");
		System.out.println(carList);
		Object [] array = carList.toArray();		//toArray() : List -> Object형변환 	//carList.toArray()의 return type : Object
		Arrays.sort(array);				//sort의 parameter : Object, primitive type만 받을 수 있음
		System.out.println("<<After Sorting>>");
		System.out.println(Arrays.toString(array));
	}
}
