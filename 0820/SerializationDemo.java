import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
//����ȭ
public class SerializationDemo {
	public static void main(String[] args) {
		Date now = new Date();			//Date - > Serializable�̹Ƿ� Date Ŭ���� : ����ȭ ����.	//Serializable : ��� �������̽� (��� �޼ҵ� ����, ����ȭ �ȴٴ� ��ƼĿ�� �ٿ���) 
		try(ObjectOutputStream oos  = 
				new ObjectOutputStream(
					new FileOutputStream(			//�� Stream�� ObjectOutputStream�� ����.
							new File("C:/temp/mydate.ser")))) {	//����ȭ ���� Ȯ���� : .ser ���� ����.		//FileOutputStream : autocloseable�̹Ƿ� try����� �ڵ����� ����..
			oos.writeObject(now);		//���ݽð� 5:12�� ��ü�� ���Ͽ� ����.	//����ȭ
			System.out.println("Save Success");
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
