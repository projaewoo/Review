import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;



//ũ�Ѹ� : ���������� �����͸� �ܾ��.
public class URLDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a URL : ");
		String urlStr = scan.next();
		URL url = null;
		BufferedReader br = null;			String line = null;
//		try {
//			url = new URL(urlStr);
//			InputStream is = url.openStream();	//Stream ���� (naver���� ������ �� ��ǻ�� ���� ���Ϸ� �ν��ϰ� ��)  //InputStream : �о���̴� ����
//			br = new BufferedReader(new InputStreamReader(is));
//			while((line = br.readLine()) != null) {		//�� �� �о line�� ���� (null�� �ƴҵ���)
//				System.out.println(line);
//			}
//			br.close();
//			
//		} catch (MalformedURLException e) {			//URL�߸� �־��� �� �߻��ϴ� Exception
//			System.out.println("�߸��� URL�Դϴ�.");
//		}catch(IOException ex) {
//			
//		}
		
		//���Ϸ� �����
		try {
			url = new URL(urlStr);
			String hostname = url.getHost();		//www.naver.com //��� naver �̾Ƴ�?
			int last = hostname.lastIndexOf(".");		//�ڿ������� .�� ���°�� �ִ��� ã��.  //9��° : naver.�� .
			int start = 0;
			if(hostname.startsWith("www"))		start = hostname.indexOf(".") + 1;	//�տ������� ã��.	//4��° : n
			String file = hostname.substring(start, last) + ".html";		//start�ε��� ~ last�ε��� ���� string�� �̾���.	//file = "naver";	//���̹��� ������ �� ��ǻ���� ~.html�� ����
			InputStream is = url.openStream();	//Stream ���� (naver���� ������ �� ��ǻ�� ���� ���Ϸ� �ν��ϰ� ��)  //InputStream : �о���̴� ����
			PrintWriter	 pw = null;	//PrintWriter�� File�� ������
			br = new BufferedReader(new InputStreamReader(is));	//����.
			pw = new PrintWriter(
						new BufferedWriter(
							new FileWriter(new File(file))));		//������.
			while((line = br.readLine()) != null) {		//�� �� �о line�� ���� (null�� �ƴҵ���)
//				System.out.println(line);
				//PrintWriter����ؼ� ���ڿ��� ������
				pw.printf("%s%n", line);		pw.flush();
			}
			br.close();	pw.close();
			
		} catch (MalformedURLException e) {			//URL�߸� �־��� �� �߻��ϴ� Exception
			System.out.println("�߸��� URL�Դϴ�.");
		}catch(IOException ex) {
			
		}
		System.out.println("Save Success");
	}
}
