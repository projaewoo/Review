import java.io.IOException;
import java.io.InputStream;

//byte �迭�� String���� ��ȯ�ؼ� �ѱ� �о���̱�
public class IODemo1 {
	public static void main(String[] args) throws IOException {
		System.out.println("����� ��� ������ �����Ͻʴϱ�? : ");
		InputStream is = System.in;			//�߻�Ŭ�������� �ڽ����� ����.
		byte [] buffer = new byte[64];		//64byte = �ѱ� 32�� ����.
		int count = is.read(buffer);		//�о���� ���� ��.
		String season = new String(buffer, 0, count);		//String������ ���ؼ� byte�迭�� string���� ��ȯ
		System.out.println("season = " + season);
	} 
}
