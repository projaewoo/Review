
public class EnumDemo {
	public static void main(String[] args) {
		//Week week = new Week();		//Enum�� ������x	//public static�̹Ƿ� new ���X
		Week week = Week.WED;
		System.out.println(week);
		
		//int su = (int)week;		//ERROR		//Enum�� ���� ����ȯx
		int su = week.ordinal();		//Enum Week�� Enum<Week>�� ��ӹ���.	//Enum�� �޼ҵ� ��밡��
		System.out.println(su);		//week�� ������ �ּҸ� �����ϴ� su���		//���� : Enum���� WED�� ����
		
		//���
		Week [] array = Week.values();		//Week�迭 ����
		for(Week w : array) {
			System.out.println(w);			//�̸����
			System.out.println(", " + w.getValue());		//�� ���
			System.out.println(", " + w.ordinal());			//���� ��� (Week���� ������ ����� ����)
		}
	}
}
