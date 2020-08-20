import java.io.File;
import java.io.IOException;

//FileŬ���� : ����, ���丮(����) ó��.
public class FileDemo {
	public static void main(String[] args) {
//		System.out.println(System.getProperty("file.separator"));		//file ������
//		System.out.println(File.separator);		//FileŬ�������� �� �޼ҵ� ����
		//ex)������ ������ : \ -> C:\temp\result.dat		
		//������, �� ���� ������ : / -> /home/jaewoo/Temp/result.dat
		
		
//		System.out.println(System.getProperty("path.separator"));	//OS���� ����ϴ� ��� ������.
//		System.out.println(File.pathSeparator);		//FileŬ�������� �� �޼ҵ� ����
		//�������� ��� ������ ;		//�� ��� ������ :
		//ex) -cp .;C:/temp		//-cp .:/home/jaewoo/Temp
		//���߿� Ŭ���� ����Ҷ�, OSȮ�� ���� ���
		
		//��� Ȯ��.
		File file = new File("../../JavaHome/0820/src/FileDemo.java");		//.. = �ڱ� �θ� // . = �ڱ��ڽ�
		System.out.println("getName() = " + file.getName());
		System.out.println("getPath() = " + file.getPath());
		System.out.println("getParent() = " + file.getParent());		//�� ������ ��������.
		System.out.println("getAbsolutePath() = " + file.getAbsolutePath());	//���ϰ�θ� ���� ���ٰ� ���������� �Է��ϸ� �� ��� �״�� ���.
		try {
			System.out.println("getCanonicalPath() = " + file.getCanonicalPath());	//�������� ������.(���� ���� �Ʒ��� �������� ��� �״�� ���x)	//Exceptionó���������.
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
