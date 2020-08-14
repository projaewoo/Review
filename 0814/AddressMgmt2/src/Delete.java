import java.util.Scanner;
import java.util.Vector;

class Delete {		//�ܺο��� ���� ���ϰ� package����������
	private Vector<Friend> vector;
	private Scanner scanner;

	Delete(Vector<Friend> vector) {		//�ܺο��� ���� ���ϰ� package����������
		this.vector = vector;
		this.scanner = new Scanner(System.in);
	}

	void delete() {				//�ܺο��� ���� ���ϰ� package����������
		System.out.print("������ ģ�� �̸� : ");		String name = this.scanner.next().trim();
		int i = 0;
		for(i = 0 ; i < this.vector.size(); i++) {
			Friend f = this.vector.elementAt(i);		//vector�� ����� i��° ��Ҹ� f�� ����.
			if(f.getName().trim().equals(name)) {				//f�� �̸��� trim�ؼ� �Է¹��� name�� ���ٸ� //ã�Ҵٸ� 	//�˻��� �̸��� trim()
				break;
			}
		}
		if(i < this.vector.size()) {
			this.vector.removeElementAt(i);			//������ ģ���� ã�Ҵٸ�
			System.out.println("���� ����");
		}
		else if(i == this.vector.size())	System.out.println("Not Found");	//������ ģ���� ��ã�Ҵٸ�
	}
	
	
}
