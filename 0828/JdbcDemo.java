/*
 * JDBC코딩 (Java -> Oracle DB연동)
 */

//1. import하자.
import java.sql.*;

public class JdbcDemo {
	public static void main(String[] args) {
		//2. Oracle Driver를 메모리에 로딩하자.
		//Class라는 클래스 이용해서 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  //OracleDriver 경로설정
			System.out.println("Class Loading Success");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
		//3. Oracle Driver를 통해 Oracle DB에 Connection하자.
		//Connection : 인터페이스이므로 new 사용못하고, DriverManager의 getConnection()으로 생성
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
											"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
									//url : jdbc:oracle:드라이버 종류:@머신이름(localhost):xe 
									//url : jdbc:oracle:드라이버 종류:@자기 IP가리키는 대명사 (127.0.0.1)도 가능:xe  <- Expression Edition 다운받았을 때
									//url : jdbc:oracle:드라이버 종류:@자기 IP도(211.63.89.134) 가능:xe  <- Expression Edition 다운받았을 때
			System.out.println("Connection Success");
		} catch (SQLException e) {
			System.out.println("Connection Failure");
		}
		
		//4. Statement객체를 생성하자.	//Statement : interface //new 사용 불가 //Connection클래스의 createStatement()이용
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			//5. SQL문 작성해서 실행하자.
			String sql = "SELECT empno, ename, sal FROM emp";		//emp테이블에서 사원번호, 사원이름 다 가져와
			//stmt통해서 sql쿼리문 가져옴  //SELECT일때는 executeQuery()만 사용 //쿼리문 실행.
			//SELECT는 조회결과를 담아야하므로 ResultSet (인터페이스)에 담아야함.
			rs = stmt.executeQuery(sql);			//rs에 14명의 사원번호, 사원이름 들어있음  //Java -> Oracle DB에 보내는 바구니?
			
			//6. SELECT일 경우 ResultSet 처리하자.  //DB에서 꺼내기?
			while(rs.next()) {		//몇개가 들어있는지 모르므로 반복횟수 모름 = while()사용 //DB에서 커서 : next() : 다음 커서에 값이 있을때
				int empno = rs.getInt(1);		//empno의 형 : NUMBER = 자바의 형 : Int //Oracle Index : 1부터 시작
				String ename = rs.getString("ename");	//2번째 칸 : ename의 형 : VARCHAR2 = 자바의 String	//"ename" : DB의 칼럼(열)의 이름으로 읽음
				double sal = rs.getDouble("sal");	//Oracle의 sal의 형 : NUMBER(7, 2) : 전체자리 7자리, 소숫점 2자리 = Java의 Double
				System.out.printf("%d\t%s\t%7.2f%n", empno, ename, sal);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		//7. Close하자. (Connection, Statement, ResultSet 순서로 열었으므로 다 닫아)
		try {
			if(rs != null)		 rs.close();  				//바구니
			if(stmt != null)  stmt.close();		//stmt열려있다면
			if(conn != null)  conn.close();		//conn 열려있다면
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
	}
}
