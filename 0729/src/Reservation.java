
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		String [] array = new String[10];
		Scanner scan = new Scanner(System.in);
		int reservation, y_n, count = 0;
		System.out.print("�¼��� �����Ͻðڽ��ϱ�? (�� - 1 �ƴϿ� - 0)");
		y_n = scan.nextInt();
		while(y_n == 1) {

			if(array[0] == null) {
				for(int i = 0 ; i < array.length ; i++)   array[i] = "���డ��";
			}
			System.out.println("== ���� �¼� ���� ==");
			for(int i = 0 ; i < array.length ; i++) {
					System.out.print("[" + (i + 1) + "] " + array[i] + "  ");
					count++;
				if(count % 5 ==0) System.out.println();
			}
			
			System.out.print("�� ��° �¼��� �����Ͻðڽ��ϱ�?");
			reservation = scan.nextInt();
			
			if(array[reservation -1].equals("�����"))  
				System.out.println("�̹� ����� �¼��Դϴ�.");
			else {
				array[reservation -1] = "�����";
				System.out.println("����Ǿ����ϴ�.");
			}
			
		}
		System.out.println("���α׷��� �����մϴ�.");
			
	}
}
