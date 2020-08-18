import java.io.IOException;
import java.io.InputStream;

//byte 배열을 String으로 변환해서 한글 읽어들이기
public class IODemo1 {
	public static void main(String[] args) throws IOException {
		System.out.println("당신은 어느 계절을 좋아하십니까? : ");
		InputStream is = System.in;			//추상클래스여서 자식으로 선언.
		byte [] buffer = new byte[64];		//64byte = 한글 32자 가능.
		int count = is.read(buffer);		//읽어들인 글자 수.
		String season = new String(buffer, 0, count);		//String생성자 통해서 byte배열을 string으로 변환
		System.out.println("season = " + season);
	} 
}
