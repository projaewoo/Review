import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a host name : ");
		String hostname = scan.next();
		try {
//			InetAddress ia = InetAddress.getByName(hostname);		//hostname���� InetAddress����.
			
			//�迭�� �д� ��� //���ͳ� ����� IP�� �������� �迭�� �о����
			InetAddress [] array = InetAddress.getAllByName(hostname);
			for(InetAddress ia : array) {
				System.out.println(hostname + " ->" + ia.getHostAddress());		//byte�迭�� �޾Ƽ� ���.
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
//		InetAddress.getLocalHost();		//localHost : �ڱ� ��ǻ���� �̸�
		
	}
}
