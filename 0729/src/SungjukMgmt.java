import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		Student [] array = new Student[3];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < array.length ; i++) {
			array[i] = new Student();		//array�� �� �濡 �л��� �ּ� ����
			System.out.print("�й� : ");
			array[i].hakbun = scan.next();
			System.out.print("�̸� : ");
			array[i].name = scan.next();
			System.out.print("���� : ");
			array[i].kor = scan.nextInt();
			System.out.print("���� : ");
			array[i].eng = scan.nextInt();
			System.out.print("���� : ");
			array[i].mat = scan.nextInt();
			array[i].ranking = 1;		//��� �л��� 1������ ����
		}
		for(Student std : array) {
			std.tot = std.kor + std.eng + std.mat;
			std.avg = std.tot / 3.;
			std.grade = (std.avg >= 90) ? 'A' :
								(std.avg >= 80) ? 'B' :
									(std.avg >= 70) ? 'C' :
									  (std.avg >= 60) ? 'D' : 'F';
		}
		//Selection ����
		for(int i = 0 ; i < array.length -1 ; i++) {
			for(int j = i +1; j < array.length ; j++) {
				if(array[i].tot > array[j].tot) {		
					//i��° �л��� ������ �� ũ�� j��° �л��� ��ŷ 1����
					array[j].ranking++;
				}else if(array[i].tot < array[j].tot) { 
					//i��° �л��� �������� j��° �л��� ������ �� ũ�� i��° �л��� ��ŷ ����
					array[i].ranking++;
				}
			}
		}
		System.out.println("                     <<�ֿ����б� �����������α׷�>>");
		System.out.println("���\t�й�\t\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("--------------------------------------------------------------------");
		for(Student std : array) {
			System.out.printf("%d\t%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n",
							std.ranking, std.hakbun, std.name, std.kor, std.eng, std.mat, 
							std.tot, std.avg, std.grade);
		}
	}
}
