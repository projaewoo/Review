import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;



//크롤링 : 웹페이지의 데이터를 긁어옴.
public class URLDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a URL : ");
		String urlStr = scan.next();
		URL url = null;
		BufferedReader br = null;			String line = null;
//		try {
//			url = new URL(urlStr);
//			InputStream is = url.openStream();	//Stream 생성 (naver상의 파일이 내 컴퓨터 상의 파일로 인식하게 됨)  //InputStream : 읽어들이는 빨대
//			br = new BufferedReader(new InputStreamReader(is));
//			while((line = br.readLine()) != null) {		//한 줄 읽어서 line에 넣음 (null이 아닐동안)
//				System.out.println(line);
//			}
//			br.close();
//			
//		} catch (MalformedURLException e) {			//URL잘못 넣었을 때 발생하는 Exception
//			System.out.println("잘못된 URL입니다.");
//		}catch(IOException ex) {
//			
//		}
		
		//파일로 만들기
		try {
			url = new URL(urlStr);
			String hostname = url.getHost();		//www.naver.com //어떻게 naver 뽑아냄?
			int last = hostname.lastIndexOf(".");		//뒤에서부터 .이 몇번째에 있는지 찾음.  //9번째 : naver.의 .
			int start = 0;
			if(hostname.startsWith("www"))		start = hostname.indexOf(".") + 1;	//앞에서부터 찾음.	//4번째 : n
			String file = hostname.substring(start, last) + ".html";		//start인덱스 ~ last인덱스 까지 string을 뽑아줌.	//file = "naver";	//네이버의 파일을 내 컴퓨터의 ~.html로 저장
			InputStream is = url.openStream();	//Stream 생성 (naver상의 파일이 내 컴퓨터 상의 파일로 인식하게 됨)  //InputStream : 읽어들이는 빨대
			PrintWriter	 pw = null;	//PrintWriter로 File을 내보냄
			br = new BufferedReader(new InputStreamReader(is));	//읽음.
			pw = new PrintWriter(
						new BufferedWriter(
							new FileWriter(new File(file))));		//내보냄.
			while((line = br.readLine()) != null) {		//한 줄 읽어서 line에 넣음 (null이 아닐동안)
//				System.out.println(line);
				//PrintWriter사용해서 문자열로 내보냄
				pw.printf("%s%n", line);		pw.flush();
			}
			br.close();	pw.close();
			
		} catch (MalformedURLException e) {			//URL잘못 넣었을 때 발생하는 Exception
			System.out.println("잘못된 URL입니다.");
		}catch(IOException ex) {
			
		}
		System.out.println("Save Success");
	}
}
