import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

//Scanner로 읽어들여서 읽어들인 내용을 File로 만들어서 내보내기.
public class PrintStreamDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		//표준입력
		System.out.print("저장 경로 : ");
		String path = scan.next();
		path += String.format("%tF", new Date()) + ".txt";
		try(PrintStream ps = 
				new PrintStream(new BufferedOutputStream(
						new FileOutputStream(path)), true)) {
			String line = null;
			int count = 0;
			while((line = scan.nextLine()) != null) {			//null이면 끝.		
				ps.printf("%3d : %s", ++count, line);		//line읽어서 내보냄	//몇번째 줄인지 출력하고, 읽어들인 line을 출력.
			}				//PrintStream형 ps변수가 사용가능한 메소드 : PrintStream메소드, OutputStream의 static메소드(PrintStream의 생성자 : (OutputStream)이므로 Outpustream의 static메소드 사용가능)
			System.out.println("Save Success");
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
