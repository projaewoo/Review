import java.util.Scanner;
import java.util.Vector;

public class Main {		//Main : �ܺο��� ���ٰ����ؾ��� -> public�����ڷ�
	private Scanner scan;		//Member variable
	private Vector<Friend> vector;
	
	Main() {		//������ : Member variable �ʱ�ȭ		//������ : �ܺο��� ȣ�� X = package����������
		this.scan = new Scanner(System.in);		//������ ȣ��� ���� Scanner������.
		this.vector = new Vector<Friend>(1, 1);	//������ ȣ��� ���� Vector����	///�ʱ� �� : 1��, �� �����Ҷ� 1���� �߰���.
	}

	public static void main(String[] args) {		
		//Menu�����ְ�, ó��.
		Main m = new Main();			//�����ڿ� ���� Scanner����.
		do {
			int choice = m.showMenu();
			if(choice == 9) break;
			m.process(choice);
		}while(true);
	}
	
	private int showMenu() {		//�ܺο����� showMenu()�Ⱥ����� �Ǽ� private
		System.out.println("1. �߰�          2. �˻�          3. ��Ϻ���         4. ����           9. ����");
		System.out.print(">> : ");
		return this.scan.nextInt();
	}
	private void process(int choice) {
		switch(choice) {
			case 1: gotoInput();		break;
			case 2 : gotoSearch();	break;
			case 3 : gotoPrint();		break;
			case 4 : gotoDelete();	break;
			default : return;		//process()������� ��
		}
	}
	private void gotoDelete() {
		if(this.vector.size() == 0) {
			System.out.println("���� ������ �����Ͱ� �����ϴ�.");
			return;			
		}
		Delete delete = new Delete(this.vector);
		delete.delete();
	}
	private void gotoSearch() {
		if(this.vector.size() == 0) {
			System.out.println("���� �˻��� �����Ͱ� �����ϴ�.");
			return;			
		}
		Search search = new Search(this.vector);
		search.linearSearch();		//�����˻� : ���������� �˻� (�տ��� ������ �˻�)
	}
	private void gotoPrint() {
		if(this.vector.size() == 0) {
			System.out.println("���� ����� �����Ͱ� �����ϴ�.");
			return;			
		}
		Output output = new Output(this.vector);
		output.output();
	}
	private void gotoInput() {						//Member�޼ҵ� -> member���� ���ٰ���  //�޼ҵ� ȣ��Ǳ� ���� �����ڰ� vector �ʱ�ȭ �س���.
		Input input = new Input(this.vector);
		input.input();
	}
	
}
