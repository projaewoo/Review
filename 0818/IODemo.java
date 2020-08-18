import java.io.IOException;
import java.io.InputStream;

public class IODemo {
	public static void main(String[] args) {
//		System.out.print("한 개의 글자를 입력해주세요 : ");
		System.out.println("당신은 어느 계절을 좋아하십니까? : ");
		//InputStream : 추상메소드 가지고 있어서 추상클래스 //따라서 new 못씀
//		InputStream is = new InputStream();
		InputStream is = System.in;		//표준 입력 스트림.	//키보드로부터 입력받음.
		String season = "";
		try {
			while(true) {
				int su = is.read();					//ASCII code로 읽어들임.	//추상메소드, Exception던짐.	-> checked이므로 try-catch문 사용.	//read() : input stream으로부터 바이트를 읽어들임.	//자바에서 int가 기본형이므로 바이트를 읽어들여도 int로 받아들임.
				if(su < 0 || (char)su == '\n') break;
				else season += (char)su;
			}
			System.out.println("season = " + season);				//byte로 읽어들여서 한글은 못읽음.	//byte기반 stream은 문서 읽어들이기 적합X
		} catch (IOException e) {									
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
