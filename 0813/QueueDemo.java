import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();	//Queue : �������̽�	//���� �ڽ����� ����.	//���� : �θ���, ���� : �ڽ���
		String [] array = {"Java", "Python", "Oracle", "MariaDB" };
		
		for(String str : array) queue.offer(str);		//Queue�� ���� �޼ҵ�
		
//		System.out.println(queue.poll() + ", " + queue.size());		//Queue�� �̾Ƴ��� �޼ҵ�
//		System.out.println(queue.poll() + ", " + queue.size());
//		System.out.println(queue.poll() + ", " + queue.size());		//Queue : ���ⱸ �ٸ�.	//�տ����� ����.
		
		//peek()
//		System.out.println(queue.peek() + ", " + queue.size());		//Queue�� �� ���� ����Ű�⸸ ��.	//������ �Ȼ���
//		System.out.println(queue.peek() + ", " + queue.size());
//		System.out.println(queue.peek() + ", " + queue.size());
		
		//bulk�� ������ �̱�
		Iterator<String> iters = queue.iterator();		//Queue�� �θ� �������̽� Collection�� �޼ҵ� : iterator()
	}
}
