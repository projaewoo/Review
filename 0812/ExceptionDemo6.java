
public class ExceptionDemo6 {
	public static void main(String[] args) {
		Test t = null;	//Exception�� �ڼ� : korea //���� try-catch�� ����ó���ؾ���.
		try {
			t = new Test(101, 990);			//���ܹ߻��ϸ� ���� ���ϰ� t = null���¿��� catch�� ��.
		} catch (EnglishException | KoreaException e) {	//���� ���� korea�� ����ó��	//korea�� checked, ���� ���� �켱������ ó��
			System.out.println(e.getMessage());
		}
		System.out.println(t);
	}
}
