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
//������ ó���Ϸ��� ������� �����ؾ���.
public class TCPEchoServer2 {
	private ServerSocket server;	//������ server socket
	private Socket socket;				//����� socket  //client�� ��ȭ�� socket
	private ClientThread thread;
	
	public TCPEchoServer2 () {	//������ : ������� �ʱ�ȭ
		
		try {
			this.server = new ServerSocket(8888);	//port number
			System.out.println("Server is ready...");
		} catch (IOException e) {
			System.out.println(e);
		}		
	}
	private void service() {
		try {
			while(true) {			//Client��� ��ٸ�.
					this.socket = this.server.accept();		//�����κ��� ��ȭ��û ��. //���� �湮.	//�� ���ܿ� socket�� �̾���.
					this.thread = new ClientThread(this.socket);		//�� ���� ��ȭ�� ���� Thread ����.		//�� ������ �����忡�� �ѱ�
					this.thread.start(); 	//�� ���� ��ȭ ����. 	//���� �������� ���۽��ѳ���.		//�ٸ� ������ ������ �ٽ� 30~32�� ����.
			}
		} catch (IOException e) {
			System.out.println("Client Connection was Closed");
		}
	}
	public static void main(String[] args) {
		TCPEchoServer2 tcp = new TCPEchoServer2();
		tcp.service();
	}
}
