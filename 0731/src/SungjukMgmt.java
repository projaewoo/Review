import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		Student younghee = new Student();
		input(younghee);
		calc(younghee);
		output(younghee);
	}
	//prototype
	static void input(Student s) {	//�Է¹��� �л�	//�ּҺ��� = �˾Ƽ� �ٲ�Ƿ� void
		Scanner scan = new Scanner(System.in);
		System.out.print("�й� : ");    String hakbun = scan.next();
		System.out.print("�̸� : ");		String name = scan.next();
		System.out.print("���� : ");		int kor = scan.nextInt();
		System.out.print("���� : ");		int eng = scan.nextInt();
		System.out.print("���� : ");		int mat = scan.nextInt();
		s.hakbun = hakbun;   s.name = name;   s.kor = kor;
		s.eng = eng;   s.mat = mat;
	}
	static void calc(Student s) {		//����� �л�(�Է��� �� �л�)//�ּҺ���= �˾Ƽ� �ٲ�Ƿ� void
		int tot = s.kor + s.eng + s.mat;
		double avg = tot / 3.;
		char grade = (avg >= 90)? 'A' :
								(avg >= 80)? 'B' :
									(avg >= 70)? 'C' :
										(avg >= 60)? 'D' : 'F' ;
		s.tot = tot;   s.avg = avg;    s.grade = grade;
	}
	//sort()
	static void output(Student s) {	//����� �л�	//�ּҺ��� //�̹� �Է°� ����� ���� �л�
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n", 
								s.hakbun, s.name, s.kor, s.eng, s.mat, s.tot, s.avg, s.grade);
	}
}
