import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Sort {
	private Vector<Telephone> vector;
	
	public Sort(Vector<Telephone> vector) {
		this.vector = vector;
	}
	
	public void sort() {
//		Collections.sort(this.vector);		//오름차순	//Vector -> List -> Collections.sort()
//		Collections.reverse(vector);			//내림차순
//		Collections.sort(this.vector, new MySort());	//sort(sorting할 벡터, Comparator의 자식)
		
		//3번째 방법 : 익명클래스 사용하는 방법
		Collections.sort(this.vector, new Comparator<Telephone>() {
			@Override
			public int compare(Telephone me, Telephone you) {
				return me.compareTo(you) * -1;
			}
		});
		
	}
	//내부 클래스
/*	private class MySort implements Comparator<Telephone> {		//Main, Input, Calc 등등의 클래스가 이 메소드 유무 모름 (private클래스) -> Sort안에서는 접근가능
		//Comparator인터페이스 구현할때의 sort -> compare()
		@Override
		public int compare(Telephone me, Telephone you) {
			//1번째 방법 : Telephone에서 Comparable구현 했을때, comparaTo()의 기준을 변경.
			return me.compareTo(you) * -1;
			
			//2번째 방법 : Telephone에서 Comparable구현 안했을때, 자체적으로 Comparator이 sorting하는 방법 
//			if(me.getFee() > you.getFee()) return 1;		//오름차순		//Telephone바깥이어서 Telephone의 private변수 접근하려면 public get()으로 접근.
//			else if(me.getFee() < you.getFee()) return -1;
//			else return 0;
		}
*/

}