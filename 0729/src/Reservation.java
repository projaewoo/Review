
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		String [] array = new String[10];
		Scanner scan = new Scanner(System.in);
		int reservation, y_n, count = 0;
		System.out.print("좌석을 예약하시겠습니까? (예 - 1 아니오 - 0)");
		y_n = scan.nextInt();
		while(y_n == 1) {

			if(array[0] == null) {
				for(int i = 0 ; i < array.length ; i++)   array[i] = "예약가능";
			}
			System.out.println("== 현재 좌석 상태 ==");
			for(int i = 0 ; i < array.length ; i++) {
					System.out.print("[" + (i + 1) + "] " + array[i] + "  ");
					count++;
				if(count % 5 ==0) System.out.println();
			}
			
			System.out.print("몇 번째 좌석을 예약하시겠습니까?");
			reservation = scan.nextInt();
			
			if(array[reservation -1].equals("예약됨"))  
				System.out.println("이미 예약된 좌석입니다.");
			else {
				array[reservation -1] = "예약됨";
				System.out.println("예약되었습니다.");
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
			
	}
}
