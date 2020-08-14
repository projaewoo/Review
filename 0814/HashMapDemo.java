import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		//put() = HahsMap에서 저장하는 메소드
//		map.put("Jan", 1);
		map.put("DBDriver", "com.jdbc.oracle.OracleDriver");
		map.put("DBUrl", "jdbc:oracle:thin:@127.0.0.1:1520:ORCL");
		map.put("DBUser", "jimin");
		map.put("DBPassword", "12345678");
		//get() = HahsMap에서 출력하는 메소드
//		System.out.println("Driver = " + map.get("DBDriver"));
//		System.out.println("DBUrl = " + map.get("DBUrl"));
//		System.out.println("DBUser = " + map.get("DBUser"));
//		System.out.println("DBPassword = " + map.get("DBPassword"));
		
		//편하게 입출력.
		Set <String> set = map.keySet();		//keySet() = key들을 Set으로 만들어줌.
		System.out.println(set);
		
		//데이터 bulk로 가져오기
		Iterator<String> iters = set.iterator();
		while(iters.hasNext()) {			//반복 횟수 몰라서 while
			String key = iters.next();
			System.out.println(key +" --> " + map.get(key));		//get(key) = key에 해당하는 값(value)
		}
		
		
	}
}
