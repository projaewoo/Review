
public class ConstructorDemo2 {
	public static void main(String[] args) {
		//Box box = new Box();			//����ڰ� ������ ��������Ƿ� �⺻ �����ڴ� �ڵ����� �ȸ������
		Box box = new Box(10, 50, 100);			//box�� �ʱ�ȭ �ϸ鼭 Box�� �ּ� �Ҵ�
		//System.out.println("�ڽ��� ���̴� " + box.getLength());
		box.print();
	}
}
//class Box {
//	private int width, height, length;
//
//	public Box(int width, int height, int length) {		//�ʺ�, ����, ���� : �����ڷ� �ʱ�ȭ ��
//		this.width = width;											//���� setter�� �ʿ�x
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
//		System.out.printf("�ʺ� = %d, ���� = %d, ���� = %d%n", this.width, this.length, this.height);
//	}			// �򰥸��� ��� this�Ƚᵵ �Ǳ� ��
}