import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//���� ����
//�Ѹ�ۿ� ó�� �ȵ� (������� ���� ���ؼ�)
public class TCPEchoServer {
	private ServerSocket server;	//������ server socket
	private Socket socket;				//����� socket  //client�� ��ȭ�� socket
	private BufferedReader br;		//�ѱ۷� ���� �� �����Ƿ�	 BufferdREader�� �о���� ����
	private PrintWriter pw;	
	
	public TCPEchoServer () {	//������ : ������� �ʱ�ȭ
		
		try {
			this.server = new ServerSocket(8888);	//port number
			System.out.println("Server is ready...");
		} catch (IOException e) {
			System.out.println(e);
		}		
	}
	private void service() {
		try {
				this.socket = this.server.accept();		//�� ���ܿ� socket�� �̾���.
				String clientAddress = this.socket.getInetAddress().getHostAddress();	
				System.out.println("[" + clientAddress + "] Connection Success");
				InputStream is = this.socket.getInputStream();		//�� ������ socket�� ����ϹǷ� �ͳ� ����.
				this.br = new BufferedReader(new InputStreamReader(is));
				OutputStream out = this.socket.getOutputStream();	//�� ������ socket�� ����ϹǷ� �ͳ� ����.
				this.pw = new PrintWriter(new BufferedWriter(
						new OutputStreamWriter(out)));
				//���� read, write����.
				while(true) {		//client��ٸ�.		//try�ȿ� ���ѷ��� ���� Exception�߻��ϸ� ������ ���ѷ���, try����� catch������ ��.
				String msg = this.br.readLine();		//client�κ��� ���� �޼���
				System.out.println("[" + clientAddress + "]" + msg);		//Reader : �ѱ� ����
				String sendMsg = "[From Server] : " + msg;
				this.pw.println(sendMsg);			//�߼�
				this.pw.flush();  		//�ݵ�� ���ۿ� ����������.
			}
		} catch (IOException e) {
			System.out.println("Client Connection was Closed");
		}
	}
	public static void main(String[] args) {
		TCPEchoServer tcp = new TCPEchoServer();
		tcp.service();
	}
}
