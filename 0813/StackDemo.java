import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

//stack�ڷᱸ��
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String [] array = {"Java", "Python", "Oracle", "MariaDB" };	//������ �� 10�� �������.
		for(String str : array) stack.push(str);		//stack�� ���� �޼ҵ�
//		System.out.println(stack.pop() + ", " + stack.size());	//stack�� �̾Ƴ��� �޼ҵ�
//		System.out.println(stack.pop() + ", " + stack.size());
//		System.out.println(stack.pop()+ ", " + stack.size());
//		System.out.println(stack.pop()+ ", " + stack.size());	//stack : ���ⱸ ����	//Last In Frist Out
		//pop : ��� �����ٺ��� underFlow�߻�. (���̻� �������µ� �������� �Ҷ�)	//empty()�� �ڷ� ������� Ȯ��
		
//		System.out.println(stack.peek() + ", " + stack.size());		//peek() : ���� ���� �ִ� �ڷḦ ����Ŵ. & size���پ�� 
//		System.out.println(stack.peek() + ", " + stack.size());
//		System.out.println(stack.peek() + ", " + stack.size());
		
		//bulk�� �̴� ���
		Enumeration <String> enums = stack.elements();
		while(enums.hasMoreElements()) {		//���� elements�� ���� ���� 
			System.out.println(enums.nextElement());		//stack�̳� queue�� �ڷᱸ���� ������� ������ �� ���
		}																			//stackó�� ���������� ���X
		
		//Iterator
		//���� : Enumeration���� �ڵ� ����.
		Iterator<String> iters = stack.iterator();
		while(iters.hasNext()) {
			System.out.println(iters.next());
		}
	}
}
