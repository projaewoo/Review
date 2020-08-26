import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient implements ActionListener{
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	private String userid;
	private Frame f;
	private TextArea ta;
	private TextField tf;
	private Font font;
	
	ChatClient(String serverIp, String userid){
		this.userid = userid;
		this.font = new Font("���� ���", Font.PLAIN, 30);
		this.f = new Frame("[" + this.userid + "] MyChatting v2");
		this.ta = new TextArea("", 5, 10, TextArea.SCROLLBARS_BOTH);
		this.tf = new TextField();
		
		try{
			socket = new Socket(serverIp, 8888);  //�������� ������ ��û
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(
						new BufferedWriter(
							new OutputStreamWriter(socket.getOutputStream())));
			pw.println(userid);  pw.flush();
			ClientThread ct = new ClientThread(socket, br, this.ta);  //��������
			ct.start();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	private void render() {
		this.ta.setFont(font);
		this.ta.setEditable(false);
		this.tf.addActionListener(this);
		this.tf.setFont(font);
		this.f.add(ta, "Center");
		this.f.add(tf, "South");
		this.f.setSize(500, 800);
		this.f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {  //event handler, �߼�����
		String message = this.tf.getText();
		this.pw.println(message);  
		this.pw.flush();
		if(message.equals("/quit")) {
			try{
				this.pw.println(message);  
				this.pw.flush();
				this.socket.close();
			}catch(IOException ex){}
		}
		this.tf.setText("");
	}
	
	public static void main(String[] args) {
		String serverIp = args[0];
		String userid = args[1];
		ChatClient cc = new ChatClient(serverIp, userid);
		cc.render();
	}
}