
public class ConstructorDemo {
	String name;
	int price;
	boolean flag;
	double avg;
//	public ConstructorDemo() {			//default constructor	//public, �޼ҵ� �̸� = Ŭ���� �̸�
//		this.name = null;    this.price = 0;  this.flag = false;
//		this.avg = 0.0;
//	}
	public ConstructorDemo() {		//default constructor's overriding (������)
		this.name = "������";    this.price = 0;  this.flag = false;
		this.avg = 0.0;
	}
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();		//new�� ����Ʈ �����ڸ� �ڵ����� call.
//		System.out.println("name = " + cd.name);		//member������ �ּҷ� ����
//		System.out.println("price = " + cd.price);
//		System.out.println("flag =" + cd.flag);
//		System.out.println("avg = " + cd.avg);			//�⺻ ������ (ConstructorDemo())�� �� �ʱ�ȭ
//		String str = new String();  		//API���� StringŬ������ �⺻ ������ �������༭ ��밡��
		System.out.println(cd.name);
		
	}
}
