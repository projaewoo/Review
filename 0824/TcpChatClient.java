import java.io.IOException;
import java.net.Socket;

//��ȭâ�� GUI�� ������ Client
//cmd���� �����Ҷ� ��ɾ� : java TcpChatClient ����IP ��ȭ��		//args�迭�� 0��°�� ����IP, 2��° �濡 ��ȭ�� ��
public class TcpChatClient {
	private Socket client;
	private TcpChatThread thread;		//Thread�� �ڽ�.
	
	public TcpChatClient(String serverIP, String userid) {	//������ : ������� �ʱ�ȭ
		try {
			this.client = new Socket(serverIP, 8888);		//���� ��û
			this.thread = new TcpChatThread(userid);		//��ȭ�� �Ѱ���.
			this.thread.start();
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		String serverIP = args[0];
		String userid = args[1];		//��ȭ��
		TcpChatClient chatClient = new TcpChatClient(serverIP, userid);
		
	}
}
