import java.util.Scanner;
//���డ�� �ý���
public class ArrayDemo4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] array = {"���డ��", "���డ��",  "���డ��", "���డ��", "���డ��", "���డ��", "���డ��", "���డ��", "���డ��", "���డ��"};
		int count = 0;
		while(true) {
			System.out.print(">�¼��� �����Ͻðڽ��ϱ�? (��-1 �ƴϿ�-0) : ");
			int result = scan.nextInt();
			if(result ==1) {
				System.out.println("== ���� �¼� ���� ==");
				for(int i = 0; i < array.length; i++) {
					System.out.printf("[%d]%-10s", (i+1), array[i]);
					if( (i+1) % 5 == 0) System.out.println();
				}
				System.out.println();
				System.out.print("�� ��° �¼��� �����Ͻðڽ��ϱ�? : ");
				int seatNo = scan.nextInt();
				if(seatNo > array.length)  System.out.println("�߸��� �¼���ȣ�Դϴ�.");
				else if(array[seatNo - 1].equals("�����")) 	System.out.println("�̹� ����� �¼��Դϴ�.");
				else {
					array[seatNo - 1] = "�����";
					System.out.println(seatNo + "��° �¼��� ����Ǿ����ϴ�.");
					count++;
					if(count == 10) {
						System.out.println("��� �¼��� ������ �����Ǿ����ϴ�.");
						return;
					}
				}
			}else {
				System.out.println("Program is over...");
				return;			//main�� ��� //���α׷� ��
			}
			
		}
		
	}
}