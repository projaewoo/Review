//lcok을 걸지 않았을 때, 돌릴때마다 결과 다름.
public class ATM implements Runnable{
	private int balance = 10000;		//mother과 son이 공유
	
	public ATM() {
		this.balance = 10000;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			if(this.balance > 0) 	withdraw(1000);		//1000원씩 차감.
		}
	}

	private void withdraw(int howmuch) {
		this.balance -= howmuch;
		System.out.print("[" + Thread.currentThread().getName() + "]");
		System.out.println(this.balance + "남았음.");
	}
	
}
