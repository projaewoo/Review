import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo5 {
	public static void main(String[] args) {
//		try {
//			System.out.println(4 / 0);
//			System.out.println("여기를 출력할까요?");		//5행에서 Exception발생하면 7행 catch로 감. 6행 실행X
//		} catch (Exception e) {
//			System.out.println("Exception 발생했음");
//		}finally {			//정상일때, Exception일때 (모두)해야할 문장
//			System.out.println("여기는 무조건 처리됩니다.");
//		}
		
		//파일 열떄
		//FileInputStream fis;		//선언
		try(FileInputStream fis = new FileInputStream("C:/temp/data.txt")) {		//AutoCloseable인터페이스의 자손(FileInputStream)이라 굳이 close()메소드 구현 안해도 됨.
		} catch (Exception e) {
			System.out.println("File을 찾을 수 없습니다");
		}
//		finally {			//정상일때, Exception일때 (모두)해야할 문장
//			try {
//				fis.close();			//file을 닫음.		//close()도 Exception처리해줘야함.
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}	
		}
	}

