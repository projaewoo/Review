
public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();		//member�������� ����
		int a = 40, b = 50;			//argument(����, �μ�)  (��������)
		int result = md.calcSum(a, b);		//member method�� �ּҸ� ���� ����  //��ȯ���� result�� ����
		System.out.println(a + "���� " + b + "������ ���� = " + result);
		a = 1; b = 30;
		result = md.calcSum(1, 30);				//Call By Value (���� ���� ȣ��)
		System.out.println(a + "���� " + b + "������ ���� = " + result);
		a = 50; b = 100;
		result = md.calcSum(50, 100);
		System.out.println(a + "���� " + b + "������ ���� = " + result);
	}						//int start, int end = parameter (�Ű�����) (=�޼��� ������ ��������)
	 int calcSum(int start, int end) {	//member method		//max�� 50, 30, 100�� ���� = �� ����
		int sum = 0;
		for(int i = start ; i <=  end ; i++) {
			sum += i;
		}
		//System.out.println(start + "���� " + end + "������ ���� = " + sum);
		//return;;  //������� ����
		return sum;		//sum �����̹Ƿ� method�� ��ȯŸ���� int��
	}	
}