import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

//Car ������ȭ
public class SerializationDemo3 {
	public static void main(String[] args) {
		String path = "C:/temp/mycars.ser";
		try(ObjectInputStream ois =					//������ȭ���ִ� Stream 
				new ObjectInputStream(
						new FileInputStream(new File(path)))) {		//File -> FileInputStream -> ObjectInputStream
				Object obj = ois.readObject();		//������ȭ	//��ȯŸ�� : Object //ClassNotFOund���� ����
				Vector<Car> vector = (Vector<Car>)obj;			//������ȭ�� ���� <Car>�� �����ؼ� �� Vector<Car>�ּҸ� vector�� ������.
//				System.out.println(vector.size());		//�����.
				for(Car c : vector) System.out.println(c);
		}catch(IOException | ClassNotFoundException ex) {
				System.out.println(ex);
		} 
	
	}
}
