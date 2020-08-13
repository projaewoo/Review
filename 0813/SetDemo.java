import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Set - HashSet, TreeSet�� ������
public class SetDemo {
	public static void main(String[] args) {
		String [] array = {"Java", "Hello", "Python","Apple", "Oracle", "World", "Java", "Oracle", "MariaDB" };
		Set<String> hashset = new HashSet<String>();		//generic�� �����ؾ���	//row type�� �θ� �ڽ� ����� ����
		Set<String> treeset = new TreeSet<String>();
		//�߰�
		for(String str : array) {
			hashset.add(str);
			treeset.add(str);
		}
		//�ߺ� �����ؼ� ���
		System.out.println(hashset);		//���� ���� ���.	//�ߺ����� ���� ������ ����
		System.out.println(treeset);			//�ڵ�sorting		//�ߺ����� ���� ������ ���� & �����Ҷ����� sorting
	}														//TreeSet : SortedSet<E>�� �ڽ�.
}
