import java.io.IOException;
import java.io.RandomAccessFile;

//RandomAcccessFile�� �о���̴� ���
public class RandomAcccessFileDemo {
	public static void main(String[] args) {
		//�ڱⰡ �ڱⲨ ����
		String path = "./src/RandomAcccessFileDemo.java";
		try(RandomAccessFile raf = 					//AutoCloseable�� �ڼ��̹Ƿ� try����� �ڵ����� ����.
				new RandomAccessFile(path, "r")) {		//"r" : read���(���Ϸκ��� �б⸸ ����)
			while(raf.getFilePointer() < raf.length()) {		//���� ����Ʈ ��ġ < ������ ���� ������ �κ� ����Ʈ
				//���� ���
				String line = raf.readLine();		//���� ����	//�ѱ� ó�� X
				line = CharConversion.entoko(line);		//CharConversion�� static�޼ҵ� entoko()ȣ��.	(���� -> �ѱ۷� ��ȯ�ؼ� line�� ����)
				System.out.println(line);
				//���� ���
//				System.out.print((char)raf.read());	//1byte�о�� ��� //intŸ���� ��ȯ�ؼ� char�� ��ȯ	//14�� ���� ���ϰ�, read()�� ����: �ѱ� ���� : 1byte �����̾.
//				System.out.println("�������� ���� ��ġ : " + raf.getFilePointer());
			}
		}catch(IOException ex) {
			System.out.println(ex);
		}
		
	}
}//���Ⱑ ��.