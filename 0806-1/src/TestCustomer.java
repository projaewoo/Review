import java.util.Scanner;

public class TestCustomer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] array = new String[5];
		array[0] = "�� �̸� : ";
		array[1] = "�� �ּ� : ";
		array[2] = "�� ��ȭ��ȣ : ";
		array[3] = "�� ��ȣ : ";
		array[4] = "�� ���ϸ��� : ";
		for(int i = 0 ; i < array.length; i++) {
			if(i != 4) {
				System.out.printf("%s ", array[i]);
				String s = scan.next();
			}else {
				//scan.next();
				System.out.printf("%s ", array[i]);
				int n = Integer.parseInt(scan.next());
			}
			
//			parseInt()
//			Customer c = new Customer(name, address, phoneNumber, id, mileage);
			
		}
		
		
		
	}
}
