import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//File Copy�Ҷ� NIO�� �ӵ� ����
public class FileCopy {
	public static long startTime;
	public static long endTime;
	
	public static void main(String[] args) throws IOException{
		File file = new File("C:/temp/demo.zip");
		InputStream is = new FileInputStream(file);
		byte [] buffer = new byte[is.available()];	
		startTime = System.currentTimeMillis();		//1970�� 0��~ ���ݱ���
		is.read(buffer);		//�о����
		OutputStream out = new FileOutputStream(new File("available.zip"));
		out.write(buffer);  //������
		endTime = System.currentTimeMillis();
		System.out.println("���� �ð� : " + (endTime - startTime) + "ms");
	}
}
