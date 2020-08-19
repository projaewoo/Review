import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		try(PrintStream ps = 						//PrintStream이 Stream으로 끝나기때문에 byte기반으로 내보냄. 									
				new PrintStream(				//printf()사용하기 위해 PrintStream사용.															
						new BufferedOutputStream(							//BufferedOutputStream안에 OutputStream자식 넣을 수 있음.
								new FileOutputStream("C:/temp/result1.dat")),true)) {		//PrintStream : AutoCloseable	//PrintStream생성자 : (OutputStream자식, 자동flush여부) 
			ps.printf("%-10s%10s%10d%10.1f%10c%n", 
						"2020-001", "한지민", 363, 90.12345678, 'A');
			ps.printf("%s", "Hello, Wolrd");
			System.out.println("Save success.");
		} catch (IOException ex) {		//대표 Exception : IOException
			System.out.println(ex);
		}
	}
}
