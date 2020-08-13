import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

//stack자료구조
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String [] array = {"Java", "Python", "Oracle", "MariaDB" };	//실제로 방 10개 만들어짐.
		for(String str : array) stack.push(str);		//stack의 삽입 메소드
//		System.out.println(stack.pop() + ", " + stack.size());	//stack의 뽑아내는 메소드
//		System.out.println(stack.pop() + ", " + stack.size());
//		System.out.println(stack.pop()+ ", " + stack.size());
//		System.out.println(stack.pop()+ ", " + stack.size());	//stack : 입출구 동일	//Last In Frist Out
		//pop : 계속 꺼내다보면 underFlow발생. (더이상 못꺼내는데 꺼내려고 할때)	//empty()로 자료 비었는지 확인
		
//		System.out.println(stack.peek() + ", " + stack.size());		//peek() : 제일 위에 있는 자료를 가리킴. & size안줄어듬 
//		System.out.println(stack.peek() + ", " + stack.size());
//		System.out.println(stack.peek() + ", " + stack.size());
		
		//bulk로 뽑는 방법
		Enumeration <String> enums = stack.elements();
		while(enums.hasMoreElements()) {		//다음 elements가 있을 동안 
			System.out.println(enums.nextElement());		//stack이나 queue인 자료구조에 상관없이 모조리 찝어서 출력
		}																			//stack처럼 위에서부터 출력X
		
		//Iterator
		//장점 : Enumeration보다 코드 간결.
		Iterator<String> iters = stack.iterator();
		while(iters.hasNext()) {
			System.out.println(iters.next());
		}
	}
}
