/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ReferenceCopyTest1 {
	public static void main(String[] args) {
		Student chulsu = new Student();
		chulsu.age = 24;
		/*Student younghee = new Student();
		younghee.age = chulsu.age; */
		Student younghee = new Student();

		younghee = chulsu;

		System.out.printf("ö���� ���� = %d, ", chulsu.age);
		System.out.printf("������ ���� = %d\n", younghee.age);

		chulsu.age = 34;
		System.out.printf("ö���� ���� = %d, ", chulsu.age);
		System.out.printf("������ ���� = %d\n", younghee.age);
	}
}
