import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

//��¥ ����ϴ� 2��° ���  Calendar�̿�
public class TodayDemo1 {
	public static void main(String[] args) {
//		Calendar cal = new Calendar();		//�߻�Ŭ������ new����
//		Calendar cal = new GregorianCalendar(2020, 7, 12);	//���� : �θ���, ���� : �ڽ���	//�����ڷ� ���� ����.
//		int year = cal.get(Calendar.YEAR);		//static���
//		int month = cal.get(Calendar.MONTH + 1);
////		int day = cal.get(Calendar.DATE);
//		int day = cal.get(Calendar.DAY_OF_MONTH);	//������ �̹����� ����?
//		System.out.println("Today is " + year + "��" + month + "��" + day + "��");
		
		//2-2���
//		Calendar cal = Calendar.getInstance(Locale.KOREA);		//���� ��ġ�� �´� ��¥ �ð�
//		int year = cal.get(Calendar.YEAR);		//static���
//		int month = cal.get(Calendar.MONTH) + 1;
//		int day = cal.get(Calendar.DAY_OF_MONTH);	//������ �̹����� ����?
//		System.out.println("Today is " + year + "��" + month + "��" + day + "��");
		
		//�޷� �����
		Calendar cal = new GregorianCalendar(2020, 7, 1);		//2020�� 8�� 1��		//�ڹ� : 0~11��
		int yoil = cal.get(Calendar.DAY_OF_WEEK);		//�̹����� ������ ����	//�Ͽ��� : 1 ~ 7(�����)
		int lastDay = cal.getActualMaximum(Calendar.DATE);		//���� ���� ū ��
		System.out.println(yoil);
	}
}
