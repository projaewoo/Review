import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//�ѱ۷� �� ���� �����ϱ�.
public class FileCopy1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� : ");
		String originalPath = scan.next().trim();
		System.out.print("���� ���� : ");
		String targetPath = scan.next().trim();
		int count = 0, su;
		try(BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream(originalPath));		//��ȣ �ȿ� �� ���� �̻��ϰ�� ;�� ����
				BufferedOutputStream bos =
				new BufferedOutputStream(new FileOutputStream(targetPath))) {			//AutoCloseable�� �ڼ��� try����� ������ ����. //���� close()�� �ʿ� ����.
			byte [] buffer = new byte[512];
			while((su = bis.read()) >= 0) {		//1byte�о su�� ����.	//BufferedInputStream�� InputSTream���� ������ ����Ʈ �������� �о����.
				count += su;		
				bos.write(buffer, 0, su);		//�ϳ� �а� ��������
			}
			System.out.println(count + " bytes file copied successfully");
		}catch(IOException ex) {			//buffer�� file�� ��ǥ Exception : IOException
			System.out.println(ex);
		}
	}
}
