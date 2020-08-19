import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

//OutputStreamWriter : Writer�� Stream�� �̾���.
public class PrintWriterDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try(PrintWriter pw = 
				new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(			//Writer�� Stream�� �̾���.
										new FileOutputStream("C:/temp/today"))) , true)) {		//AutoCloseable�� �ڼ��̶� try������ �ڵ����� ����. 
			String line = null;
			int count = 0;
			while( (line = scan.nextLine()) != null) {			//���� �о null�� �ƴҵ��� 19�� ����.
				pw.printf("%3d : %s%n", ++count, line);		//���� ���� ���� file�� ����	//����ϰ��� count�� 1����.
			}
			System.out.println("File Saved successfully.");
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
