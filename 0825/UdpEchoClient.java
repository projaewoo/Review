import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpEchoClient {
	private DatagramSocket client;
	private DatagramPacket sendPacket, receivePacket;
	private Scanner scan;
	
	public UdpEchoClient() {		//생성자 : 멤버변수 초기화.
		try {
			this.client = new DatagramSocket();
			//Client용 소켓 : 포트번호 없음 = 가용한 포트를 랜덤으로 사용하겠다는 뜻
			this.scan = new Scanner(System.in);
		} catch (SocketException e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		try {
			System.out.println("서버에게 보내실 메세지를 입력하세요. 그만하시려면 /quit를 넣으세요.");
			while(true) {
				System.out.print(">>");
				//클라이언트 메세지 -> 서버 (클라이언트 : 메세지 보내는 입장)
				String message = this.scan.nextLine();
				byte [] sendBuffer = message.getBytes();		//클라이언트에서 입력받은 메세지(string)을 byte[]로 변환해서 서버에 보내야함. //string -> byte[]
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length,		//보내는 패킷 : 파라미터 4개
						InetAddress.getByName("DESKTOP-E4HGIV1"), 9999);		//서버에게 발송하는 packet		//cmd에서 hostnam으로 파악가능.
				this.client.send(sendPacket);			//서버에게 발송
				
				if(message.equals("/quit")) break;		
				
				//서버 메세지 -> 클라이언트  (클라이언트 : 메세지 받는 입장)
				byte [] buffer = new byte[512];
				this.receivePacket = new DatagramPacket(buffer, buffer.length);		//받는쪽이므로 파라미터 2개
				this.client.receive(receivePacket);  //receive : 수신
				System.out.println(new String(buffer, 0, receivePacket.getLength()));	//서버의 메세지를 받아서(byte[]) String생성자 통해 string으로 출력.
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new UdpEchoClient().service();
	}
}
