import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpEchoClient {
	private DatagramSocket client;
	private DatagramPacket sendPacket, receivePacket;
	private Scanner scan;
	
	public UdpEchoClient() {		//������ : ������� �ʱ�ȭ.
		try {
			this.client = new DatagramSocket();
			//Client�� ���� : ��Ʈ��ȣ ���� = ������ ��Ʈ�� �������� ����ϰڴٴ� ��
			this.scan = new Scanner(System.in);
		} catch (SocketException e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		try {
			System.out.println("�������� ������ �޼����� �Է��ϼ���. �׸��Ͻ÷��� /quit�� ��������.");
			while(true) {
				System.out.print(">>");
				//Ŭ���̾�Ʈ �޼��� -> ���� (Ŭ���̾�Ʈ : �޼��� ������ ����)
				String message = this.scan.nextLine();
				byte [] sendBuffer = message.getBytes();		//Ŭ���̾�Ʈ���� �Է¹��� �޼���(string)�� byte[]�� ��ȯ�ؼ� ������ ��������. //string -> byte[]
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length,		//������ ��Ŷ : �Ķ���� 4��
						InetAddress.getByName("DESKTOP-E4HGIV1"), 9999);		//�������� �߼��ϴ� packet		//cmd���� hostnam���� �ľǰ���.
				this.client.send(sendPacket);			//�������� �߼�
				
				if(message.equals("/quit")) break;		
				
				//���� �޼��� -> Ŭ���̾�Ʈ  (Ŭ���̾�Ʈ : �޼��� �޴� ����)
				byte [] buffer = new byte[512];
				this.receivePacket = new DatagramPacket(buffer, buffer.length);		//�޴����̹Ƿ� �Ķ���� 2��
				this.client.receive(receivePacket);  //receive : ����
				System.out.println(new String(buffer, 0, receivePacket.getLength()));	//������ �޼����� �޾Ƽ�(byte[]) String������ ���� string���� ���.
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new UdpEchoClient().service();
	}
}
