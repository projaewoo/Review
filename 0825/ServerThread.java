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
									this.client.getInputStream()));		//getInputStream() = InputStream형으로 변환.
			this.pw = new PrintWriter(													//나가기 전에 PrintWriter
								new BufferedWriter(
										new OutputStreamWriter(
												this.client.getOutputStream())));	//나갈때, OutputStream으로 나감.
		}catch(IOException ex) {}
	}
	
	@Override		//Thread자식이므로 메소드 재정의
	public void run() {				//OS가 스케쥴러에 의해 사용할 코드
		try {
			String line = this.br.readLine();
//			System.out.println(line);			//   GET / HTTP/1.1이렇게 들어옴.
			int start = line.indexOf(" ") + 1;		//4 (=3 + 1)(0부터 공백 포함해서 카운트) //첫번째 공백이 몇번째? 
			int end = line.indexOf("HTTP") - 1;			//5 (=6 - 1)(0부터 공백 포함해서 카운트)  //"HTTP"앞의 값
			String filename = line.substring(start, end);	//파일 이름 넣은경우 출력값 :	GET /index.html HTTP/1.1  //따라서 start ~ end의 글자 출력하면 파일이름 나옴.
//			System.out.println(filename);
			if(filename.startsWith("/") && filename.length() == 1)	filename = "index.html";		//파일이름 안썼으면 파일이름을 index.html로 지정해줌. 
			send(filename);																											//파일 이름 안썼으면 파일이름 "/"로 시작 & 길이 = 1 ("/"하나 뿐이어서)
		} catch (IOException e) {
			System.out.println(e);
		} 
	}
	private void send(String filename) throws IOException{
		File file = new File("D:/WebHome/" + filename);
		String line = null;
		this.br = new BufferedReader(
							new FileReader(file));		//File을 읽어야해서 FileReader사용.
		while((line = this.br.readLine()) != null) {
			this.pw.println(line);
			this.pw.flush();
		}
	}
}
