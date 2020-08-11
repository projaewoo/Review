//Flag Interface

public interface InterfaceDemo3 {
	public static void main(String[] args) {
		Demo d = new Demo(24);
		//Demo other = d;					//��ü ����. (�ּҺ���)
		//��ü ���� (�Ȱ��� �� 2��) = (���� 2��) = �� ����.
		Demo other = (Demo)d.copy();			//�Ѿ���°� Object���̹Ƿ� Demo������ ���� ����ȯ
	}
}											//implements Cloneable : Demo�� cloneable�Ǵ°� �˷��ִ� ���Ҹ�.
class Demo extends Object implements Cloneable {
	public int age;
	public Demo(int age) {this.age = age;}
	public Object copy() {
		//Demo d = this.clone();			//Object������ ������ �ؼ� ERROR
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {		//���� �����ϸ�
			System.out.println("������ �����߽��ϴ�.");
		}			
		return obj;
	}
}