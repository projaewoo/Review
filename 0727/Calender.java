/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

import java.util.Scanner;

public class Calender {
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
		System.out.print("�� �� : ");
		String yearStr = scan.next();		
		int year = Integer.parseInt(yearStr);		//"2020" --> 2020

		String monthStr = scan. next();			//"7"
		int month = Integer.parseInt(monthStr);

		//String dayStr = scan. next();				//"27"
		int day = 1;  //�޷��� �ſ� 1�� ����

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
		//System.out.println("total = " + total);
		int space = total % 7;			//�տ� ��ĭ �����ϴ���
		int maxDay = array[month-1];					//7���� ���ϱ���?
		//System.out.println("���� = " + space + ", ������ ���� = " + maxDay);
		/*switch(total % 7) {			//���� ���ϱ�
			case 0 : System.out.println("�Ͽ����Դϴ�."); break;
			case 1 : System.out.println("�������Դϴ�."); break;
			case 2 : System.out.println("ȭ�����Դϴ�."); break;
			case 3 : System.out.println("�������Դϴ�."); break;
			case 4 : System.out.println("������Դϴ�."); break;
			case 5 : System.out.println("�ݿ����Դϴ�."); break;
			default :  System.out.println("������Դϴ�."); break;
		} */
		System.out.println("              #### " + year + "�� " + month + "�� ####");
		System.out.println("��\t��\t��\t�\t��\t��\t��");
		System.out.println("-----------------------------------------------------");
		//�޷� ù°�� ����ó��
		int count = 0;
		for(int i = 0 ; i < space ; i++) {
			System.out.print("��\t");  count++;
		}
		//1�Ϻ��� ������ ������ ���
		for(int i = 1 ; i <= maxDay ; i++) {
			System.out.print(i + "\t");
			count++;
			if(count % 7 ==0) {
				System.out.println();
				count = 0;
			}
		}
		//������ �� ó��
		if(count != 0) {   //���� ������ ���� ������̸� �ؿ� 7���� ���׶�� ��
			for(int i = 0; i < (7 - count) ; i++) {
				System.out.print("��\t");
			}	
		}
		
	}
}