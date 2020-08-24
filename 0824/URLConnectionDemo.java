import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//URLConnection : �߻�Ŭ����
//���� URLŬ���� ���ؼ� ����

public class URLConnectionDemo {
	public static void main(String[] args) 
		throws MalformedURLException, IOException{
		String url = "https://www.nate.com/index.html";
//		URLConnection urlConn = new URLConnection();	//�߻�Ŭ������ ���Ұ�.
		URLConnection urlConn = new URL(url).openConnection();
		Map<String, List<String>> headers = urlConn.getHeaderFields();		//����� ����
		Set<String> keys = headers.keySet();		//����� Ű���� ����
		Iterator<String> iters = keys.iterator();	
		//Ű �̱�
//		while(iters.hasNext()) {
//			String key = iters.next(); 
//			System.out.println(key + "-->");  		//����� Ű�鸸 ����
//		}
		//�� �̱�
		while(iters.hasNext()) {
			String key = iters.next(); 
			System.out.println(key + "-->");  		//����� Ű�鸸 ����
			List<String> list = headers.get(key);
			System.out.println(Arrays.toString(list.toArray()));		//�� �̱�.
		}
	}
}
