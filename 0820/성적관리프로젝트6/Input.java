import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Input {							//static�޼ҵ� = Ŭ���� �̸����� ����
	private ArrayList<Student> list;
	private String data;
	
	Input(ArrayList<Student> list) {
		this.list = list;				//member variable, local variable
		this.data = this.init();		//������ ������ �ܾ ���ڿ� data�� ����.
	}												//�ٸ� �޼ҵ忡���� ����� �� �ְԲ� �̸� ����
	
	void input() {
		StringTokenizer st = new StringTokenizer(this.data, "\n");		//data�� \n�������� �ڸ�
		int count = st.countTokens();		//12��
		while(st.hasMoreTokens()) {
			String line = st.nextToken().trim();		//1101  �Ѽ���   78   87   83   78	//string�� �׻� trim()�ϴ°� ����.
			Scanner scan = new Scanner(line).useDelimiter("\\s+");		//��ĭ �̻��� �����̽���.
			Student s = new Student(scan.next(), scan.next(), 	//1101, �Ѽ��� : String���� ����
					scan.nextInt(),scan.nextInt(), scan.nextInt(), scan.nextInt());		//78  87  83  78�� int�� ����
			this.list.add(s);
		}
	}
	
	private String init() {		//�ʱ�ȭ�ϴ� �޼ҵ�
		String data = null;
		String path = "./sungjuk.dat";
		try (FileInputStream fis = new FileInputStream(path)) {		//���� ���� ��� ����Ʈ ������� ó�������� FileInputStream 
			byte [] buffer = new byte[1024];		//�ѱ�ó�� ���� byte�迭 ����
			int count = fis.read(buffer);		//
			data = new String(buffer, 0, count);		//���� �� �о data�� �ѱ�.
		}catch(FileNotFoundException ex) {
			System.out.println("File not found");
		}catch(IOException ex) {			
			System.out.println(ex);
		}catch(Exception ex) {				//24��, 26�࿡�� �������� �θ�exception�� 28���� ����.
			System.out.println(ex);
		}
		return data;
	}
}
