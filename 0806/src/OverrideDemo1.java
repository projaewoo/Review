
public class OverrideDemo1 {
	public static void main(String[] args) {
		Point p1 = new Point(3, 5);		System.out.println(p1);
		Point p2 = new Point(3, 5);		System.out.println(p2);
		System.out.println(p1 == p2);			//주소 비교
		//System.out.println(p1.equals(p2));	//원래는 주소 비교		//String클래스의 equals는 그 클래스에서 값 비교할 수 있게 재정의해서
																//원래 equals는 주소비교
		System.out.println(p1.equals(p2));		//메소드 재정의 이후는 값 비교
	
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
		Point other = (Point)obj;			//Object형(부모) obj를 Point형(자식)으로 강제 형변환
		if(this.x == other.x && this.y == other.y) return true;
		else return false;
	}
	@Override
	public String toString() {
		return "(x, y) = (" + x + ", " + y + ")";
	}
	
}