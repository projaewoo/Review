import java.util.Scanner;

public class TestCustomer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] array = new String[5];
		array[0] = "绊按 捞抚 : ";
		array[1] = "绊按 林家 : ";
		array[2] = "绊按 傈拳锅龋 : ";
		array[3] = "绊按 锅龋 : ";
		array[4] = "绊按 付老府瘤 : ";
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
