import java.io.IOException;
import java.io.RandomAccessFile;

//�б�, ���� ���ÿ�
public class RandomAccessFileDemo1 {
	public static void main(String[] args) {
		try(RandomAccessFile raf = 
				new RandomAccessFile("C:/temp/raf.txt", "rw")) {		//"rw" : �б�, ���� ���
			
			//���� ���¿� ���� ��ȭ�ϴ� ������ ��ġ
			System.out.println("���� ������ ��ġ : " + raf.getFilePointer());		//���� ������ ��ġ : 0
			raf.writeBoolean(true);		//1byte
			System.out.println("���� ������ ��ġ : " + raf.getFilePointer());
			raf.writeInt(24);			//4byte
			System.out.println("���� ������ ��ġ : " + raf.getFilePointer());
			raf.writeDouble(89.5);		//8byte
			System.out.println("���� ������ ��ġ : " + raf.getFilePointer());
			
			
			//raf.txt ����		//������ �����, ������ ���� ����
			raf.writeBoolean(true);
			raf.write("\n".getBytes());	 //"\n"�� ����Ʈ��
			raf.writeInt(24);
			raf.write("\n".getBytes());	 
			raf.writeDouble(89.5);
			raf.write("\n".getBytes());	 
			raf.writeUTF("�ȳ��ϼ���");
			raf.write("\n".getBytes());	 
			raf.writeUTF("Hello, World");
			System.out.println("File saved successfully");
			
			raf.seek((long)0);		//�����͸� ���ϴ� ��ġ�� �̵� //0 : �����͸� ���� ������ -> 9�� true������ �̵�
			
			//raf.txt �о���̱�		//���� ������ ERROR
			System.out.printf("%b%n", raf.readBoolean());		//true������ �̵���Ű�� boolean���� �о����Ƿ� true���;���
			raf.readLine();			//true�ؿ� ���͸� 21���� ����.
			System.out.printf("%d%n", raf.readInt());
			raf.readLine();
			System.out.printf("%.1f%n", raf.readDouble());
			raf.readLine();
			System.out.printf("%s%n", raf.readUTF());
			raf.readLine();
			System.out.printf("%s%n", raf.readUTF());
			
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
