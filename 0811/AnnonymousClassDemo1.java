import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�ڹ� ��ũ��Ʈ �̺�Ʈ���� ����ϴ� �͸�Ŭ����
public class AnnonymousClassDemo1{
	private Frame f;
	private Button btnOk;
	public AnnonymousClassDemo1(String name) {
		this.f = new Frame(name);
		this.btnOk = new Button("Click Me!!");
		this.btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if(evt.getActionCommand().equals("Click Me!!")) {
					System.out.println(evt.getActionCommand());
				}
			}
		});
	}
	private void display() {
		this.f.add(btnOk, "South");
		this.f.setSize(600, 400);
		this.f.setVisible(true);
	}
	public static void main(String[] args) {
		AnnonymousClassDemo1 acd = new AnnonymousClassDemo1("�� ������");
		acd.display();
	}
	
	
}
