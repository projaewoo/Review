/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ForDemo3 {
	public static void main(String[] args) {
		/*int count = 0;
		for(int i = 1; i <= 50; i++) {		//i : Ƚ��
			System.out.print("��  ");
			count++;
			if(count % 10 == 0)  System.out.println();
		} */


		/*for(int i = 1 ; i < 6 ; i++) {	//���� �Ʒ��� ���
			System.out.println("��");
		} */


		/*for(int i = 1; i < 6 ; i++) {	//���߿� //1 ~ 5 //5���̶�� ����
			for(int j = 1 ; j < 11 ; j++) {			//��øfor�� //����  //1 ~ 10 //������ 10�� ��´ٴ� ����
				System.out.print("��  ");
			}
			System.out.println();
		} */


		/*for(int i = 1 ; i <=26 ; i++) {  //5��
			for(int j = 65 ; j <= 90 ; j++) {  //26�� ���� ���
				System.out.print((char)j + "  ");
			}
			System.out.println();
		} */
		

		/*for(int i = 1 ; i <= 10 ; i++) {
			for(int j = 1; j <= i; j++) {		//j : 1 ~ i
				System.out.print("��  ");
			}
			System.out.println();		//1�ٿ� �� �� ��� �� �ٲ�
		} */ 


		/*for(int i = 0 ; i <= 25 ; i++) {		//26Line
			for(int j = 65 ; j <= (65 + i) ; j++) {	
				System.out.print((char)j + " ");
			}
			System.out.println();
		} */

		/*char ch = 65;
		for(int i = 1 ; i <= 7 ; i++) {
			for(int j = 1 ; j <= i && ch <= 90 ; j++) {		//ch<=90 ������ z���ķε� ��µ�
				System.out.printf("%5c", (char)ch);	
				ch++;
			}
			System.out.println();
		} */


		// ���� : 1 ~ i ~ 5
		// ���� : 0 ~ j ~ 5
		/*for(int i = 1; i <= 5 ; i++) {  //5Line // i : 1~5
			for(int j = 0; j <= 5 ; j++ ) { // j : 0~5
				System.out.print(j + " ");
			}
			System.out.println();		//j������ �ٹٲ�
		} */

		//���� : 0 ~ i ~ 5
		//j�� ���� : i�� 5��(1~5) ����  //j : Ƚ��
		/*for(int i = 0 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}*/


		System.out.println("------------");
		System.out.println("------------");
		//0 ~ i ~ 4
		//j�� ���� : i ~ i+5
		/*for(int i = 0 ; i <= 4 ; i++) {
			for(int j = i ; j <= i+5 ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		System.out.println("------------");
		//�� 5��, 4��, 3... 1�� ��� ���α׷�
		//5 ~ i ~ 1 (5Line)
		// j�� ���� : 5 ~ 1 (5�� ���)
		/*for(int i = 5; i >= 1 ; i--) {
			for(int j = i ; j >= 1 ; j--) {
				System.out.print("�� ");
			}
			System.out.println();
		}*/

		System.out.println("------------");
		//������
		for(int i = 1 ; i <= 9 ; i++) {  //���ϴ� ����
			for(int j = 2 ; j <= 9 ; j++) {	//�������� ����
				System.out.printf("%d x %d = %d   ",  j,  i,  j*i);
			}
			System.out.println();
		}


	}
}