/*
�ۼ��� : �����
�ۼ����� : ��������
�ۼ��Ͻ� : 7�� 23��
�ۼ�ȯ�� : Windows
*/

import java.util.Scanner;

public class IfDemo2 {
	public static void main(String[] args) {
		String season;
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�. (�ҹ��� ���� �Ǵ� �ѱ۷� �Է�) : ");
		season = scan.nextLine();
		
		System.out.printf("�Է¹��� ������ %s�Դϴ�.\n", season);

		if(season.equals("spring") || season.equals("��")) {
			System.out.println("������, ���޷�");
		} else if (season.equals("summer") || season.equals("����")) {
			System.out.println("���, ��ī�þ�");
		} else if(season.equals("fall") || season.equals("����")) {
			System.out.println("����, �ڽ���");
		} else if(season.equals("winter") || season.equals("�ܿ�")){
			System.out.println("����, ��ȭ");
		}

		//���� //isBlank()�޼ҵ尡 StringŬ������ ���ϰ�, static�ƴ�
				//���� String�� ���������� �ּҷ� ����.
		System.out.println(season.isBlank());
		
	}
}
