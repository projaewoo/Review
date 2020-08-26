import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//기다렸다가 유저가 보낸 메세지를 되돌려줌.
public class UdpEchoServer {
	private DatagramSocket server;
	private DatagramPacket sendPacket, receivePacket;
	
	public UdpEchoServer() {
		try {
			this.server = new DatagramSocket(9999);
			System.out.println("Server is ready.");
		} catch (SocketException e) {			//parameter 포트번호를 이미 쓰고 있을때 처리.
			System.out.println(e);
		}
	}

	private void service() {
		try {
			while(true) {
				byte [] buffer = new byte[512];
				this.receivePacket = new DatagramPacket(buffer, buffer.length);		//받는쪽이므로 파라미터 2개
				this.server.receive(receivePacket);  //receive : 수신   //byte배열로 받음		
				//byte배열 -> string변환
				String message = new String(buffer, 0, receivePacket.getLength());		//buffer의 0~receivePacket.getLength() 만큼 읽어들여서 message에 대입.
				if(message.equals("/quit"))  break;		//송신 측에서 /quit 쓰면 서버 끝.
				
				//23~28행 : 클라이언트 메세지 -> 서버가 받음
				//33~40행 : 클라이언트의 메세지에서 클라이언트 주소, 포트 뽑아내서 //서버 -> 클라이언트로 메세지 보냄.
				
				InetAddress clientAddress = this.receivePacket.getAddress();   //받은 패킷의 주소 = 클라이언트 주소 알아내기 //받은 패킷에서 주소를 뽑아냄.
				int clientPort = this.receivePacket.getPort();			//받은 패킷의 포트 = 클라이언트 포트
				System.out.println("[" + clientAddress.getHostAddress() + "]" + message);
				//보낼 메세지 (String) -> byte[]
				byte [] sendBuffer = ("From Server : " + message).getBytes();		//String.getByte() : string -> byte[]로 변경
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length,		//보내는 패킷 : 파라미터 4개
																		clientAddress, clientPort);						
				this.server.send(sendPacket);			//send : 발신
			}
		} catch (Exception e) {

		}
	}
	
	public static void main(String[] args) {
		new UdpEchoServer().service();
	}
}
