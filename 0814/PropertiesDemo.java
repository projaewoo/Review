import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception {		//main()에서의 exception -> JVM에게 던짐.
		Properties props = new Properties();
//		props.setProperty("DBDriver", "com.jdbc.oracle.OracleDriver");			//setProperty() = (string, string)
//		System.out.println("Driver = " + props.getProperty("DBDriver"));
		
		//파일 불러와서 읽기
//		props.load(new FileInputStream("./dbinfo.properties"));		//Stream : byte로 처리(영어만 처리)	//Reader : char단위로 처리 (한글 읽을 수 있음)
																								//Stream의 자식 : FileInputStream
		//출력
//		Enumeration<Object> enums = props.keys();		//key()의 반환타입 : Enumeration<Object>
//		while(enums.hasMoreElements()) {
//			String key = (String)enums.nextElement();	//Object -> String으로 자식형으로 강제 형변환
//			System.out.println(key + "--> " + props.getProperty(key));
//		}
		
		//OS에서 이미 만들어진 것을 사용하는 방법		//System클래스 : OS와 Java의 전령 역할.
//		System.out.println("User name = " + System.getProperty("user.name"));
//		System.out.println("Java Version = " + System.getProperty("java.version"));
		
		//OS의 key를 뽑아서 사용하는 방법
		//대게 Java와 관련된 정보만 보여줌.
//		Properties osInfo = System.getProperties();	//OS가 Java에게 open할 수 있는 정보를 osInfo에 저장.
//		Enumeration<Object> enums = osInfo.keys();
//		while(enums.hasMoreElements()) {
//			String key = (String)enums.nextElement();	//Object -> String으로 자식형으로 강제 형변환
//			System.out.println(key + "--> " + osInfo.getProperty(key));		//file.separator, path.separator : OS마다 다르므로 기억 필요.
//		}
		
		//OS의 환경 보는 방법
		Map<String, String> map = System.getenv();		//OS의 모든 환경정보를 Map<String, String>로 담음
		Set<String> set = map.keySet();		//keySet()의 반환형 : Set<String>
		Iterator<String> keys = set.iterator();  //iterator()의 반환형 : Iterator<String>
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.print(key + " --> ");
			System.out.println(map.get(key));
		}
	}
}
