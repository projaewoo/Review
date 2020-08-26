import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//Apache site : 전세계 최대 open소스 (프로젝트 모음)
//GitHub : 코드 모음

//Apache웹서버 만들어보기.
public class Apache {
	private ServerSocket server;
	
	public Apache() {		//생성자 : 멤버변수 초기화
		try {
			this.server = new ServerSocket(80);	//웹 포트 : 80
			System.out.println("Server is ready");
		}catch(IOException ex) {}
	}
	
	private void service() {
		try {
			while(true) {
				Socket client = this.server.accept();			//유저 들어오면 accept로 받음.
				ServerThread st = new ServerThread(client);	//유저 방문하면 쓰레드 생성
				st.start();					//24행 진행 -> ServerThread의 run()시작됨.
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Apache apache = new Apache();
		apache.service();
		//줄여서 쓴 내용
//		new Apache().service();
	}
}
