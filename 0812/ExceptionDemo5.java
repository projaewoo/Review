import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo5 {
	public static void main(String[] args) {
//		try {
//			System.out.println(4 / 0);
//			System.out.println("���⸦ ����ұ��?");		//5�࿡�� Exception�߻��ϸ� 7�� catch�� ��. 6�� ����X
//		} catch (Exception e) {
//			System.out.println("Exception �߻�����");
//		}finally {			//�����϶�, Exception�϶� (���)�ؾ��� ����
//			System.out.println("����� ������ ó���˴ϴ�.");
//		}
		
		//���� ����
		//FileInputStream fis;		//����
		try(FileInputStream fis = new FileInputStream("C:/temp/data.txt")) {		//AutoCloseable�������̽��� �ڼ�(FileInputStream)�̶� ���� close()�޼ҵ� ���� ���ص� ��.
		} catch (Exception e) {
			System.out.println("File�� ã�� �� �����ϴ�");
		}
//		finally {			//�����϶�, Exception�϶� (���)�ؾ��� ����
//			try {
//				fis.close();			//file�� ����.		//close()�� Exceptionó���������.
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}	
		}
	}

