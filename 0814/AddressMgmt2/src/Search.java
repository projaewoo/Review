import java.util.Scanner;
import java.util.Vector;

class Search {			//�ܺο��� ���� ���ϰ� package����������
	private Vector<Friend> vector;
	private Scanner scanner;

	Search(Vector<Friend> vector) {
		this.vector = vector;
		this.scanner = new Scanner(System.in);
	}

	void linearSearch() {
		System.out.print("�˻��� �̸� : ");		String name = this.scanner.next().trim();		//���ڿ� �� : trim() : �Է¹��� ��, �յ� ©�� ��Ȯ�� ����
		int i;
		for(i = 0 ; i < this.vector.size(); i++) {
			Friend f = this.vector.elementAt(i);		//vector�� ����� i��° ��Ҹ� f�� ����.
			if(f.getName().trim().equals(name)) {				//f�� �̸��� trim�ؼ� �Է¹��� name�� ���ٸ� //ã�Ҵٸ� 	//�˻��� �̸��� trim()
				break;
			}
		}
		if(i == this.vector.size()) System.out.println("Not Found");		//i�� �̸��� ��ã�� ������ ���ٸ�
		else System.out.println(this.vector.elementAt(i));		//i.toString();
		
	}
}
