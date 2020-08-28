/*
 * JDBC�ڵ� (Java -> Oracle DB����)
 */

//1. import����.
import java.sql.*;

public class JdbcDemo {
	public static void main(String[] args) {
		//2. Oracle Driver�� �޸𸮿� �ε�����.
		//Class��� Ŭ���� �̿��ؼ� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  //OracleDriver ��μ���
			System.out.println("Class Loading Success");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
		//3. Oracle Driver�� ���� Oracle DB�� Connection����.
		//Connection : �������̽��̹Ƿ� new �����ϰ�, DriverManager�� getConnection()���� ����
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
											"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
									//url : jdbc:oracle:����̹� ����:@�ӽ��̸�(localhost):xe 
									//url : jdbc:oracle:����̹� ����:@�ڱ� IP����Ű�� ���� (127.0.0.1)�� ����:xe  <- Expression Edition �ٿ�޾��� ��
									//url : jdbc:oracle:����̹� ����:@�ڱ� IP��(211.63.89.134) ����:xe  <- Expression Edition �ٿ�޾��� ��
			System.out.println("Connection Success");
		} catch (SQLException e) {
			System.out.println("Connection Failure");
		}
		
		//4. Statement��ü�� ��������.	//Statement : interface //new ��� �Ұ� //ConnectionŬ������ createStatement()�̿�
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			//5. SQL�� �ۼ��ؼ� ��������.
			String sql = "SELECT empno, ename, sal FROM emp";		//emp���̺��� �����ȣ, ����̸� �� ������
			//stmt���ؼ� sql������ ������  //SELECT�϶��� executeQuery()�� ��� //������ ����.
			//SELECT�� ��ȸ����� ��ƾ��ϹǷ� ResultSet (�������̽�)�� ��ƾ���.
			rs = stmt.executeQuery(sql);			//rs�� 14���� �����ȣ, ����̸� �������  //Java -> Oracle DB�� ������ �ٱ���?
			
			//6. SELECT�� ��� ResultSet ó������.  //DB���� ������?
			while(rs.next()) {		//��� ����ִ��� �𸣹Ƿ� �ݺ�Ƚ�� �� = while()��� //DB���� Ŀ�� : next() : ���� Ŀ���� ���� ������
				int empno = rs.getInt(1);		//empno�� �� : NUMBER = �ڹ��� �� : Int //Oracle Index : 1���� ����
				String ename = rs.getString("ename");	//2��° ĭ : ename�� �� : VARCHAR2 = �ڹ��� String	//"ename" : DB�� Į��(��)�� �̸����� ����
				double sal = rs.getDouble("sal");	//Oracle�� sal�� �� : NUMBER(7, 2) : ��ü�ڸ� 7�ڸ�, �Ҽ��� 2�ڸ� = Java�� Double
				System.out.printf("%d\t%s\t%7.2f%n", empno, ename, sal);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		//7. Close����. (Connection, Statement, ResultSet ������ �������Ƿ� �� �ݾ�)
		try {
			if(rs != null)		 rs.close();  				//�ٱ���
			if(stmt != null)  stmt.close();		//stmt�����ִٸ�
			if(conn != null)  conn.close();		//conn �����ִٸ�
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
	}
}
