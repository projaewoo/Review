import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//File Copy할때 NIO의 속도 차이
public class FileCopy {
	public static long startTime;
	public static long endTime;
	
	public static void main(String[] args) throws IOException{
		File file = new File("C:/temp/demo.zip");
		InputStream is = new FileInputStream(file);
		byte [] buffer = new byte[is.available()];	
		startTime = System.currentTimeMillis();		//1970년 0초~ 지금까지
		is.read(buffer);		//읽어들임
		OutputStream out = new FileOutputStream(new File("available.zip"));
		out.write(buffer);  //내보냄
		endTime = System.currentTimeMillis();
		System.out.println("복사 시간 : " + (endTime - startTime) + "ms");
	}
}
