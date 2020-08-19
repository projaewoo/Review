import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * InputStream --> Reader --> Memory --> Writer --> OutputStream
 */

//byte�� char����� �����ϴ� InputStreamReader
//InputStream�� Reader�� �������ִ� InputStreamReader
public class BridgeClassDemo {
	public static void main(String[] args) throws IOException {
		System.out.print("����� ��� ������ �����Ͻʴϱ�? : ");
		InputStream is = System.in;		//ǥ���Է� (from Keyboard)	//byte������� �о���� //���� InputStream���� ����.
		InputStreamReader isr = new InputStreamReader(is);		//InputStreamReader�� ������ : (InputStream��)	-> Reader�� ���� //byte -> char������� ����
//		System.out.println(isr.getEncoding());		//MS949������� encoding��.
		BufferedReader br = new BufferedReader(isr);		//Reader�� �ڽ� : InputStreamReader
		String season = br.readLine();	//���� ĥ������ ����.		//�� ����� ���ؼ� 14~17�� ���� ����.
		System.out.println("season = " + season);
	}
}
