/*
 * 1. this.  --> '����'  = ��������� ��������� ����޼ҵ带 ��Ī�� ��
 * 2. this --> '���� �� �ٸ� �ּ�' (ö��, ���� �� ��) // ex) return this / parameter�� (this)
 * 3. this() �޼ҵ� --> new ���� �����ڿ��� �� �ٸ� �����ڸ� ȣ���ϱ�
*/
public class ThisDemo1 {
	public static void main(String[] args) {
		Student chulsu = new Student("������");
		chulsu.print();
	}
}
