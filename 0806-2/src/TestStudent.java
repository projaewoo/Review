import java.util.Scanner;

public class TestStudent {
	private Scanner scan;		//member���� //�ּҷ� ����  //Scanner�� ���� �޼ҵ忡�� ���Ǽ�
	public static void main(String[] args) {
		System.out.println("<<�л� ���α׷� ����>>");
		TestStudent ts = new TestStudent();
		ts.scan = new Scanner(System.in);
		int choice = ts.showMenu();			//�ּҷ� ����
		ts.branch(choice);			//�ּҷ� ����  //�б⿡ ���� �ٸ��� ���
//		print();			���⼭ ����ϸ� ��´�� ��   //���� goto�޼ҵ� �ȿ��� print�� ���
		System.out.println("<<�л� ���α׷� ����>>");
	}
	void branch(int choice) {		//member �޼ҵ�  //�ּҷ� ����
		switch(choice) {
		case 1 : gotoUnderGraduate();    break; 
		case 2 : gotoGraduate();            break;
		default :
			System.out.println("�߸��� ���Դϴ�. \n���α׷��� �����մϴ�.");
			System.exit(-1);   //���α׷� ����
		}
	}

//		����Ǵ� �޼ҵ�� ��� x
//	void gotoStudent() {
//		System.out.print("�̸� : ");				String name = this.scan.next();
//		System.out.print("�й� : ");				String hakbun = this.scan.next();
//		System.out.print("�Ҽ��а� : ");			String dept = this.scan.next();
//		System.out.print("�г� : ");				int grade = this.scan.nextInt();
//		System.out.print("�̼� ���� �� : ");		int point = this.scan.nextInt();
//	}			
	void gotoGraduate() {
		System.out.println("[�ݰ����ϴ�. ���п���]");
		System.out.print("�̸� : ");				String name = this.scan.next();
		System.out.print("�й� : ");				String hakbun = this.scan.next();
		System.out.print("�Ҽ��а� : ");			String dept = this.scan.next();
		System.out.print("�г� : ");				int grade = this.scan.nextInt();
		System.out.print("�̼� ���� �� : ");		int point = this.scan.nextInt();
		System.out.print("���� ���� : ");			String assistantType = this.scan.next();
		System.out.print("���б� ���� : ");		double rate = this.scan.nextDouble();
		Graduate gra = new Graduate(name, hakbun, dept, grade, point, assistantType, rate);
		System.out.println(gra);
	}
	void gotoUnderGraduate() {
		System.out.println("[�ݰ����ϴ�. �кλ�]");
		System.out.print("�̸� : ");				String name = this.scan.next();
		System.out.print("�й� : ");				String hakbun = this.scan.next();
		System.out.print("�Ҽ��а� : ");			String dept = this.scan.next();
		System.out.print("�г� : ");				int grade = this.scan.nextInt();
		System.out.print("�̼� ���� �� : ");		int point = this.scan.nextInt();
		System.out.print("�Ҽ� ���Ƹ� �̸� : ");		String club = this.scan.next();
		UnderGraduate gra = new UnderGraduate(name, hakbun, dept, grade, point, club);
		System.out.println(gra);
	}
	int showMenu() {			//member �޼ҵ�  //�ּҷ� ����
		System.out.println("<<Menu>>");
		System.out.println("1. Undergraduate");
		System.out.println("2. Graduate");
		System.out.println("Who are you (1/2) ? : ");
		int choice = this.scan.nextInt();
		return choice;
	}
}
