import java.io.BufferedInputStream;		//AutoCloseable�� �ڽ��̹Ƿ� ���� �ȴݾ��൵ ��.
import java.io.FileInputStream;
import java.io.IOException;

//���� ��Ʈ�� ���
//�ڱⰡ �ڱ� ���� �о����.
public class FileInputStreamDemo {
	public static void main(String[] args) {
		String path = "./src/FileInputStreamDemo.java";	
		try (BufferedInputStream bis = 			//���� ����		//���� ������ (InputStream) //���� InputStream�� �ڽ��� File��Ʈ�� ����.
				new BufferedInputStream(new FileInputStream(path))){		//BufferInputStream�ݾ����Ƿ� FileInputStream���� �ʿ� ����.  //AutoCloseable�� �ڽ��� try����� �ڵ����� ����
			byte [] buffer = new byte[1024];	//1024�� ä���� ���
			int count = 0;		//�о���� Ƚ��
			while( (count = bis.read(buffer)) >= 0) {			//�� ����Ʈ �о�鿩���ϴ��� ���� while���.	//���� �Ǹ� �о�鿩���� byte�� �̻� ����
				System.out.println(new String(buffer, 0, count));		//�о���� byte���̰� 500�̶�� 0~500�� �о����. count = 500;
			}
		} catch (IOException ex) {			//�ڹ� : OS���� ��û�ؼ� ���ϰ�� �о�޶�� ��û. OS�� HDD���� �о �޸𸮿� ���ٳ��� ������, Java�� Blocked����. //OS�� �Է¹��ۿ� ���� ������ �ڹٴ� InputStream���� ����.
			System.out.println(ex);			
		}
		
	}
}
//14�� : 1024 �� ä���� �� ä�ŭ 15�� ���, �� ���� 1024 ��ä���� ä�ŭ 15�� ���, ������ 1024���� ���� ����Ʈ ������ ��, �а� �׸�ŭ 15������ ���.
//		�� �о��� �� ���� ����Ʈ ���ų� ������. ���� ��.