import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//내보내기
public class OutputStreamDemo {
	public static void main(String[] args) {
//		System.out.println("A");
//		InputStream is = System.in;		//입력일때, 자식 통해서 생성
		OutputStream os = System.out;		//추상 클래스이므로 자식 통해서 생성.
		String str = "안녕하세요.";
		
		try {
			//비효율적인 방법
			//os.write(65);			//write() :65를 버퍼에 읽어들임,  Exception던짐.
//			os.write(65);		os.write(66);		os.write(67);		os.write(68);		os.write(69);		//"Spring"찍으려면 S, p, r, i , n, g에 해당하는 아스키코드 알아야함 (불편)
			
			//byte배열 통해서 내보내는 방법 (String을 byte배열로 변환해서 내보냄) (getBytes()이용)
			byte [] buffer = str.getBytes();		//string을 byte배열로 변환.	//"안녕하세요."가 바이트 배열로.
			os.write(buffer);			//byte배열을 버퍼로 읽어들임. 
			os.flush();				//flush()써야 버퍼에 있는 65가 나옴.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		//String str를 byte로 찍는 방법.
//		byte [] buffer = str.getBytes();
//		for(byte b : buffer) System.out.print(b);
	}
}
