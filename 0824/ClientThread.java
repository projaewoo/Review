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
	private BufferedReader br;		//한글로 보낼 수 있으므로	 BufferdREader로 읽어들일 예정
	private PrintWriter pw;	
	private InetAddress client;
	
	public ClientThread(Socket socket) throws IOException {		//생성자 : 멤버변수 초기화.
		this.socket = socket;
		this.client = this.socket.getInetAddress();	//그 고객의 정보
		System.out.println("[" + this.client.getHostAddress() + "] is connected");
		InputStream is = this.socket.getInputStream();		//양 끝단의 socket이 통신하므로 터널 연결.
		this.br = new BufferedReader(new InputStreamReader(is));
		OutputStream out = this.socket.getOutputStream();	//양 끝단의 socket이 통신하므로 터널 연결.
		this.pw = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(out)));
	}
	
	@Override
	public void run() {			//각 쓰레드가 자기 고객과 대화함.
		//OS가 처리하는 코드
		try {
			while(true) {		//client기다림.		//try안에 무한루프 에서 Exception발생하면 무조건 무한루프, try벗어나서 catch문으로 감.
				String msg = this.br.readLine();		//client로부터 들어온 메세지
				System.out.println(msg);		//Reader : 한글 지원
				String sendMsg = "[From Server] : " + msg;
				this.pw.println(sendMsg);			//발송
				this.pw.flush();  		//반드시 버퍼에 내보내야함.
			}
		}catch(IOException ex) {			//대화 끊음.
			System.out.println("Client Connection was closed");
		}
	}
	
	
}
