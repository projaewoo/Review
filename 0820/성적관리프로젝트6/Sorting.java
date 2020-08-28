import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	private ArrayList<Student> list;		//member variable
	
	Sorting(ArrayList<Student> list) {
		this.list = list;
	}

	//���� ���X
//	void sort() {
//		Collections.sort(list, new Comparator<Student>() {		//Comparator : ���ı��� �ٲٰ� ������ ���
//			@Override
//			public int compare(Student s1, Student s2) {
//				return (s1.getTot() > s2.getTot()) ? -1 :			//-1 : ��������.
//					(s1.getTot() < s2.getTot()) ? 1 : 0;
//			}
//		});
//	}

	//���� ���
	void sort() {
		Collections.sort(list, (s1,  s2) -> 
					(s1.getTot() > s2.getTot()) ? -1 : (s1.getTot() < s2.getTot()) ? 1 : 0	);	//���๮ 1���� {} ����	//-1 : ��������.
	}

}