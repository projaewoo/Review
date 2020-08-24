import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientThread extends Thread {
	private Socket socket;
	private BufferedReader br;		//�ѱ۷� ���� �� �����Ƿ�	 BufferdREader�� �о���� ����
	private PrintWriter pw;	
	private InetAddress client;
	
	public ClientThread(Socket socket) throws IOException {		//������ : ������� �ʱ�ȭ.
		this.socket = socket;
		this.client = this.socket.getInetAddress();	//�� ���� ����
		System.out.println("[" + this.client.getHostAddress() + "] is connected");
		InputStream is = this.socket.getInputStream();		//�� ������ socket�� ����ϹǷ� �ͳ� ����.
		this.br = new BufferedReader(new InputStreamReader(is));
		OutputStream out = this.socket.getOutputStream();	//�� ������ socket�� ����ϹǷ� �ͳ� ����.
		this.pw = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(out)));
	}
	
	@Override
	public void run() {			//�� �����尡 �ڱ� ���� ��ȭ��.
		//OS�� ó���ϴ� �ڵ�
		try {
			while(true) {		//client��ٸ�.		//try�ȿ� ���ѷ��� ���� Exception�߻��ϸ� ������ ���ѷ���, try����� catch������ ��.
				String msg = this.br.readLine();		//client�κ��� ���� �޼���
				System.out.println(msg);		//Reader : �ѱ� ����
				String sendMsg = "[From Server] : " + msg;
				this.pw.println(sendMsg);			//�߼�
				this.pw.flush();  		//�ݵ�� ���ۿ� ����������.
			}
		}catch(IOException ex) {			//��ȭ ����.
			System.out.println("Client Connection was closed");
		}
	}
	
	
}
