import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

//RandomAccessFile�� ���

class Output1 {
	private ArrayList<Student> list;
	private RandomAccessFile raf;

	Output1(ArrayList<Student> list) {		//member���� �ʱ�ȭ
		this.list = list;
		String path = "./result1.dat";
		try {
			this.raf = new RandomAccessFile(path, "rw");	//"rw" : �а� ���� ��� -> Exception�߻�
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}		
	}
	
	private void printLabel() throws IOException {		//static�޼ҵ峢�� ���� ����
		this.raf.write("             <<�ֿ� ����б� �������� ���α׷�>>\n".getBytes("KSC5601"));		//�ٸ� ������Ʈ���� ���ܿ� ������ �޼ҵ� ���
		this.raf.write("�й�\t\t�̸�\t����\t����\t����\t����\t����\t���\t����\n".getBytes("KSC5601"));
		this.raf.write("----------------------------------------------------------\n".getBytes("KSC5601"));
	}		
	
	void output() {		
		try {
			printLabel();		//22�࿡�� ���� Exception�� �������� ��	//���� ���⼭ Exceptionó��.
			for(Student s : this.list) this.raf.write(s.toString().getBytes("KSC5601"));	//string�� byte�������� �ٲ� ��, KSC5601��.
		}catch(IOException ex) {
			System.out.println(ex);
		}
		System.out.println("Save Success");
	}
}
