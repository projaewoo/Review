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
//여러명 처리하려면 쓰레드로 구현해야함.
public class TCPEchoServer2 {
	private ServerSocket server;	//생성할 server socket
	private Socket socket;				//사용할 socket  //client와 대화할 socket
	private ClientThread thread;
	
	public TCPEchoServer2 () {	//생성자 : 멤버변수 초기화
		
		try {
			this.server = new ServerSocket(8888);	//port number
			System.out.println("Server is ready...");
		} catch (IOException e) {
			System.out.println(e);
		}		
	}
	private void service() {
		try {
			while(true) {			//Client계속 기다림.
					this.socket = this.server.accept();		//고객으로부터 전화요청 옴. //유저 방문.	//양 끝단에 socket이 이어짐.
					this.thread = new ClientThread(this.socket);		//그 고객과 대화할 직원 Thread 생성.		//이 소켓을 쓰레드에게 넘김
					this.thread.start(); 	//그 고객과 대화 시작. 	//정말 쓰레드라면 시작시켜놓음.		//다른 쓰레드 들어오면 다시 30~32행 진행.
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
