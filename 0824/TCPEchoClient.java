import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//client����.
public class TCPEchoClient {
	private Socket client;	//���� �ƴϹǷ� ���ϸ� �־ ��.
	private BufferedReader br;
	private PrintWriter pw;
	
	public TCPEchoClient() {				//960page 2�ܰ�		//Ŭ���̾�Ʈ : ���� �����, ������ ���� ��û
		try {
			this.client = new Socket("211.63.89.134", 8888);	//������ ����.	//Server�� IP, port
			System.out.println("Server Connection Success");    
			this.br = new BufferedReader(							//������ ���� : ������� �ʱ�ȭ
								new InputStreamReader(
										this.client.getInputStream()));		//socket������ ���Ͽ��� InputStream, OutputStream����
			this.pw = new PrintWriter(								//������ ���� : ������� �ʱ�ȭ
								new BufferedWriter(new OutputStreamWriter(this.client.getOutputStream())));		//�ѱ��� byte�� �������� : OutputStreamWriter
		} catch (UnknownHostException e) {
			System.out.println("UnknownHost");
		} catch (IOException e) {
			System.out.println(e);
		}		
	}

	private void service() {
		Scanner scan = new Scanner(System.in);
		System.out.println("<<������ ������ �޼����� �Է��ϼ���. �׸��Ͻ÷��� �׳� Enter key�� ��������. >>");
		try {
			while(true) {
				System.out.print(">> ");
				String msg = scan.nextLine();
				if(msg.length() == 0) break;
				this.pw.println(msg);	//msg�� ������ ���� (������ �Ŷ� PrintWriter)
				this.pw.flush();  					
				System.out.println(this.br.readLine());  //�������� �� �޼����� �о����
			}
			System.out.println("Server Connection Closed");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		TCPEchoClient tcp = new TCPEchoClient();		tcp.service();
	}
}
