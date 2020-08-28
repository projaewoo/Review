import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	private ArrayList<Student> list;		//member variable
	
	Sorting(ArrayList<Student> list) {
		this.list = list;
	}

	//람다 사용X
//	void sort() {
//		Collections.sort(list, new Comparator<Student>() {		//Comparator : 정렬기준 바꾸고 싶을때 사용
//			@Override
//			public int compare(Student s1, Student s2) {
//				return (s1.getTot() > s2.getTot()) ? -1 :			//-1 : 내림차순.
//					(s1.getTot() < s2.getTot()) ? 1 : 0;
//			}
//		});
//	}

	//람다 사용
	void sort() {
		Collections.sort(list, (s1,  s2) -> 
					(s1.getTot() > s2.getTot()) ? -1 : (s1.getTot() < s2.getTot()) ? 1 : 0	);	//실행문 1개라 {} 생략	//-1 : 내림차순.
	}

}