import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		try(PrintStream ps = 						//PrintStream�� Stream���� �����⶧���� byte������� ������. 									
				new PrintStream(				//printf()����ϱ� ���� PrintStream���.															
						new BufferedOutputStream(							//BufferedOutputStream�ȿ� OutputStream�ڽ� ���� �� ����.
								new FileOutputStream("C:/temp/result1.dat")),true)) {		//PrintStream : AutoCloseable	//PrintStream������ : (OutputStream�ڽ�, �ڵ�flush����) 
			ps.printf("%-10s%10s%10d%10.1f%10c%n", 
						"2020-001", "������", 363, 90.12345678, 'A');
			ps.printf("%s", "Hello, Wolrd");
			System.out.println("Save success.");
		} catch (IOException ex) {		//��ǥ Exception : IOException
			System.out.println(ex);
		}
	}
}
