import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception {		//main()������ exception -> JVM���� ����.
		Properties props = new Properties();
//		props.setProperty("DBDriver", "com.jdbc.oracle.OracleDriver");			//setProperty() = (string, string)
//		System.out.println("Driver = " + props.getProperty("DBDriver"));
		
		//���� �ҷ��ͼ� �б�
//		props.load(new FileInputStream("./dbinfo.properties"));		//Stream : byte�� ó��(��� ó��)	//Reader : char������ ó�� (�ѱ� ���� �� ����)
																								//Stream�� �ڽ� : FileInputStream
		//���
//		Enumeration<Object> enums = props.keys();		//key()�� ��ȯŸ�� : Enumeration<Object>
//		while(enums.hasMoreElements()) {
//			String key = (String)enums.nextElement();	//Object -> String���� �ڽ������� ���� ����ȯ
//			System.out.println(key + "--> " + props.getProperty(key));
//		}
		
		//OS���� �̹� ������� ���� ����ϴ� ���		//SystemŬ���� : OS�� Java�� ���� ����.
//		System.out.println("User name = " + System.getProperty("user.name"));
//		System.out.println("Java Version = " + System.getProperty("java.version"));
		
		//OS�� key�� �̾Ƽ� ����ϴ� ���
		//��� Java�� ���õ� ������ ������.
//		Properties osInfo = System.getProperties();	//OS�� Java���� open�� �� �ִ� ������ osInfo�� ����.
//		Enumeration<Object> enums = osInfo.keys();
//		while(enums.hasMoreElements()) {
//			String key = (String)enums.nextElement();	//Object -> String���� �ڽ������� ���� ����ȯ
//			System.out.println(key + "--> " + osInfo.getProperty(key));		//file.separator, path.separator : OS���� �ٸ��Ƿ� ��� �ʿ�.
//		}
		
		//OS�� ȯ�� ���� ���
		Map<String, String> map = System.getenv();		//OS�� ��� ȯ�������� Map<String, String>�� ����
		Set<String> set = map.keySet();		//keySet()�� ��ȯ�� : Set<String>
		Iterator<String> keys = set.iterator();  //iterator()�� ��ȯ�� : Iterator<String>
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.print(key + " --> ");
			System.out.println(map.get(key));
		}
	}
}
