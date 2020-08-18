import java.io.IOException;
import java.io.InputStream;

public class IODemo {
	public static void main(String[] args) {
//		System.out.print("�� ���� ���ڸ� �Է����ּ��� : ");
		System.out.println("����� ��� ������ �����Ͻʴϱ�? : ");
		//InputStream : �߻�޼ҵ� ������ �־ �߻�Ŭ���� //���� new ����
//		InputStream is = new InputStream();
		InputStream is = System.in;		//ǥ�� �Է� ��Ʈ��.	//Ű����κ��� �Է¹���.
		String season = "";
		try {
			while(true) {
				int su = is.read();					//ASCII code�� �о����.	//�߻�޼ҵ�, Exception����.	-> checked�̹Ƿ� try-catch�� ���.	//read() : input stream���κ��� ����Ʈ�� �о����.	//�ڹٿ��� int�� �⺻���̹Ƿ� ����Ʈ�� �о�鿩�� int�� �޾Ƶ���.
				if(su < 0 || (char)su == '\n') break;
				else season += (char)su;
			}
			System.out.println("season = " + season);				//byte�� �о�鿩�� �ѱ��� ������.	//byte��� stream�� ���� �о���̱� ����X
		} catch (IOException e) {									
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
