/*
�ۼ��� : �����
�ۼ����� : ��������
�ۼ��Ͻ� : 7�� 23��
�ۼ�ȯ�� : Windows
*/
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		int a, b, max, min, result = 0;
		String operator;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° �� : " );		a = scan.nextInt();
		System.out.print("�ι�° �� : " );		b = scan.nextInt();
		System.out.print("������(+, -, x, /, %) : " );		operator = scan.next();
		
		if(a > b) {
			max = a; min = b;
		} else {
			max = b; min = a;
		}

		switch(operator) {
			case "+" : result = a + b;
							operator = "+"; break;
			case "-" : result = max - min;
							operator = "-"; break;
			case "x" : result = a * b;
							operator = "x"; break;
			case "/" : result = a / b;
							operator = "/"; break;
			case "%" : result = a % b;
							operator = "%";  break;
			default : System.out.println("�߸��� �������Դϴ�.");
		}

		System.out.println("----------------");
		if(operator == "-")  System.out.printf("%d %s %d = -%d\n",
																a, operator, b,      result);
		else System.out.printf("%d %s %d = %d\n",
										a, operator, b,      result);
	}
}