import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
//직렬화
public class SerializationDemo {
	public static void main(String[] args) {
		Date now = new Date();			//Date - > Serializable이므로 Date 클래스 : 직렬화 가능.	//Serializable : 깃발 인터페이스 (멤버 메소드 없고, 직렬화 된다는 스티커만 붙여줌) 
		try(ObjectOutputStream oos  = 
				new ObjectOutputStream(
					new FileOutputStream(			//이 Stream을 ObjectOutputStream에 넣음.
							new File("C:/temp/mydate.ser")))) {	//직렬화 파일 확장자 : .ser 많이 쓰임.		//FileOutputStream : autocloseable이므로 try벗어나면 자동으로 닫힘..
			oos.writeObject(now);		//지금시간 5:12인 객체를 파일에 저장.	//직렬화
			System.out.println("Save Success");
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
