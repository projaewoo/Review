//동기화 & 데드락 대비해서 wait(), notify()사용

public class ATM2 implements Runnable{
	
	private int balance = 10000;		//mother과 son이 공유
	
	public ATM2() {
		this.balance = 10000;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {		//this : 이 블록을 사용하게 될 쓰레드 (엄마 또는 아들)
			synchronized (this) {			//차감하는 withdraw만 동기화.	//차감은 한 쓰레드만 (엄마가 들어오면 아들은 대기)
				try {
					Thread.sleep(1000);			//1초 쉬었다가 진행.		//원래 sleep걸리면 다른 쓰레드에게 우선권 넘어가서 다른 쓰레드 진행	//여기선 동기화 블록에 걸려있어서 쉬었다가 같은 쓰레드를 다시 진행.
				}catch(InterruptedException e) {}
				if(this.balance > 0)  withdraw(1000);
				else break;
				if(this.balance == 2000 || this.balance == 4000 ||
						this.balance == 6000 || this.balance == 8000)
					try {
						this.wait();			//InterruptedException발생.		//synchronized블록 안에서 사용
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				else this.notify();			//synchronized블록 안에서 사용		//son이 2번 출력되면 wait()에 의해 blocked됨. -> mother이 notify()됨
			}//synchroinzed블록 끝.
		}//for문 끝.
	}//run()끝.
	
	
	private void withdraw(int howmuch) {
		this.balance -= howmuch;
		System.out.print("[" + Thread.currentThread().getName() + "]");
		System.out.println(this.balance + "남았음.");
	}
}
