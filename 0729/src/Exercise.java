import java.util.Scanner;

public class Exercise {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String [] array = new String[10];
	array = new String[] {"예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능"};
	int count = 0;
	while(true) {
		System.out.print(">좌석을 예약하시겠습니까?");
		int result = scan.nextInt();
		if(result == 1) {
			System.out.println("== 현재 좌석 상태 ==");
			for(int i = 0; i < array.length; i++) {
				System.out.printf("[%d]%-10s", (i+1), array[i]);
				if( (i+1) % 5 ==0 ) System.out.println();
			}
			System.out.println();
			System.out.println("몇 번째 좌석을 예약하시겠습니까? :");
			int seatNo = scan.nextInt();
		}
		
		
		
	}
	 
  }
}
