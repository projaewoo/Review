/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ContinueDemo {
	public static void main(String[] args) {
		int i = 1;		//�ʱ�ġ
		do{
			if(i % 7 ==0) System.out.printf("%-3d", i);
			//else continue;		//7�� ����� �ƴϸ� �������� ����
			i++;			//����ġ
		}while(i < 101);	//����
	}
}
