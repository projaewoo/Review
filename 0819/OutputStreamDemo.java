import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//��������
public class OutputStreamDemo {
	public static void main(String[] args) {
//		System.out.println("A");
//		InputStream is = System.in;		//�Է��϶�, �ڽ� ���ؼ� ����
		OutputStream os = System.out;		//�߻� Ŭ�����̹Ƿ� �ڽ� ���ؼ� ����.
		String str = "�ȳ��ϼ���.";
		
		try {
			//��ȿ������ ���
			//os.write(65);			//write() :65�� ���ۿ� �о����,  Exception����.
//			os.write(65);		os.write(66);		os.write(67);		os.write(68);		os.write(69);		//"Spring"�������� S, p, r, i , n, g�� �ش��ϴ� �ƽ�Ű�ڵ� �˾ƾ��� (����)
			
			//byte�迭 ���ؼ� �������� ��� (String�� byte�迭�� ��ȯ�ؼ� ������) (getBytes()�̿�)
			byte [] buffer = str.getBytes();		//string�� byte�迭�� ��ȯ.	//"�ȳ��ϼ���."�� ����Ʈ �迭��.
			os.write(buffer);			//byte�迭�� ���۷� �о����. 
			os.flush();				//flush()��� ���ۿ� �ִ� 65�� ����.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		//String str�� byte�� ��� ���.
//		byte [] buffer = str.getBytes();
//		for(byte b : buffer) System.out.print(b);
	}
}
