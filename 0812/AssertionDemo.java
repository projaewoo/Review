
public class AssertionDemo {
	public static void main(String[] args) {
		int i, sum = 0;
		for(i = 1 ; i < 101; i++) {	//i�� ���� ���� �� ���Ҵ��� �Ǵ�
			sum = i;							
		}								
//		if(i <= 100) System.out.println("100�� �ݺ� ���� Ȯ���Ұ�");	//����, ������ �� �� üũ����
		//�����ڸ� üũ�ϴ� ���
		//�⺻������ assertüũ X (�⺻������ default��)
		//�����Ҷ�, -ea�ɼ� ��� assertüũ��. //cmd���� java -ea AssertionDemo	//Run Configuration -> VM Arguments�� -ea����
		assert i > 100 : "100�� �ݺ� ���� Ȯ���� ��";	//i>100 �ƴҶ� ���� ���� ���, ���α׷� ����. (9�� ����x)
		//�߸��ؼ� sum = i;�� �߸��ϸ�
		assert sum > 100 : "���� �˻� �ʿ�";
		System.out.println("sum = " + sum);		//i > 100�϶� ���
	}
}
