import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import java.util.StringTokenizer;


public class Input {				//Input�ȿ� ���� �޼ҵ尡 Scanner, array�迭 �ʿ�� �Ҷ�, Scanner�� member������ �����ؼ� ���
	private Scanner scan;		//member ����	//InputŬ���� ��𼭵� ��밡��
	private Vector<Telephone> list;
	
	public Input(Vector<Telephone> list) {				//�⺻ �����ڷ� ���� �ʱ�ȭ
		File file = new File("./data.txt");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			System.exit(-1);	//���� ������ ��������
		}		
		this.list = list;
	}
	
	public void input() {							
//		System.out.println(this.list.capacity());
		for(int i = 0 ; i < this.list.capacity(); i++) {
//			ù��° �� ������ : 2     422-5123   ������    1084
			String line = this.scan.nextLine();		//2     422-5123   ������    1084�� line�� ����
			StringTokenizer st = new StringTokenizer(line);			//�� ���� ȭ��Ʈ �����̽� �������� �ڸ�.	//parameter�� delimeter���� = ȭ��Ʈ �����̽� �������� �˾Ƽ� ©����.
			String [] array = new String[st.countTokens()];	//String 4���� �� ���� array�� ����.
			int idx = 0;
			//����1
			while(st.hasMoreTokens()) {
				array[idx++] = st.nextToken();		//��ū�� array[idx]�� �����ϰ�, idx++;
			}
			//����2
			Telephone phone = new Telephone(Integer.parseInt(array[0]),		//"2" -> 2
																	array[1],
																	array[2],
																	Integer.parseInt(array[3]));	//"1084" -> 1084
			//Telephone�� list�� �߰��ϴ� ���
//			this.list.add(phone);
			this.list.addElement(phone);
		}
	}
}