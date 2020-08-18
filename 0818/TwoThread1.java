//Runnable인터페이스 구현해서 멀티쓰레드 구현.
public class TwoThread1 implements Runnable {
	private Thread thread;
	TwoThread1(String name) {
		this.thread = new Thread(this, name);	//Thread 생성자 : new Thread(Runnable, String)
		this.thread.start();		//Thread클래스의 start()사용.
	}
	
	public static void main(String[] args) {
		TwoThread1 tt = new TwoThread1("MyThread");		//쓰레드에 이름 부여.
		for(int i = 0 ; i < 10; i++)										//main쓰레드가 실행.
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}

	@Override
	public void run() {		//Runnable의 public abstract void run()메소드를 재정의하려면 반드시 public으로 재정의.
		for(int i = 0 ; i < 10 ; i++)		//"MyThread"쓰레드가 실행.
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}
}
