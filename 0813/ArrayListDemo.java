import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] {5, 7, 2, 4, 9});		//IntegerŬ������ List�� ����ȯ?		//Integer, List�� <Integer>, 8���� <Integer> �� ����.
		ArrayList<String> alist = new ArrayList(list);	//new ArrayList<E> : ���� ��ȣ �ȿ� Collection�� �ڽ� �� �� ���� : List �� �� ����
		
		//size �ľ�
		System.out.println(alist.size());
		
		//���
		System.out.println(alist);
	}
}
