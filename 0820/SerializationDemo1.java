import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

//역직렬화
//직렬화할 대상 안의 멤버들도 다 직렬화가 되어야함.  (primitive type, String -> Serializable (따라서 직렬화 가능))
public class SerializationDemo1 {
	public static void main(String[] args) {
		String path = "C:/temp/mydate.ser";
		try(ObjectInputStream ois =					//역직렬화해주는 Stream 
				new ObjectInputStream(
						new FileInputStream(new File(path)))) {		//File -> FileInputStream -> ObjectInputStream
				Object obj = ois.readObject();		//역직렬화	//반환타입 : Object //ClassNotFOund예외 던짐
				Date before = (Date)obj;			//역직렬화한 객체 Date를 오픈해서 그 Date주소를 before에 저장함.
				System.out.println(before);
		}catch(IOException | ClassNotFoundException ex) {
				System.out.println(ex);
		} 
	}
}