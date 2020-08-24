import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//GUI������ ä�þ�����
public class TcpChatThread extends Thread{
	private String userid;
	//������ GUI
	private Frame f;
	private TextArea ta;
	private TextField tf;
	private Font font;
	
	public TcpChatThread(String userid) {
		this.userid = userid;
		this.font = new Font("���� ���", Font.PLAIN, 30);
		this.f = new Frame("[" + this.userid + "] MyChatting v1");
		this.ta = new TextArea("", 5, 10, TextArea.SCROLLBARS_BOTH);	//(����, ����, ����, ��ũ�ѹ� 2�� ���)
		this.ta.setFont(font);
		this.ta.setEditable(false);
		
		this.tf = new TextField();
		//�͸�Ŭ����
		this.tf.addActionListener(new ActionListener() {		//Actionlistener : �̺�Ʈ �ڵ鷯�� ����
			@Override
			public void actionPerformed(ActionEvent e) {		//Event handler
				String line = TcpChatThread.this.tf.getText();
				TcpChatThread.this.ta.append(line + "\n");			//�͸�Ŭ���� �ȿ��� this = ���� this�� ȣ��		//�ܺ�Ŭ����.this = �ܺ��� ������� ��밡��.
				TcpChatThread.this.tf.setText("");		//���� ���� ����
			}
		}); 
		this.tf.setFont(font);
		this.f.add(ta, "Center");		//Center�� ����.
		this.f.add(tf, "South");
		this.service();
		this.f.setSize(500, 800);
		this.f.setVisible(true);		//���̰Բ��ϴ� �޼ҵ� 		
	}
	private void service() {
		
	}
	@Override
	public void run() {		//Thread�� �޼ҵ��̹Ƿ�
		//����ó��		//�����°� �ٸ� �޼ҵ尡, �޴°� run()��
		
	}
}
