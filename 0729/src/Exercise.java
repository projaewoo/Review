import java.util.Scanner;

public class Exercise {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String [] array = new String[10];
	array = new String[] {"���డ��", "���డ��", "���డ��", "���డ��", "���డ��", "���డ��", "���డ��", "���డ��", "���డ��", "���డ��"};
	int count = 0;
	while(true) {
		System.out.print(">�¼��� �����Ͻðڽ��ϱ�?");
		int result = scan.nextInt();
		if(result == 1) {
			System.out.println("== ���� �¼� ���� ==");
			for(int i = 0; i < array.length; i++) {
				System.out.printf("[%d]%-10s", (i+1), array[i]);
				if( (i+1) % 5 ==0 ) System.out.println();
			}
			System.out.println();
			System.out.println("�� ��° �¼��� �����Ͻðڽ��ϱ�? :");
			int seatNo = scan.nextInt();
		}
		
		
		
	}
	 
  }
}
