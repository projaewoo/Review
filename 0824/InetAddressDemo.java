import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a host name : ");
		String hostname = scan.next();
		try {
//			InetAddress ia = InetAddress.getByName(hostname);		//hostname으로 InetAddress만듬.
			
			//배열로 읽는 방법 //인터넷 기업은 IP가 여러개라 배열로 읽어야함
			InetAddress [] array = InetAddress.getAllByName(hostname);
			for(InetAddress ia : array) {
				System.out.println(hostname + " ->" + ia.getHostAddress());		//byte배열로 받아서 출력.
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
//		InetAddress.getLocalHost();		//localHost : 자기 컴퓨터의 이름
		
	}
}
