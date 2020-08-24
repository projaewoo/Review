import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//URLConnection : 추상클래스
//따라서 URL클래스 통해서 생성

public class URLConnectionDemo {
	public static void main(String[] args) 
		throws MalformedURLException, IOException{
		String url = "https://www.nate.com/index.html";
//		URLConnection urlConn = new URLConnection();	//추상클래스라 사용불가.
		URLConnection urlConn = new URL(url).openConnection();
		Map<String, List<String>> headers = urlConn.getHeaderFields();		//헤더를 뽑음
		Set<String> keys = headers.keySet();		//헤더의 키들을 뽑음
		Iterator<String> iters = keys.iterator();	
		//키 뽑기
//		while(iters.hasNext()) {
//			String key = iters.next(); 
//			System.out.println(key + "-->");  		//헤더의 키들만 뽑음
//		}
		//값 뽑기
		while(iters.hasNext()) {
			String key = iters.next(); 
			System.out.println(key + "-->");  		//헤더의 키들만 뽑음
			List<String> list = headers.get(key);
			System.out.println(Arrays.toString(list.toArray()));		//값 뽑기.
		}
	}
}
