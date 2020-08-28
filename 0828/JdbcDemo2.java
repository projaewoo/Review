import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;     //1�ܰ�
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//���Ͽ��� ����
//�������� ����
public class JdbcDemo2 {
	private Properties infos;
	
	public JdbcDemo2() {  	//������ : ������� �ʱ�ȭ
		infos = new Properties();
		File file = new File("C:/temp/dbinfo.properties");
		try {
			infos.load(new FileInputStream(file));
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		JdbcDemo2 jd = new JdbcDemo2();			//������� ����
		
		Class.forName(jd.infos.getProperty("DBDRIVER"));		//2�ܰ� : key�� ���� value�� ������
		Connection conn = DriverManager.getConnection(   //3�ܰ�
										jd.infos.getProperty("DBURL"),
										jd.infos.getProperty("DBUSER"),
										jd.infos.getProperty("DBPASSWD"));   
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
