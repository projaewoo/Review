/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� : ");
		int jumsu = scan.nextInt();
		//����1 
		//if (jumsu >= 60)   System.out.println("�ʱ� �հ��Դϴ�.");
		//if(jumsu < 60)       System.out.println("�ƽ����ϴ�. ���� ��ȸ��...");

		//����2
		/*if (jumsu >= 60) {
			System.out.println("�����մϴ�.");
			System.out.println("�ʱ� �հ��Դϴ�.");
		} else {			//jumsu < 60
			System.out.println("�ƽ����ϴ�.");
			System.out.println("���� ��ȸ�� �ٽ� �������ּ���.");
		}  */

		//����3
		/*if (jumsu >= 90) {
			System.out.println("�����մϴ�. ����մϴ�.");
			System.out.println("�ʱ� �հ��Դϴ�.");
		} else if (jumsu >= 60){		//60 <= jumsu < 90�� ������
			System.out.println("Good.");
			System.out.println("�ʱ� �հ��Դϴ�.");
		} else if (jumsu >= 50) {		//50 <= jumsu < 60
			System.out.println("�ʹ� �ƽ����ϴ�.");
			System.out.println("���� ��ȸ�� �������ּ���.");
		} else {									//jumsu < 50
			System.out.println("���հ��Դϴ�.");
		}  */

		if(jumsu >= 60) {
			System.out.println("�հ��Դϴ�.");
			if(jumsu >= 90) System.out.println("Wow!!! ����մϴ�.");  //60 <= jumsu, 90 <= jumsu
			else System.out.println("Good.");  //60 <= jumsu < 90
		} else {
			System.out.println("���հ��Դϴ�.");
			if(jumsu >= 50) System.out.println("���� �ƽ����ϴ�.");	//50 <= jumsu < 60
			else System.out.println("�� �� �й��ϼ���.");				//jumsu < 50
		}


	}
}