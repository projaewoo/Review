/*
�ۼ��� : ����� 
�ۼ����� : ��������
�ۼ��Ͻ� : 7�� 24��
�ۼ�ȯ�� : Windows
*/

public class Exercise {
	public static void main(String[] args) {
		
		System.out.println("1������");
		//1������. 100������ �ڿ��� �� 4�� ����̸� 5�� ����� �ƴ� �� ���
			for(int j = 1 ; j <= 100 ; j++) {
				if( (j % 4 == 0) && (j % 5 != 0))
				System.out.print(j + " ");
			}
		

		System.out.println();
		System.out.println("2������");
		//2������. 100������ �ڿ��� �߿��� 7 �Ǵ� 9�� ����� �� ���
		for(int i = 1 ; i <= 100 ; i++) {
			if( (i % 7 == 0) || (i % 9 == 0)) System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("3������");
		//3������. �ڿ��� �� 100�� ����� ��� ã�� 1�ٿ� 3���� ���
		//��� : 100�� ���� �� �ִ� �� //100%i == 0�� i
		int count = 0;
		for(int i = 2 ; i <= 99 ; i++) {
			if (100 % i == 0){
				System.out.print(i + " ");
				count++;
				if(count % 3 == 0 ) System.out.println();
			}
		}


		System.out.println();
		System.out.println("4������");
		//4������. 1~5, 2~5, 3~5, 4~5, 5 �� �ٲٸ� ���
		// 1 ~ i ~ 5
		// i ~ j ~ 5 (1�� ����)
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = i ; j <= 5 ; j++) {	 //i�� 1�϶�, j�� 1�� ���� //j�� �����Ҷ� i���� ����
				System.out.print(j + " ");
			}
			System.out.println();
		}

		/*int i = 1;
		while(i < 6) {
			int j = i;
			while(j < 6) {
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
			i++;
		} */


		System.out.println();
		System.out.println("5������");
		//5������. �����ڵ� 41~122�������� �ڵ�� ���ڸ� �� �ٿ� 8���� ���
		//ù�� : 8��, ��°�� : 8��
		//�� ������ �� 1 ~ i ~ ?
		int counts = 0;
		for(int i = 41 ; i <= 122; i++) {
			System.out.print(i + " : " + (char)i + "    ");
			counts++;
			if(counts % 8 ==0) System.out.println();
		}

		/*int i = 41, count = 0;
		while(i < 123) {
			System.out.print(i + " : " + (char)i);
			count++;
			if(count % 8 == 0) System.out.println();
			i++;
		}*/
		


	}
}
