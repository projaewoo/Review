import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//GUI구현한 채팅쓰레드
public class TcpChatThread extends Thread{
	private String userid;
	//간단한 GUI
	private Frame f;
	private TextArea ta;
	private TextField tf;
	private Font font;
	
	public TcpChatThread(String userid) {
		this.userid = userid;
		this.font = new Font("맑은 고딕", Font.PLAIN, 30);
		this.f = new Frame("[" + this.userid + "] MyChatting v1");
		this.ta = new TextArea("", 5, 10, TextArea.SCROLLBARS_BOTH);	//(글자, 가로, 세로, 스크롤바 2개 사용)
		this.ta.setFont(font);
		this.ta.setEditable(false);
		
		this.tf = new TextField();
		//익명클래스
		this.tf.addActionListener(new ActionListener() {		//Actionlistener : 이벤트 핸들러와 연결
			@Override
			public void actionPerformed(ActionEvent e) {		//Event handler
				String line = TcpChatThread.this.tf.getText();
				TcpChatThread.this.ta.append(line + "\n");			//익명클래스 안에서 this = 안의 this만 호출		//외부클래스.this = 외부의 멤버변수 사용가능.
				TcpChatThread.this.tf.setText("");		//보낸 내용 지움
			}
		}); 
		this.tf.setFont(font);
		this.f.add(ta, "Center");		//Center에 붙임.
		this.f.add(tf, "South");
		this.service();
		this.f.setSize(500, 800);
		this.f.setVisible(true);		//보이게끔하는 메소드 		
	}
	private void service() {
		
	}
	@Override
	public void run() {		//Thread의 메소드이므로
		//수신처리		//보내는건 다른 메소드가, 받는건 run()이
		
	}
}
