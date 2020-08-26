import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//��ٷȴٰ� ������ ���� �޼����� �ǵ�����.
public class UdpEchoServer {
	private DatagramSocket server;
	private DatagramPacket sendPacket, receivePacket;
	
	public UdpEchoServer() {
		try {
			this.server = new DatagramSocket(9999);
			System.out.println("Server is ready.");
		} catch (SocketException e) {			//parameter ��Ʈ��ȣ�� �̹� ���� ������ ó��.
			System.out.println(e);
		}
	}

	private void service() {
		try {
			while(true) {
				byte [] buffer = new byte[512];
				this.receivePacket = new DatagramPacket(buffer, buffer.length);		//�޴����̹Ƿ� �Ķ���� 2��
				this.server.receive(receivePacket);  //receive : ����   //byte�迭�� ����		
				//byte�迭 -> string��ȯ
				String message = new String(buffer, 0, receivePacket.getLength());		//buffer�� 0~receivePacket.getLength() ��ŭ �о�鿩�� message�� ����.
				if(message.equals("/quit"))  break;		//�۽� ������ /quit ���� ���� ��.
				
				//23~28�� : Ŭ���̾�Ʈ �޼��� -> ������ ����
				//33~40�� : Ŭ���̾�Ʈ�� �޼������� Ŭ���̾�Ʈ �ּ�, ��Ʈ �̾Ƴ��� //���� -> Ŭ���̾�Ʈ�� �޼��� ����.
				
				InetAddress clientAddress = this.receivePacket.getAddress();   //���� ��Ŷ�� �ּ� = Ŭ���̾�Ʈ �ּ� �˾Ƴ��� //���� ��Ŷ���� �ּҸ� �̾Ƴ�.
				int clientPort = this.receivePacket.getPort();			//���� ��Ŷ�� ��Ʈ = Ŭ���̾�Ʈ ��Ʈ
				System.out.println("[" + clientAddress.getHostAddress() + "]" + message);
				//���� �޼��� (String) -> byte[]
				byte [] sendBuffer = ("From Server : " + message).getBytes();		//String.getByte() : string -> byte[]�� ����
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length,		//������ ��Ŷ : �Ķ���� 4��
																		clientAddress, clientPort);						
				this.server.send(sendPacket);			//send : �߽�
			}
		} catch (Exception e) {

		}
	}
	
	public static void main(String[] args) {
		new UdpEchoServer().service();
	}
}
