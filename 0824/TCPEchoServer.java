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

//서버 생성
//한명밖에 처리 안됨 (쓰레드로 구현 안해서)
public class TCPEchoServer {
	private ServerSocket server;	//생성할 server socket
	private Socket socket;				//사용할 socket  //client와 대화할 socket
	private BufferedReader br;		//한글로 보낼 수 있으므로	 BufferdREader로 읽어들일 예정
	private PrintWriter pw;	
	
	public TCPEchoServer () {	//생성자 : 멤버변수 초기화
		
		try {
			this.server = new ServerSocket(8888);	//port number
			System.out.println("Server is ready...");
		} catch (IOException e) {
			System.out.println(e);
		}		
	}
	private void service() {
		try {
				this.socket = this.server.accept();		//양 끝단에 socket이 이어짐.
				String clientAddress = this.socket.getInetAddress().getHostAddress();	
				System.out.println("[" + clientAddress + "] Connection Success");
				InputStream is = this.socket.getInputStream();		//양 끝단의 socket이 통신하므로 터널 연결.
				this.br = new BufferedReader(new InputStreamReader(is));
				OutputStream out = this.socket.getOutputStream();	//양 끝단의 socket이 통신하므로 터널 연결.
				this.pw = new PrintWriter(new BufferedWriter(
						new OutputStreamWriter(out)));
				//이제 read, write가능.
				while(true) {		//client기다림.		//try안에 무한루프 에서 Exception발생하면 무조건 무한루프, try벗어나서 catch문으로 감.
				String msg = this.br.readLine();		//client로부터 들어온 메세지
				System.out.println("[" + clientAddress + "]" + msg);		//Reader : 한글 지원
				String sendMsg = "[From Server] : " + msg;
				this.pw.println(sendMsg);			//발송
				this.pw.flush();  		//반드시 버퍼에 내보내야함.
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
