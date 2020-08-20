import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

//직렬화 안되는 대상(Car)을 직렬화하면?
public class SerializationDemo2 {
	public static void main(String[] args) {
		Vector <Car> vector = new Vector<Car>(3);
		vector.addElement(new Car("Sonata", 25_000_000, "Hyundai"));
		vector.addElement(new Car("Carnival", 35_000_000, "KIA"));
		vector.addElement(new Car("Matiz", 10_000_000, "DAEWOO"));
		
		try(ObjectOutputStream oos  = 
				new ObjectOutputStream(
					new FileOutputStream(			//이 Stream을 ObjectOutputStream에 넣음.
							new File("C:/temp/mycars.ser")))) {	//직렬화 파일 확장자 : .ser 많이 쓰임.		//FileOutputStream : autocloseable이므로 try벗어나면 자동으로 닫힘..
			oos.writeObject(vector);		//Car3대를 담은 vector를 mycars.ser파일에 저장.	//Car : 직렬화 X (Car : Serializable의 자손 아니어서)	//Car implements Serializable 해주면 Car : 직렬화 가능.
			System.out.println("Save Success");
		}catch(IOException ex) {
			System.out.println("직렬화 실패!");
		}
	}
}
