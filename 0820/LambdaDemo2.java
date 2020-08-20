import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//���ٸ� collection�� ���
public class LambdaDemo2 {
	public static void main(String[] args) {
//		List <Integer> list = Arrays.asList(4, 7, 1, 2, 9, 3, 8, 2, 5);		//4, 7, 1, ..�� List�� ��ȯ.
		//���� �ڵ�							//Comparator = Functional�������̽�
//		Collections.sort(list, new Comparator<Integer>() {		
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2) * -1;				//��������.
//			}
//		});
		
		//11���� ���ٽ����� ��ȯ
//		Collections.sort(list, (o1, o2) -> o1.compareTo(o2) * -1);		//��������.
		
		
		//Collection�̿� //���� ���ٽ� ���X
		List<String> list = Arrays.asList("Hello", "Java", "oracle", "apple", "������", "������", "������", "123");
		Collections.sort(list, (a, b) -> a.compareTo(b) * -1);		//data type�����ϰ�, �߷а��� -> ������Ÿ�� ����.		
		
		//���.
		System.out.println(Arrays.toString(list.toArray()));		//toSTring()�ȿ� Arrays�� �� �־ toArray()�� ��ȯ
		
	}
}
