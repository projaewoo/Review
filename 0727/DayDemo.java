/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Scanner;

public class DayDemo {
	public static void main(String[] args) {
		/*int year, month, day, total, count = 0;
			System.out.print("Year : " );	year = scan.nextInt();
			System.out.print("Month : " );	month = scan.nextInt();
			System.out.print("Day : " );	day = scan.nextInt();
			
			for(int i = 1 ; i < year ; i++) {
				for(int j = 1 ; j < year ; j++) {
					if(j % 4 == 0 && j % 100 ==0 || j % 400 == 0)	count++;
										
				}
				
			}
			
			total = ( (year - count) * 365 + (count) * 366 ) +
						(                                     ) +
					   day * (); */
			
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� �� : ");
		String yearStr = scan.next();		
		int year = Integer.parseInt(yearStr);		//"2020" --> 2020

		String monthStr = scan. next();			//"7"
		int month = Integer.parseInt(monthStr);

		String dayStr = scan. next();				//"27"
		int day = Integer.parseInt(dayStr);

		//���� 1����� year - 1����� �� ����
		int total = 0;
		for(int i = 1 ; i < year ; i++) {
			if(i % 400 == 0 || (i % 4 ==0 && i % 100 != 0)) total += 366;
			else total += 365;
		}		//2019�� 12�� 31�ϱ��� �� ����

		

		//���� 1������ 6�������� �� //2�� ������ ��¥�� ���⿡ ���� �ȹ���
		int [] array;	//����
		if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)) {
			//���ذ� �����̶��
			array = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//���� �� �Ҵ�
		}else {
			//���ذ� ������ �ƴ϶��
			array = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
		} 
	
		for(int i = 0 ; i < month - 1 ; i++) {		//�迭 �󿡼� 0��~5�� = ������ 1�� ~ 6��
			total += array[i];
		}  //2020�� 6�� 30�ϱ��� ��¥ ����

		//�̹��� ���ϱ�
		total += day;
		System.out.println("total = " + total);
		switch(total % 7) {			//���� ���ϱ�
			case 0 : System.out.println("�Ͽ����Դϴ�."); break;
			case 1 : System.out.println("�������Դϴ�."); break;
			case 2 : System.out.println("ȭ�����Դϴ�."); break;
			case 3 : System.out.println("�������Դϴ�."); break;
			case 4 : System.out.println("������Դϴ�."); break;
			case 5 : System.out.println("�ݿ����Դϴ�."); break;
			default :  System.out.println("������Դϴ�."); break;
		}
		
	}
}
