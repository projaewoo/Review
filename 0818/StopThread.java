/*
 * Thread�� �����ϰ� stop�ϴ� ���
 * 						( stop() = deprecated�� �Ҿ����ϹǷ� ���X)
 * 1. boolean�� ���� �̿�  --> ���� : main���� stop�ص� �ٷ� stop�Ѵٴ� ����X	(���� �߻�)
 * 2. Exception �̿�  --> try���� Exception�߻��ϸ� ������ stop  (���� X)
 */

public class StopThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);			//Thread(Runnable)�̹Ƿ� Runnable�� ������ MyThread�� ������ ����.
		t.start();
		System.out.println("��� Thread�� start�߽��ϴ�.");
		try {					
			Thread.sleep(1000);		//1�ʵ��� ������ ���߰� ��.	//1. sleep()�� throws IntteruptedException�ؼ� Exception��������	//2. IntterruptedException -> Exception (checked)�̹Ƿ� try-catch���.
		} catch (InterruptedException ex) {}
			System.out.println("���� main�� Thread�� stop�ϰڽ��ϴ�.");
			mt.stop();					//1�� �ڿ� main�� stop() ȣ��.
	}
}
class MyThread implements Runnable {
	private boolean isStop = false;
	void stop() {						//main���� stop()�� ���ϸ� true��.
		this.isStop = true;
	}
	@Override
	public void run() {
		while(true) {			//while���� ��� ����� main�� stop�ɾ������� ���� �����.
			try {
				Thread.sleep(1);		//0.001�ʸ���
			} catch (InterruptedException ex) {}			//1. sleep()�� throws IntteruptedException�ؼ� Exception��������	//2. IntterruptedException -> Exception (checked)�̹Ƿ� try-catch���.
			System.out.println("I'm alive");				//0.001�ʸ��� ���.
			if(this.isStop)		break;				//1�� �ڿ� main�� stop ȣ�� -> isStop == true -> break;
		}
		System.out.println("I'm dead...");
	}
}
/* main�� Thread-0�� ����.
 * 12�࿡�� �� ������ ���� ���� -> 27�� run()�޼ҵ� ����. & 14�൵ ���� ����(main������ 1�� ���� ��, main������ 1�� �ڿ� 17, 18�� �����ϵ���) 
 *  			27�� ���� -> 0.001�ʸ��� ����ִٰ� ���  &  14�� ���� -> 1�� �ڿ� stop�ϰ� ��. 
 *  stop()���� -> 32�� -> 33�� -> 35�� ����.			//���� �߻�.	(stop�Ѵٰ� �ٷ� �ȳ���)
*/