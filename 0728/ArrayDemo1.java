/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Scanner;
public class ArrayDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] monthMaxDayes = new int [6];
		String [] monthNames = new String[6];
		monthMaxDayes[0] = 31;		monthNames[0] = "January";
		monthMaxDayes[1] = 29;		monthNames[1] = "February";
		monthMaxDayes[2] = 31;		monthNames[2] = "March";
		monthMaxDayes[3] = 30;		monthNames[3] = "April";
		monthMaxDayes[4] = 31;		monthNames[4] = "May";
		monthMaxDayes[5] = 30;		monthNames[5] = "June";
		System.out.print("�� �� ? : ");	int month = scan.nextInt();
		System.out.printf("%d���� %s, ���������� %d���Դϴ�.\n",
												month, monthNames[month - 1], monthMaxDayes[month-1]);

	}
}
