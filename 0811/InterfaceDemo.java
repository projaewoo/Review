import java.util.Arrays;

public class InterfaceDemo {
	public static void main(String[] args) {
		Car [] array = new Car[4];
		array[0] = new Car("�ҳ�Ÿ", 25_000_000, "�����ڵ���");		//Object�� �迭�� Object�� �ڽĹ迭�� �� �� ����.
		array[1] = new Car("��Ƽ��", 10_000_000, "����ڵ���");
		array[2] = new Car("ī�Ϲ�", 35_000_000, "����ڵ���");
		array[3] = new Car("SM6", 30_000_000, "����Ｚ�ڵ���");
		Arrays.sort(array);				//sort()����Ϸ��� CarŬ������ Comparable�������̽� �����ؾ���.
		System.out.println(Arrays.toString(array));
	}		//���� Arrays.sort(Object[] a) : parameter�� Object�迭�� �޾ƾ���
}			//�׷��� Comparable�������̽� ������ Car�� array�� parameter�� ����
			//Car���� �������� compareTo()�޼ҵ带 �������� Car�迭�� �̹� sort��.