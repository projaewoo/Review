//Runnable�������̽� �����ؼ� ��Ƽ������ ����.
public class TwoThread1 implements Runnable {
	private Thread thread;
	TwoThread1(String name) {
		this.thread = new Thread(this, name);	//Thread ������ : new Thread(Runnable, String)
		this.thread.start();		//ThreadŬ������ start()���.
	}
	
	public static void main(String[] args) {
		TwoThread1 tt = new TwoThread1("MyThread");		//�����忡 �̸� �ο�.
		for(int i = 0 ; i < 10; i++)										//main�����尡 ����.
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}

	@Override
	public void run() {		//Runnable�� public abstract void run()�޼ҵ带 �������Ϸ��� �ݵ�� public���� ������.
		for(int i = 0 ; i < 10 ; i++)		//"MyThread"�����尡 ����.
			System.out.println(Thread.currentThread().getName() + " --> " + i);
	}
}
