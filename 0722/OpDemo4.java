/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class OpDemo4 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		boolean a1 = true;
		boolean b1 = false;
		System.out.printf("a == b ==>%b\n", (a == b));
		System.out.printf("a == b ==>%b\n", (a1 == b1));
		System.out.printf("a != b ==>%b\n", (a != b));
		System.out.printf("a != b ==>%b\n", (a1 != b1));

		String name = "������";
		System.out.printf("������ == name ==> %b\n", ("������" == name));
		System.out.printf("������ == name ==> %b\n", ("������".equals(name)));
		//���ڿ��� �� �񱳴� == �����ڰ� �ƴ϶� equals() �޼ҵ带 ���

		System.out.printf("������ == name ==> %d\n", ("������".compareTo(name)));
		
	}
}
