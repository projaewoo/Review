//����ȭ & ����� ����ؼ� wait(), notify()���

public class ATM2 implements Runnable{
	
	private int balance = 10000;		//mother�� son�� ����
	
	public ATM2() {
		this.balance = 10000;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {		//this : �� ����� ����ϰ� �� ������ (���� �Ǵ� �Ƶ�)
			synchronized (this) {			//�����ϴ� withdraw�� ����ȭ.	//������ �� �����常 (������ ������ �Ƶ��� ���)
				try {
					Thread.sleep(1000);			//1�� �����ٰ� ����.		//���� sleep�ɸ��� �ٸ� �����忡�� �켱�� �Ѿ�� �ٸ� ������ ����	//���⼱ ����ȭ ��Ͽ� �ɷ��־ �����ٰ� ���� �����带 �ٽ� ����.
				}catch(InterruptedException e) {}
				if(this.balance > 0)  withdraw(1000);
				else break;
				if(this.balance == 2000 || this.balance == 4000 ||
						this.balance == 6000 || this.balance == 8000)
					try {
						this.wait();			//InterruptedException�߻�.		//synchronized��� �ȿ��� ���
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				else this.notify();			//synchronized��� �ȿ��� ���		//son�� 2�� ��µǸ� wait()�� ���� blocked��. -> mother�� notify()��
			}//synchroinzed��� ��.
		}//for�� ��.
	}//run()��.
	
	
	private void withdraw(int howmuch) {
		this.balance -= howmuch;
		System.out.print("[" + Thread.currentThread().getName() + "]");
		System.out.println(this.balance + "������.");
	}
}
