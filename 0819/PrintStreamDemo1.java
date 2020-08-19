import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

//Scanner�� �о�鿩�� �о���� ������ File�� ���� ��������.
public class PrintStreamDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		//ǥ���Է�
		System.out.print("���� ��� : ");
		String path = scan.next();
		path += String.format("%tF", new Date()) + ".txt";
		try(PrintStream ps = 
				new PrintStream(new BufferedOutputStream(
						new FileOutputStream(path)), true)) {
			String line = null;
			int count = 0;
			while((line = scan.nextLine()) != null) {			//null�̸� ��.		
				ps.printf("%3d : %s", ++count, line);		//line�о ������	//����� ������ ����ϰ�, �о���� line�� ���.
			}
			System.out.println("Save Success");
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
