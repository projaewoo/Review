import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread{
	private Socket client;
	private BufferedReader br;
	private PrintWriter pw;

	public ServerThread(Socket client) {
		try {
			this.client = client;
			this.br = new BufferedReader(
								new InputStreamReader(
									this.client.getInputStream()));		//getInputStream() = InputStream������ ��ȯ.
			this.pw = new PrintWriter(													//������ ���� PrintWriter
								new BufferedWriter(
										new OutputStreamWriter(
												this.client.getOutputStream())));	//������, OutputStream���� ����.
		}catch(IOException ex) {}
	}
	
	@Override		//Thread�ڽ��̹Ƿ� �޼ҵ� ������
	public void run() {				//OS�� �����췯�� ���� ����� �ڵ�
		try {
			String line = this.br.readLine();
//			System.out.println(line);			//   GET / HTTP/1.1�̷��� ����.
			int start = line.indexOf(" ") + 1;		//4 (=3 + 1)(0���� ���� �����ؼ� ī��Ʈ) //ù��° ������ ���°? 
			int end = line.indexOf("HTTP") - 1;			//5 (=6 - 1)(0���� ���� �����ؼ� ī��Ʈ)  //"HTTP"���� ��
			String filename = line.substring(start, end);	//���� �̸� ������� ��°� :	GET /index.html HTTP/1.1  //���� start ~ end�� ���� ����ϸ� �����̸� ����.
//			System.out.println(filename);
			if(filename.startsWith("/") && filename.length() == 1)	filename = "index.html";		//�����̸� �Ƚ����� �����̸��� index.html�� ��������. 
			send(filename);																											//���� �̸� �Ƚ����� �����̸� "/"�� ���� & ���� = 1 ("/"�ϳ� ���̾)
		} catch (IOException e) {
			System.out.println(e);
		} 
	}
	private void send(String filename) throws IOException{
		File file = new File("D:/WebHome/" + filename);
		String line = null;
		this.br = new BufferedReader(
							new FileReader(file));		//File�� �о���ؼ� FileReader���.
		while((line = this.br.readLine()) != null) {
			this.pw.println(line);
			this.pw.flush();
		}
	}
}
