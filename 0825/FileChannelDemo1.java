import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileChannelDemo1 {
	public static long start;
	public static long end;
	public static void start(){
		start = System.currentTimeMillis();
	}
	public static void end(){
		end = System.currentTimeMillis();
	}
	public static long during(){
		return end - start;
	}
	public static void copy(String source, String target) throws IOException{
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(target);
		//��ӵ��� ����.		
		FileChannel in  = fis.getChannel();
		FileChannel out = fos.getChannel();
		in.transferTo(0, in.size(), out);		//MappedByteBuffer�� write()���� �� ����.
		System.out.println("Copy End..");
	}
}