/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class NineTimesTable {
	public static void main(String[] args) {
		int i = 1;  //�ʱ�ȭ
		do{
			int j = 2;	//j�� �ʱ�ȭ
			do{
				System.out.printf("%d x %d = %d   ", j, i, j * i);
				j++;		//����ġ
			}while(j < 10);	//����
			System.out.println();
			i++;   //����ġ
		}while(i < 10);  //����
	}
}