import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		Student younghee = new Student();
		input(younghee);
		calc(younghee);
		output(younghee);
	}
	//prototype
	static void input(Student s) {	//입력받을 학생	//주소복사 = 알아서 바뀌므로 void
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 : ");    String hakbun = scan.next();
		System.out.print("이름 : ");		String name = scan.next();
		System.out.print("국어 : ");		int kor = scan.nextInt();
		System.out.print("영어 : ");		int eng = scan.nextInt();
		System.out.print("수학 : ");		int mat = scan.nextInt();
		s.hakbun = hakbun;   s.name = name;   s.kor = kor;
		s.eng = eng;   s.mat = mat;
	}
	static void calc(Student s) {		//계산할 학생(입력이 된 학생)//주소복사= 알아서 바뀌므로 void
		int tot = s.kor + s.eng + s.mat;
		double avg = tot / 3.;
		char grade = (avg >= 90)? 'A' :
								(avg >= 80)? 'B' :
									(avg >= 70)? 'C' :
										(avg >= 60)? 'D' : 'F' ;
		s.tot = tot;   s.avg = avg;    s.grade = grade;
	}
	//sort()
	static void output(Student s) {	//출력할 학생	//주소복사 //이미 입력과 계산이 끝난 학생
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n", 
								s.hakbun, s.name, s.kor, s.eng, s.mat, s.tot, s.avg, s.grade);
	}
}
