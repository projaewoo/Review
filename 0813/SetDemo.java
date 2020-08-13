import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Set - HashSet, TreeSet의 차이점
public class SetDemo {
	public static void main(String[] args) {
		String [] array = {"Java", "Hello", "Python","Apple", "Oracle", "World", "Java", "Oracle", "MariaDB" };
		Set<String> hashset = new HashSet<String>();		//generic은 동일해야함	//row type은 부모 자식 관계면 가능
		Set<String> treeset = new TreeSet<String>();
		//추가
		for(String str : array) {
			hashset.add(str);
			treeset.add(str);
		}
		//중복 제거해서 출력
		System.out.println(hashset);		//기준 없이 출력.	//중복되지 않은 데이터 저장
		System.out.println(treeset);			//자동sorting		//중복되지 않은 데이터 저장 & 저장할때마다 sorting
	}														//TreeSet : SortedSet<E>의 자식.
}
