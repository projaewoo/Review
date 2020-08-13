import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionDemo {
	public static void main(String[] args) {
//		try {
//			System.out.println(4 / 0);		//ArithmeticException�� instance ����. -> throw
//		} catch (NullPointerException ex) {			//ArithmeticException�� instance�� �ƴϾ ���⼭�� ������.
////			if(ex instanceof NullPointerException)		//ex�� ������ NullPointerException?
//			System.out.println("NullPointerException");
//		}catch(RuntimeException ex) {			//ArithmeticException�� �θ� RuntimeException�� ���ܸ� ����.
//			System.out.println("���⼭ �����.");
//		}catch(ClassCastException ex) {
//			System.out.println("���� �θ�Ŭ������ �־ ������");		//���� catch�� �������� �θ�Ŭ������ ��.
//		}catch(Exception ex) {				//Runtime���� ��Ƽ� �ƹ��� �ֻ��� �θ�Ŭ�������� ���� �ȵ�.
//			System.out.println("�θ�");
//		}
		
		//��Ƽcatch��
		try {
			System.out.println(4/0);
		}catch(NullPointerException | ArithmeticException		//���๮�� �ߺ��� ��� ���
				| ArrayIndexOutOfBoundsException			//��������� ��츸 ��� (�θ�, �ڽİ��� X)
				| Exception ex) {					//��, �θ�Ŭ������ ������ ERROR	
			System.out.println(ex.toString());
		}
		
		//����ó��
		File file = new File("C:/temp/data!!.txt");	//���� ������ ��� �´��� �ȹ��
		try {
			Scanner scan = new Scanner(file);		//FileNotFoundException�� instance���� throw //Checked Exception�̾ try-catch����ؾ���.
		} catch (Exception ex) {			//Exception ex = new FileNotFoundException();		//ex : �θ����� ��. 
//			if(ex instanceof NullPointerException) {		//� �ڽ�Ŭ�������� Ȯ��
//				System.out.println("File Not Found");
//			}else if(ex instanceof ArithmeticException) {
//				System.out.println("ArithmeticException");
//			}else if(ex instanceof FileNotFoundException) {
//				System.out.println("FileNotFoundException");
//			}
			
			//�� ���� ���
			System.out.println(ex);		//ex.toString();
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			
			//��� ����� ���
			JOptionPane.showMessageDialog(null, ex.getMessage());		//�������� �޼��� ������
		}			
	}
}
