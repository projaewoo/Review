/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class DoWhileDemo2 {
	public static void main(String[] args) {
		for(int i = 1 ; i < 6 ; i++) {
			int j = 1;  //�ʱ�ġ
			do{
				if(i == j) System.out.printf("%3d", i);
				else System.out.printf("%3d", 0);
				j++;				//����ġ
			}while(j < 6);		//����
			System.out.println();


		}
	}
}
