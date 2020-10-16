
public class ConstructorDemo2 {
	public static void main(String[] args) {
		//Box box = new Box();			//사용자가 생성자 만들었으므로 기본 생성자는 자동으로 안만들어짐
		Box box = new Box(10, 50, 100);			//box에 초기화 하면서 Box의 주소 할당
		//System.out.println("박스의 길이는 " + box.getLength());
		box.print();
	}
}
//class Box {
//	private int width, height, length;
//
//	public Box(int width, int height, int length) {		//너비, 높이, 세로 : 생성자로 초기화 됨
//		this.width = width;											//따라서 setter는 필요x
//		this.height = height;
//		this.length = length;
//	}
//
//	public int getWidth() {
//		return width;
//	}
//
//	public int getHeight() {
//		return height;
//	}
//
//	public int getLength() {
//		return length;
//	}
//	
//	public void print() {
//		System.out.printf("너비 = %d, 길이 = %d, 높이 = %d%n", this.width, this.length, this.height);
//	}			// 헷갈릴게 없어서 this안써도 되긴 됨
}