//lcok�� ���� �ʾ��� ��, ���������� ��� �ٸ�.
public class ATM implements Runnable{
	private int balance = 10000;		//mother�� son�� ����
	
	public ATM() {
		this.balance = 10000;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			if(this.balance > 0) 	withdraw(1000);		//1000���� ����.
		}
	}

	private void withdraw(int howmuch) {
		this.balance -= howmuch;
		System.out.print("[" + Thread.currentThread().getName() + "]");
		System.out.println(this.balance + "������.");
	}
	
}
