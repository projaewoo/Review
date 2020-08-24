import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/*
 * 1.  URL을 검사해서 MalformedURLException 여부 판단
*	2. Stream 생성
*  3. URLConnection 객체 생성
*
 */
public class URLDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a URL : ");
		String urlStr = scan.next();
		URL url = null;
		try {
			 url = new URL(urlStr);
			 System.out.println("Protocol : " + url.getProtocol());
			 System.out.println("Host : " + url.getHost());
			 System.out.println("Port: " + url.getPort());
			 System.out.println("Dafault Port : " + url.getDefaultPort());
			 System.out.println("File : " + url.getFile());
			 System.out.println("QueryString: " + url.getQuery());
			 System.out.println("Reference : " + url.getRef());
			 System.out.println("Path : " + url.getPath());
		} catch (MalformedURLException e) {			//URL잘못 넣었을 때 발생하는 Exception
			System.out.println("잘못된 URL입니다.");
		}
		
		
	}
}
