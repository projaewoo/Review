//동기화(Synchronized)
//한 번에 한 쓰레드만 처리하도록

public class ATM1 implements Runnable {
	private int balance = 10000;			//mother과 son이 공유
	
	public ATM1() {
		this.balance = 10000;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			synchronized (this) {		//this : 이 블록을 사용하게 될 쓰레드 (엄마 또는 아들)
				try {								//차감하는 withdraw만 동기화.	//차감은 한 쓰레드만 (엄마가 들어오면 아들은 대기)
					Thread.sleep(1000);			//1초 쉬었다가 진행.	//원래 sleep걸리면 다른 쓰레드에게 우선권 넘어가서 다른 쓰레드 진행	//여기선 동기화 블록에 걸려있어서 쉬었다가 같은 쓰레드를 다시 진행.
				} catch (InterruptedException e) {}
				if(this.balance > 0)	withdraw(1000);
				else break;
			}
		}
	}

	private void withdraw(int howmuch) {
		this.balance -= howmuch;
		System.out.print("[" + Thread.currentThread().getName() + "]");
		System.out.println(this.balance + "남았음.");
	}
}
/*synchronized블록
 * 원래 쓰레드가 sleep()상태에 들어가면 Blocked -> Runnable상태가 되서 다른 쓰레드에게 우선권 줌.
 * 그러나 synchronized블록안에서 sleep하게 되면 쓰레드가 깨어나기까지 기다렸다가 다시 진행함.
 */
 
