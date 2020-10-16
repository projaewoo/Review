
public class OverrideDemo1 {
	public static void main(String[] args) {
		Point p1 = new Point(3, 5);		System.out.println(p1);
		Point p2 = new Point(3, 5);		System.out.println(p2);
		System.out.println(p1 == p2);			//�ּ� ��
		//System.out.println(p1.equals(p2));	//������ �ּ� ��		//StringŬ������ equals�� �� Ŭ�������� �� ���� �� �ְ� �������ؼ�
																//���� equals�� �ּҺ�
		System.out.println(p1.equals(p2));		//�޼ҵ� ������ ���Ĵ� �� ��
	
	}
}
class Point extends Object {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		Point other = (Point)obj;			//Object��(�θ�) obj�� Point��(�ڽ�)���� ���� ����ȯ
		if(this.x == other.x && this.y == other.y) return true;
		else return false;
	}
	@Override
	public String toString() {
		return "(x, y) = (" + x + ", " + y + ")";
	}
	
}