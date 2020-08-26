import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//Apache site : ������ �ִ� open�ҽ� (������Ʈ ����)
//GitHub : �ڵ� ����

//Apache������ ������.
public class Apache {
	private ServerSocket server;
	
	public Apache() {		//������ : ������� �ʱ�ȭ
		try {
			this.server = new ServerSocket(80);	//�� ��Ʈ : 80
			System.out.println("Server is ready");
		}catch(IOException ex) {}
	}
	
	private void service() {
		try {
			while(true) {
				Socket client = this.server.accept();			//���� ������ accept�� ����.
				ServerThread st = new ServerThread(client);	//���� �湮�ϸ� ������ ����
				st.start();					//24�� ���� -> ServerThread�� run()���۵�.
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Apache apache = new Apache();
		apache.service();
		//�ٿ��� �� ����
//		new Apache().service();
	}
}
