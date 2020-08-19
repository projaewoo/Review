import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//���� �������� ��������
public class FileOutputStreamDemo {
	public static void main(String[] args) {
		String path ="C:/temp/result.txt";
		
		//FileOutputStream�̿�
//		try(FileOutputStream fos = 
//				new FileOutputStream(path)) {			//try���� file ����		//������ ��¹��� : File�� ������, ��ġ�� C:/temp/result.txt�� ������.
//			fos.write("�ȳ��ϼ���".getBytes());		//byte�迭�� ������.
//			fos.write("\n".getBytes());
//			fos.write("Good Morning".getBytes());		//�̹� ������ ������������� ����� ��.
//			fos.write("65".getBytes());   	//�׳� 65.getByte()�� �ϸ� ���Ͽ� A�� �����.	//���� "65".getByte()��
//			fos.write("true".getBytes());
//			System.out.println("Save Success");
//		}catch(IOException ex) {		
//			System.out.println(ex);
//		}
		
		//DataOutputStream�̿�
		//���ڸ� ���ڷ�, ���ڸ� ���ڷ� ������.
		try(DataOutputStream dos =
				new DataOutputStream(new FileOutputStream(path))) {
			dos.writeBoolean(true);		//boolean�� true�� ������		//string "true"����
			dos.write("\n".getBytes());	
			dos.writeInt(24);					//���ڸ� ���ڷ� ����.
			dos.write("\n".getBytes());
			dos.writeDouble(89.5);
			dos.write("\n".getBytes());
			dos.writeUTF("�ȳ��ϼ���");
			dos.write("\n".getBytes());
			dos.writeUTF("Good Morning!!");
			System.out.println("Save Success");
		}catch(IOException ex) {		
			System.out.println(ex);
		}
	}
}

//�������� writeBoolean()�̸�
//������, readBoolean()����ؾ� ����� ����.