import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

//������ȭ
//����ȭ�� ��� ���� ����鵵 �� ����ȭ�� �Ǿ����.  (primitive type, String -> Serializable (���� ����ȭ ����))
public class SerializationDemo1 {
	public static void main(String[] args) {
		String path = "C:/temp/mydate.ser";
		try(ObjectInputStream ois =					//������ȭ���ִ� Stream 
				new ObjectInputStream(
						new FileInputStream(new File(path)))) {		//File -> FileInputStream -> ObjectInputStream
				Object obj = ois.readObject();		//������ȭ	//��ȯŸ�� : Object //ClassNotFOund���� ����
				Date before = (Date)obj;			//������ȭ�� ��ü Date�� �����ؼ� �� Date�ּҸ� before�� ������.
				System.out.println(before);
		}catch(IOException | ClassNotFoundException ex) {
				System.out.println(ex);
		} 
	}
}