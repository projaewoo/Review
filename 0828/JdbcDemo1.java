import java.sql.Connection;     //1�ܰ�
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JdbcDemo���� ���� ����
//���� : �������� �����, ��й�ȣ ����
public class JdbcDemo1 {
	private static final String DRIVER;		//static���  //Driver, ID, password, url �� �ٲ�Ƿ�
	private static final String URL;
	private static final String USER;
	private static final String PASSWD;
	static {		//static��� �ʱ�ȭ = static���
		DRIVER = "oracle.jdbc.driver.OracleDriver";
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		USER = "scott";
		PASSWD = "tiger";
	}
	
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER);		//2�ܰ�
		Connection conn = DriverManager.getConnection(   //3�ܰ�
										URL, USER, PASSWD);   
		Statement stmt = conn.createStatement();				//4�ܰ�
		String sql = "SELECT sysdate FROM dual";			
		ResultSet rs = stmt.executeQuery(sql);		//5�ܰ� : ���� ��¥�� �ٱ��Ͽ� ���
		while(rs.next()) {		//6�ܰ� : ������			
			java.util.Date today = rs.getDate(1);     //�ȿ� ����ִ°� ���� : getDate	//rs�ٱ��Ͽ� Į���̸� ���� -> �ε����� ���� (Oracle�� 1���� ����)
			System.out.println(today);
		}
		if(rs != null)  rs.close();					//7�ܰ� : �ݱ�
		if(stmt != null)  stmt.close();
		if(conn != null)  conn.close();
	}
	
	
}
