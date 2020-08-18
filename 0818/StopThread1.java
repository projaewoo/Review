/*
 * Thread�� �����ϰ� stop�ϴ� ���
 * 						( stop() ��� �Ұ�)
 *  1. boolean�� ���� �̿� --> ���� : main���� stop�ص� �ٷ� stop�Ѵٴ� ����X  (�����߻�)
 *   2. Exception �̿�  --> try���� Exception�߻��ϸ� ������ stop  (����X)
 */

public class StopThread1 {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		Thread t = new Thread(mt);				//new Thread(Runnable target)
		t.start();			//�� ������ ���� ����.
		System.out.println("��� Thread�� start�߽��ϴ�.");
		try {
			Thread.sleep(1000);		//1�ʵ��� main�� ���� ��.	(1�ʵ��� main������ Block����)
		} catch (InterruptedException ex) {}
		System.out.println("���� main�� Thread�� stop�ϰڽ��ϴ�.");
		t.interrupt();			//1�� �ڿ� Thread t�� ���ͷ�Ʈ(����) �ɾ����.
	}
}
class MyThread1 implements Runnable {
	@Override
	public void run() {
		try {
			while(Thread.currentThread().isInterrupted()) {		//���� �����尡 interrupted�������� boolean���� �˷���.	//interrupted �Ȱɷȴٸ� 
				Thread.sleep(1);		//0.001sec
				System.out.println("I'm alive");
			}
		}catch(InterruptedException ex) {
			System.out.println("I'm dead...");
		}
	}
}