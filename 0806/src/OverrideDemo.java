import java.util.Date;

public class OverrideDemo {
	public static void main(String[] args) {
		//Integer in = new Integer();		//Integer�� �⺻ ������ ����
		Integer in = new Integer(100);
		System.out.println(in.toString());			//�� Object���� �ڽ��� �޼ҵ�
																	//�ڽ� Ŭ������ �°� ������	//Override�� ������ �ȵǼ� �ڽ� Ŭ������ ������� ������ ����
		System.out.println(in);				//toString�� ���� ���� //toString �������� Ŭ������ �ּ� ������ ���������� ȣ���ص� toString�޼ҵ� ȣ��
		
		
		Demo d = new Demo();
		System.out.println(d.toString());		//�� Object���� �ڽ��� �޼ҵ�
																//Demo���� Override���ؼ� Object�� toString() ���
		System.out.println(d);
		
		
		Date now = new Date();
		System.out.println(now.toString());		//�� Object���� �ڽ��� �޼ҵ�
		System.out.println(now);
	}
}
class Demo extends Object {
	String name = "������";
	@Override
	public String toString() {			//Override (������)
		//return "�̸��� " + this.name + "�Դϴ�.";
		return String.format("�̸��� %s �Դϴ�.%n", this.name);
	}
}