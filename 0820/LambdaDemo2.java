import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//람다를 collection에 사용
public class LambdaDemo2 {
	public static void main(String[] args) {
//		List <Integer> list = Arrays.asList(4, 7, 1, 2, 9, 3, 8, 2, 5);		//4, 7, 1, ..를 List로 변환.
		//원래 코드							//Comparator = Functional인터페이스
//		Collections.sort(list, new Comparator<Integer>() {		
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2) * -1;				//내림차순.
//			}
//		});
		
		//11행을 람다식으로 변환
//		Collections.sort(list, (o1, o2) -> o1.compareTo(o2) * -1);		//내림차순.
		
		
		//Collection이용 //아직 람다식 사용X
		List<String> list = Arrays.asList("Hello", "Java", "oracle", "apple", "한지민", "박지민", "김지민", "123");
		Collections.sort(list, (a, b) -> a.compareTo(b) * -1);		//data type동일하고, 추론가능 -> 데이터타입 생략.		
		
		//출력.
		System.out.println(Arrays.toString(list.toArray()));		//toSTring()안에 Arrays올 수 있어서 toArray()로 변환
		
	}
}
