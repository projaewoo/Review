import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		//put() = HahsMap���� �����ϴ� �޼ҵ�
//		map.put("Jan", 1);
		map.put("DBDriver", "com.jdbc.oracle.OracleDriver");
		map.put("DBUrl", "jdbc:oracle:thin:@127.0.0.1:1520:ORCL");
		map.put("DBUser", "jimin");
		map.put("DBPassword", "12345678");
		//get() = HahsMap���� ����ϴ� �޼ҵ�
//		System.out.println("Driver = " + map.get("DBDriver"));
//		System.out.println("DBUrl = " + map.get("DBUrl"));
//		System.out.println("DBUser = " + map.get("DBUser"));
//		System.out.println("DBPassword = " + map.get("DBPassword"));
		
		//���ϰ� �����.
		Set <String> set = map.keySet();		//keySet() = key���� Set���� �������.
		System.out.println(set);
		
		//������ bulk�� ��������
		Iterator<String> iters = set.iterator();
		while(iters.hasNext()) {			//�ݺ� Ƚ�� ���� while
			String key = iters.next();
			System.out.println(key +" --> " + map.get(key));		//get(key) = key�� �ش��ϴ� ��(value)
		}
		
		
	}
}
