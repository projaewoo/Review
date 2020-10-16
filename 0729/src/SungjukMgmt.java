import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		Student [] array = new Student[3];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < array.length ; i++) {
			array[i] = new Student();		//array의 각 방에 학생들 주소 넣음
			System.out.print("학번 : ");
			array[i].hakbun = scan.next();
			System.out.print("이름 : ");
			array[i].name = scan.next();
			System.out.print("국어 : ");
			array[i].kor = scan.nextInt();
			System.out.print("영어 : ");
			array[i].eng = scan.nextInt();
			System.out.print("수학 : ");
			array[i].mat = scan.nextInt();
			array[i].ranking = 1;		//모든 학생은 1등으로 시작
		}
		for(Student std : array) {
			std.tot = std.kor + std.eng + std.mat;
			std.avg = std.tot / 3.;
			std.grade = (std.avg >= 90) ? 'A' :
								(std.avg >= 80) ? 'B' :
									(std.avg >= 70) ? 'C' :
									  (std.avg >= 60) ? 'D' : 'F';
		}
		//Selection 정렬
		for(int i = 0 ; i < array.length -1 ; i++) {
			for(int j = i +1; j < array.length ; j++) {
				if(array[i].tot > array[j].tot) {		
					//i번째 학생의 총점이 더 크면 j번째 학생의 랭킹 1증가
					array[j].ranking++;
				}else if(array[i].tot < array[j].tot) { 
					//i번째 학생의 총점보다 j번째 학생의 총점이 더 크면 i번째 학생의 랭킹 증가
					array[i].ranking++;
				}
			}
		}
		System.out.println("                     <<쌍용고등학교 성적관리프로그램>>");
		System.out.println("등수\t학번\t\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("--------------------------------------------------------------------");
		for(Student std : array) {
			System.out.printf("%d\t%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n",
							std.ranking, std.hakbun, std.name, std.kor, std.eng, std.mat, 
							std.tot, std.avg, std.grade);
		}
	}
}
