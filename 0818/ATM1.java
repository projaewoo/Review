//����ȭ(Synchronized)
//�� ���� �� �����常 ó���ϵ���

public class ATM1 implements Runnable {
	private int balance = 10000;			//mother�� son�� ����
	
	public ATM1() {
		this.balance = 10000;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			synchronized (this) {		//this : �� ����� ����ϰ� �� ������ (���� �Ǵ� �Ƶ�)
				try {								//�����ϴ� withdraw�� ����ȭ.	//������ �� �����常 (������ ������ �Ƶ��� ���)
					Thread.sleep(1000);			//1�� �����ٰ� ����.	//���� sleep�ɸ��� �ٸ� �����忡�� �켱�� �Ѿ�� �ٸ� ������ ����	//���⼱ ����ȭ ��Ͽ� �ɷ��־ �����ٰ� ���� �����带 �ٽ� ����.
				} catch (InterruptedException e) {}
				if(this.balance > 0)	withdraw(1000);
				else break;
			}
		}
	}

	private void withdraw(int howmuch) {
		this.balance -= howmuch;
		System.out.print("[" + Thread.currentThread().getName() + "]");
		System.out.println(this.balance + "������.");
	}
}
/*synchronized���
 * ���� �����尡 sleep()���¿� ���� Blocked -> Runnable���°� �Ǽ� �ٸ� �����忡�� �켱�� ��.
 * �׷��� synchronized��Ͼȿ��� sleep�ϰ� �Ǹ� �����尡 �������� ��ٷȴٰ� �ٽ� ������.
 */
 
