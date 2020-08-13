import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] {5, 7, 2, 4, 9});		//Integer클래스를 List로 형변환?		//Integer, List의 <Integer>, 8행의 <Integer> 다 동일.
		ArrayList<String> alist = new ArrayList(list);	//new ArrayList<E> : 따라서 괄호 안에 Collection의 자식 올 수 있음 : List 올 수 있음
		
		//size 파악
		System.out.println(alist.size());
		
		//출력
		System.out.println(alist);
	}
}
