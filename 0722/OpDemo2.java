/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Scanner;

public class OpDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first, second;  //����
		System.out.print("ù��° ���� : ");		first = scan.nextInt();
		System.out.print("�ι�° ���� : ");	    second = scan.nextInt();
		System.out.printf("%d + %d = %d\n", first, second, (first + second));
		System.out.printf("%d - %d = %d\n", first, second, (first - second));
		System.out.printf("%d x %d = %d\n", first, second, (first * second));
		System.out.printf("%d / %d = %d\n", first, second, (first / second));
		System.out.printf("%d %% %d = %d\n", first, second, (first % second));
	}
}
