import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

//Car 역직렬화
public class SerializationDemo3 {
	public static void main(String[] args) {
		String path = "C:/temp/mycars.ser";
		try(ObjectInputStream ois =					//역직렬화해주는 Stream 
				new ObjectInputStream(
						new FileInputStream(new File(path)))) {		//File -> FileInputStream -> ObjectInputStream
				Object obj = ois.readObject();		//역직렬화	//반환타입 : Object //ClassNotFOund예외 던짐
				Vector<Car> vector = (Vector<Car>)obj;			//역직렬화한 벡터 <Car>를 오픈해서 그 Vector<Car>주소를 vector에 저장함.
//				System.out.println(vector.size());		//디버깅.
				for(Car c : vector) System.out.println(c);
		}catch(IOException | ClassNotFoundException ex) {
				System.out.println(ex);
		} 
	
	}
}
