import java.util.Scanner;

public class TestStudent {
	private Scanner scan;		//member변수 //주소로 접근  //Scanner가 여러 메소드에서 사용되서
	public static void main(String[] args) {
		System.out.println("<<학사 프로그램 시작>>");
		TestStudent ts = new TestStudent();
		ts.scan = new Scanner(System.in);
		int choice = ts.showMenu();			//주소로 접근
		ts.branch(choice);			//주소로 접근  //분기에 따라 다르게 출력
//		print();			여기서 출력하면 출력대상 모름   //따라서 goto메소드 안에서 print로 출력
		System.out.println("<<학사 프로그램 종료>>");
	}
	void branch(int choice) {		//member 메소드  //주소로 접근
		switch(choice) {
		case 1 : gotoUnderGraduate();    break; 
		case 2 : gotoGraduate();            break;
		default :
			System.out.println("잘못된 값입니다. \n프로그램을 종료합니다.");
			System.exit(-1);   //프로그램 종료
		}
	}

//		공통되는 메소드는 상속 x
//	void gotoStudent() {
//		System.out.print("이름 : ");				String name = this.scan.next();
//		System.out.print("학번 : ");				String hakbun = this.scan.next();
//		System.out.print("소속학과 : ");			String dept = this.scan.next();
//		System.out.print("학년 : ");				int grade = this.scan.nextInt();
//		System.out.print("이수 학점 수 : ");		int point = this.scan.nextInt();
//	}			
	void gotoGraduate() {
		System.out.println("[반갑습니다. 대학원생]");
		System.out.print("이름 : ");				String name = this.scan.next();
		System.out.print("학번 : ");				String hakbun = this.scan.next();
		System.out.print("소속학과 : ");			String dept = this.scan.next();
		System.out.print("학년 : ");				int grade = this.scan.nextInt();
		System.out.print("이수 학점 수 : ");		int point = this.scan.nextInt();
		System.out.print("조교 유형 : ");			String assistantType = this.scan.next();
		System.out.print("장학급 비율 : ");		double rate = this.scan.nextDouble();
		Graduate gra = new Graduate(name, hakbun, dept, grade, point, assistantType, rate);
		System.out.println(gra);
	}
	void gotoUnderGraduate() {
		System.out.println("[반갑습니다. 학부생]");
		System.out.print("이름 : ");				String name = this.scan.next();
		System.out.print("학번 : ");				String hakbun = this.scan.next();
		System.out.print("소속학과 : ");			String dept = this.scan.next();
		System.out.print("학년 : ");				int grade = this.scan.nextInt();
		System.out.print("이수 학점 수 : ");		int point = this.scan.nextInt();
		System.out.print("소속 동아리 이름 : ");		String club = this.scan.next();
		UnderGraduate gra = new UnderGraduate(name, hakbun, dept, grade, point, club);
		System.out.println(gra);
	}
	int showMenu() {			//member 메소드  //주소로 접근
		System.out.println("<<Menu>>");
		System.out.println("1. Undergraduate");
		System.out.println("2. Graduate");
		System.out.println("Who are you (1/2) ? : ");
		int choice = this.scan.nextInt();
		return choice;
	}
}
