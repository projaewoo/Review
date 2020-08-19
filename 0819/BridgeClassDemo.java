import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * InputStream --> Reader --> Memory --> Writer --> OutputStream
 */

//byte와 char기반을 연결하는 InputStreamReader
//InputStream을 Reader로 연결해주는 InputStreamReader
public class BridgeClassDemo {
	public static void main(String[] args) throws IOException {
		System.out.print("당신은 어느 계절을 좋아하십니까? : ");
		InputStream is = System.in;		//표준입력 (from Keyboard)	//byte기반으로 읽어들임 //따라서 InputStream으로 받음.
		InputStreamReader isr = new InputStreamReader(is);		//InputStreamReader의 생성자 : (InputStream형)	-> Reader로 변형 //byte -> char기반으로 변형
//		System.out.println(isr.getEncoding());		//MS949방식으로 encoding함.
		BufferedReader br = new BufferedReader(isr);		//Reader의 자식 : InputStreamReader
		String season = br.readLine();	//엔터 칠때까지 읽음.		//이 방식이 편해서 14~17행 과정 진행.
		System.out.println("season = " + season);
	}
}
