/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class Multiple {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("������");
		do{
			int j = 1;
			do{
				System.out.printf("%d x %d = %d   ", j, i, (i * j));
				j++;
			}while(j < 10);
			System.out.println();
			i++;
		}
		while (i < 10);

		

	}
}
