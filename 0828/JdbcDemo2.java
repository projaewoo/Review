import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;     //1단계
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//파일에서 열기
//유지보수 용이
public class JdbcDemo2 {
	private Properties infos;
	
	public JdbcDemo2() {  	//생성자 : 멤버변수 초기화
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
		JdbcDemo2 jd = new JdbcDemo2();			//멤버변수 생성
		
		Class.forName(jd.infos.getProperty("DBDRIVER"));		//2단계 : key를 통해 value값 가져옴
		Connection conn = DriverManager.getConnection(   //3단계
										jd.infos.getProperty("DBURL"),
										jd.infos.getProperty("DBUSER"),
										jd.infos.getProperty("DBPASSWD"));   
		Statement stmt = conn.createStatement();				//4단계
		String sql = "SELECT sysdate FROM dual";			
		ResultSet rs = stmt.executeQuery(sql);		//5단계 : 오늘 날짜를 바구니에 담기
		while(rs.next()) {		//6단계 : 꺼내기			
			java.util.Date today = rs.getDate(1);     //안에 들어있는게 숫자 : getDate	//rs바구니에 칼럼이름 없음 -> 인덱스로 접근 (Oracle은 1부터 시작)
			System.out.println(today);
		}
		if(rs != null)  rs.close();					//7단계 : 닫기
		if(stmt != null)  stmt.close();
		if(conn != null)  conn.close();
	}
	
	
}
