/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ValueCopyTest {
	public static void main(String[] args) {
			/*int first, second;
            first = 7;
            second = first;
            System.out.println("first = " + first);
            System.out.println("second = " + second);

            System.out.println("�� ��ȯ ��");
            second = 10;
            System.out.println("first = " + first);
            System.out.println("second = " + second); */

		double original = 173.6;
		double copy = original;  //����
		System.out.printf("original = %.1f, copy = %.1f\n", original, copy);
		
		original = 190.4;
		System.out.printf("original = %.1f, copy = %.1f\n", original, copy);

		/*
			�� ����
			1. ��� : primitive type
			2. ���� : ������ �ٲ�ٰ� ī�Ǻ��� �ٲ��� ����
	}
}
