import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

//File�� ��������.
class Output {
	private ArrayList<Student> list;
	private PrintStream ps;		//STream : byte���.
	
	Output(ArrayList<Student> list) {		//member���� �ʱ�ȭ
		this.list = list;
		String path = "./result.dat";
		
		try {
			this.ps = new PrintStream(				//printstream : File������� �� //FileOutputStream���� �����ؼ�
				new BufferedOutputStream(				//�̿��̸� Buffered����ϴ°� ����.
						new FileOutputStream(path)), true);	//PrintStream�� �ͳ� : �޸� -> HDD (PrintStream�� FileOutputStream���� �����Ǽ�)	//Fileoutputstream������ : Exception����.		//true : OutputStream�����ڸ��� �ڵ����� autoFlush
		}catch(IOException ex) {										//System.out.pirntln()�� �ͳ� : �޸� -> �����.		
			System.out.println(ex);
		}
		
	}
						//private -> main���� ȣ�� �Ұ� //Output������ �� �޼��� ����ϰԲ�
	private void printLabel() {		//static�޼ҵ峢�� ���� ����
		this.ps.println("             <<�ֿ� ����б� �������� ���α׷�>>");		//�ͳ� : �޸� -> HDD 
		this.ps.println("�й�\t\t�̸�\t����\t����\t����\t����\t����\t���\t����");
		this.ps.println("----------------------------------------------------------");
	}				//public --> main���� ȣ�� ����
	
	void output() {	//����� �л�	//�ּҺ��� //�̹� �Է°� ����� ���� �л�		//main���� �����ؾ��ؼ� package����������.
		printLabel();
		for(Student s : this.list) //s.print();		//��ȭ�� for�� : �迭, Collection���� ���
			this.ps.println(s);
		
		//���� �ݱ�
		System.out.println("Save Success");
		this.ps.close();
	}
}
