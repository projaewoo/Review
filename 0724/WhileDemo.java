/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		//1,2,3,4,5
		/*int i = 1;	//�ʱ�ġ
		while( i <= 5 ) {		//����
			System.out.print(i + "   ");
			i++;		//����ġ
		} */

	
		
		/*int i = 1;	//�ʱ�ġ
		while( i <= 100) {		//����
			if(i % 7 == 0) System.out.print(i + " ");
			i++;		//����ġ
		} */

		/*Scanner scan = new Scanner(System.in);
		int max = 0, mynum;
		System.out.print("���� �Է� (������ �Է��Ͻø� ��) : ");

		while((mynum = scan.nextInt()) >= 0) { 
			if(max < mynum) max = mynum;
		}
		System.out.println("max = " + max);	*/

		//�������� while������ ���
		/*int i = 1;
		while(i <= 9) {		//1~9Line
			int j = 2;
			while(j <= 9) {		//�� Line�� 2 ~ j ~ 9
				System.out.printf("%d x %d = %d   ", j, i, j*i);
				j++;
			}
			System.out.println();
		i++;
		} */
		
		//1���� �󸶱��� ���ؾ� �� ����� 100���� �Ѿ���?
		/*int i = 0, sum = 0;
		while(sum < 1000000) {
			 i++;
			sum += i;
		}
		System.out.println("sum = " + sum);
		System.out.println("i = " + i);  */

		int j = 0, sum1 = 0;
		while(true) {
			if(sum1 > 1000000) break;	
			j++;
			sum1 += j;
			
		}
		System.out.println("sum1 = " + sum1); 

	}
}