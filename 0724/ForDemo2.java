/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Scanner;

public class ForDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� ? : ");
		int dan = scan.nextInt();
		for(int i = 1 ; i < 10 ; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
	}
}
