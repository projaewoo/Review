
public class FinalDemo {
	int age;			//member����
	final double PI;		//member constant
	static int kor;		//class ����
	static final int ENG;		//static constant
	static{				//static �ʱ�ȭ ���
		kor = 90;		//static variable �ʱ�ȭ
		ENG = 100;		//static constant �ʱ�ȭ
	}
	public FinalDemo() {		//������
		this.age = 24;		//member���� �ʱ�ȭ
		this.PI = 3.14;		//member��� �ʱ�ȭ
	}
	public static void main(String[] args) {
		final String NAME = "������";			//local���
		//NAME = "������";
	}
}
