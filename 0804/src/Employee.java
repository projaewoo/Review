/*
*class���� ��, ������ ������� �Ǵ� Ŭ�������� ��� ������ ������ ���ΰ�??
*member variable : Member���� ���� ����
*class variable : Member���� �����ϴ� ���������̱� ������ �� 1���� ����.
*member variable �ʱ�ȭ : �ʱ�ȭ ��� / �����ڰ� ����
*class variable �ʱ�ȭ : static�ʱ�ȭ ����� ����
*/

public class Employee {
	private String name;
	private int salary;
	private static int count;				//static���� = Employee���� �����ϴ� ����
	static {			//class Initialization Block
		//Instance Initialization Block
		count = 10;			//�Ȱ��� ���� ������ �ʱ�ȭ ������ �� ����.
	}
	public Employee(String name) {
		this.name = name;     count++;		//static������ Employee������ �ۿ��� �̸� �����Ǿ��־
	}
	public void print() {
		System.out.println("������ �� = " + count);
	}
}
