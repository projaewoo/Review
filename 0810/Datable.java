
public interface Datable {
	//private int kor;			//interface�� ���� X
//	private int KOR = 100;	//private���� X
//	protected int KOR = 100;		//���� ��ü X
//	public int KOR = 100;		//public���� ����. ��� static�� �����Ǿ� ����.
//	static int ENG = 100;
	//int MATH = 90;
	
	int SUN = 0, MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6;	//public static final�� �����Ǿ�����
	//public abstract void print();	//�߻�޼ҵ�		//interface���� �޼ҵ�� �� �߻�޼ҵ��̹Ƿ� abstract��������
	void set(int date);		//public abstract�޼ҵ�
	int get();						//public abstract�޼ҵ�
}
