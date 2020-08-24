import java.io.IOException;
import java.net.Socket;

//대화창을 GUI로 구현한 Client
//cmd에서 구현할때 명령어 : java TcpChatClient 서버IP 대화명		//args배열의 0번째에 서버IP, 2번째 방에 대화명 들어감
public class TcpChatClient {
	private Socket client;
	private TcpChatThread thread;		//Thread의 자식.
	
	public TcpChatClient(String serverIP, String userid) {	//생성자 : 멤버변수 초기화
		try {
			this.client = new Socket(serverIP, 8888);		//서버 요청
			this.thread = new TcpChatThread(userid);		//대화명 넘겨줌.
			this.thread.start();
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		String serverIP = args[0];
		String userid = args[1];		//대화명
		TcpChatClient chatClient = new TcpChatClient(serverIP, userid);
		
	}
}
