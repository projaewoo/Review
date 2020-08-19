import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

//OutputStreamWriter : Writer와 Stream을 이어줌.
public class PrintWriterDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try(PrintWriter pw = 
				new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(			//Writer와 Stream을 이어줌.
										new FileOutputStream("C:/temp/today"))) , true)) {		//AutoCloseable의 자손이라 try끝나면 자동으로 닫힘. 
			String line = null;
			int count = 0;
			while( (line = scan.nextLine()) != null) {			//한줄 읽어서 null이 아닐동안 19행 수행.
				pw.printf("%3d : %s%n", ++count, line);		//한줄 읽은 것을 file로 저장	//출력하고나서 count에 1더함.
			}
			System.out.println("File Saved successfully.");
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
