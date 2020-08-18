import java.io.FileInputStream;
import java.io.IOException;

//�ѱ��� �� �ǳ���?
//java.io�� ������ �ο��̴�. �����ڴ� �� String open�̱� ����.
//�����ڸ� �� ����ؼ� �ͳ��� ����

//InputStream�� �ѱ� �о���̴� ������ IODemo1�̹Ƿ� InputStream�� �ڽ��� FileInputStream�� ������ ����.

public class FileInputStreamDemo {
	 public static void main(String[] args) {
		 FileInputStream fis = null;
		 int su = 0;
		 byte[] buffer = new byte[32];		//32byte = 16����	//16���� �ʰ��ǵ� ������ �Դٰ��� �ϸ� ��.
		 int count = 0;
		try {
			fis = new FileInputStream("./src/FileInputStreamDemo.java");				//HDD���� �޸𸮱��� ���� ����.	//file�Է�
			
			//byte�迭 ��� ���ϸ�
//			while((su = fis.read()) >= 0) {		//read()�� int��ȯ							//����� ���� ���ؼ� �о����
//				System.out.print((char)su);			//ǥ���Է� ����� �о���̳� 1byte�ۿ� ���о �ѱ� X
//			}
			
			//byte�迭 ���
			while((count = fis.read(buffer)) > 0) {
				System.out.println(new String(buffer, 0, count));
			}
		} catch (IOException ex) {
			System.out.println(ex);			//ex.toString()
		}finally {			//�ݵ�� �ݾƾ��� ��	//�������� try-catch�ʿ�.
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
