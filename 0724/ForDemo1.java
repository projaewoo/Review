/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ForDemo1 {
	public static void main(String[] args) {
		int i = 1;									//main�� ��������(i)�� for����� i �������
		for( /*int i = 1 */; i < 11 ; /* i++ */) {			//for�� ����� i ������ // i : for���� ��������
			System.out.printf("%5d", i);		//5ĭ Ȯ���ؼ� ������ ����
			i++;					//����ġ�� for�� �ȿ� �־ ��
		}
		System.out.println("\ni = " + i);

		//x�� 1���� 100���� 3�� �����ϰ�, y�� 100���� 2�� ����.
		//������ x�� y�� ������ ���̴�.
		//������ ���� x�� y�� ����?
		int x, y;		//����
		for(x = 1, y = 100 ; x < 101 ; x += 3, y -= 2) {	//�ʱ�Ŀ� int x, y�����ϸ� for�� ����� ������. ���� �ʱ�ġ�� for�ۿ��� ����
			if(x > y) break;  //x > y�϶� for�� ����ٴ� ��
		}
		System.out.printf("x = %d, y = %d\n", x, y);

	}
}
