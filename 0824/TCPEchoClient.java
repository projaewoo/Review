import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//client생성.
public class TCPEchoClient {
	private Socket client;	//서버 아니므로 소켓만 있어도 됨.
	private BufferedReader br;
	private PrintWriter pw;
	
	public TCPEchoClient() {				//960page 2단계		//클라이언트 : 소켓 만들고, 서버에 연결 요청
		try {
			this.client = new Socket("211.63.89.134", 8888);	//서버에 연결.	//Server의 IP, port
			System.out.println("Server Connection Success");    
			this.br = new BufferedReader(							//생성자 역할 : 멤버변수 초기화
								new InputStreamReader(
										this.client.getInputStream()));		//socket만들어야 소켓에서 InputStream, OutputStream나옴
			this.pw = new PrintWriter(								//생성자 역할 : 멤버변수 초기화
								new BufferedWriter(new OutputStreamWriter(this.client.getOutputStream())));		//한글을 byte로 내보내기 : OutputStreamWriter
		} catch (UnknownHostException e) {
			System.out.println("UnknownHost");
		} catch (IOException e) {
			System.out.println(e);
		}		
	}

	private void service() {
		Scanner scan = new Scanner(System.in);
		System.out.println("<<서버에 보내실 메세지를 입력하세요. 그만하시려면 그냥 Enter key를 누르세요. >>");
		try {
			while(true) {
				System.out.print(">> ");
				String msg = scan.nextLine();
				if(msg.length() == 0) break;
				this.pw.println(msg);	//msg를 서버에 보냄 (나가는 거라 PrintWriter)
				this.pw.flush();  					
				System.out.println(this.br.readLine());  //서버에서 온 메세지를 읽어야함
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
