import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FullBuffer {
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
		int readCount = 0;
		byte [] buffer = new byte[fis.available()];		//�뷮��ŭ �ѹ��� �о �� ���� ������.	//while�� 1���� ��.
		while((readCount = fis.read(buffer)) != -1){
			fos.write(buffer, 0, readCount);
		}
		System.out.println("Copy End..");
	}
}