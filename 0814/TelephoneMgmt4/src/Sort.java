import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Sort {
	private Vector<Telephone> vector;
	
	public Sort(Vector<Telephone> vector) {
		this.vector = vector;
	}
	
	public void sort() {
//		Collections.sort(this.vector);		//��������	//Vector -> List -> Collections.sort()
//		Collections.reverse(vector);			//��������
//		Collections.sort(this.vector, new MySort());	//sort(sorting�� ����, Comparator�� �ڽ�)
		
		//3��° ��� : �͸�Ŭ���� ����ϴ� ���
		Collections.sort(this.vector, new Comparator<Telephone>() {
			@Override
			public int compare(Telephone me, Telephone you) {
				return me.compareTo(you) * -1;
			}
		});
		
	}
	//���� Ŭ����
/*	private class MySort implements Comparator<Telephone> {		//Main, Input, Calc ����� Ŭ������ �� �޼ҵ� ���� �� (privateŬ����) -> Sort�ȿ����� ���ٰ���
		//Comparator�������̽� �����Ҷ��� sort -> compare()
		@Override
		public int compare(Telephone me, Telephone you) {
			//1��° ��� : Telephone���� Comparable���� ������, comparaTo()�� ������ ����.
			return me.compareTo(you) * -1;
			
			//2��° ��� : Telephone���� Comparable���� ��������, ��ü������ Comparator�� sorting�ϴ� ��� 
//			if(me.getFee() > you.getFee()) return 1;		//��������		//Telephone�ٱ��̾ Telephone�� private���� �����Ϸ��� public get()���� ����.
//			else if(me.getFee() < you.getFee()) return -1;
//			else return 0;
		}
*/

}