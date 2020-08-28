import java.sql.Connection;     //1단계
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JdbcDemo보다 쉬운 버전
//단점 : 유지보수 어려움, 비밀번호 노출
public class JdbcDemo1 {
	private static final String DRIVER;		//static상수  //Driver, ID, password, url 안 바뀌므로
	private static final String URL;
	private static final String USER;
	private static final String PASSWD;
	static {		//static상수 초기화 = static블록
		DRIVER = "oracle.jdbc.driver.OracleDriver";
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		USER = "scott";
		PASSWD = "tiger";
	}
	
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER);		//2단계
		Connection conn = DriverManager.getConnection(   //3단계
										URL, USER, PASSWD);   
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
