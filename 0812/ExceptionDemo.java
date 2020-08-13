import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionDemo {
	public static void main(String[] args) {
//		try {
//			System.out.println(4 / 0);		//ArithmeticException형 instance 생성. -> throw
//		} catch (NullPointerException ex) {			//ArithmeticException형 instance가 아니어서 여기서는 못잡음.
////			if(ex instanceof NullPointerException)		//ex의 원형이 NullPointerException?
//			System.out.println("NullPointerException");
//		}catch(RuntimeException ex) {			//ArithmeticException의 부모 RuntimeException이 예외를 받음.
//			System.out.println("여기서 잡았음.");
//		}catch(ClassCastException ex) {
//			System.out.println("위에 부모클래스가 있어서 못잡음");		//따라서 catch문 마지막에 부모클래스를 씀.
//		}catch(Exception ex) {				//Runtime에서 잡아서 아무리 최상위 부모클래스여도 실행 안됨.
//			System.out.println("부모");
//		}
		
		//멀티catch블럭
		try {
			System.out.println(4/0);
		}catch(NullPointerException | ArithmeticException		//실행문이 중복될 경우 사용
				| ArrayIndexOutOfBoundsException			//동등관계일 경우만 사용 (부모, 자식관계 X)
				| Exception ex) {					//단, 부모클래스가 들어오면 ERROR	
			System.out.println(ex.toString());
		}
		
		//파일처리
		File file = new File("C:/temp/data!!.txt");	//아직 파일의 경로 맞는지 안물어봄
		try {
			Scanner scan = new Scanner(file);		//FileNotFoundException형 instance형을 throw //Checked Exception이어서 try-catch사용해야함.
		} catch (Exception ex) {			//Exception ex = new FileNotFoundException();		//ex : 부모형이 됨. 
//			if(ex instanceof NullPointerException) {		//어떤 자식클래스인지 확인
//				System.out.println("File Not Found");
//			}else if(ex instanceof ArithmeticException) {
//				System.out.println("ArithmeticException");
//			}else if(ex instanceof FileNotFoundException) {
//				System.out.println("FileNotFoundException");
//			}
			
			//더 편한 방법
			System.out.println(ex);		//ex.toString();
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			
			//출력 깔끔한 방법
			JOptionPane.showMessageDialog(null, ex.getMessage());		//유저에게 메세지 보여줌
		}			
	}
}
