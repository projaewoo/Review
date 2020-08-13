import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();	//Queue : 인터페이스	//따라서 자식으로 생성.	//선언 : 부모형, 실제 : 자식형
		String [] array = {"Java", "Python", "Oracle", "MariaDB" };
		
		for(String str : array) queue.offer(str);		//Queue의 삽입 메소드
		
//		System.out.println(queue.poll() + ", " + queue.size());		//Queue의 뽑아내는 메소드
//		System.out.println(queue.poll() + ", " + queue.size());
//		System.out.println(queue.poll() + ", " + queue.size());		//Queue : 입출구 다름.	//앞에부터 나옴.
		
		//peek()
//		System.out.println(queue.peek() + ", " + queue.size());		//Queue의 맨 앞을 가리키기만 함.	//실제로 안빼냄
//		System.out.println(queue.peek() + ", " + queue.size());
//		System.out.println(queue.peek() + ", " + queue.size());
		
		//bulk로 데이터 뽑기
		Iterator<String> iters = queue.iterator();		//Queue의 부모 인터페이스 Collection의 메소드 : iterator()
	}
}
