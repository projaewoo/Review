/*
 * Thread ���� ��� 2����
 * 1. Thread extends
 * 2. Runnable implements
 */

public class CreateThread1 implements Runnable {
	
	public static void main(String[] args) {
		CreateThread1 ct1 = new CreateThread1();
		CreateThread1 ct2 = new CreateThread1();	
		Thread t1 = new Thread(ct1, "Sally");			//Runnable : �������̽��̹Ƿ� new ����	//Thread -> Runnable�̹Ƿ� �ڽ�Ŭ������ Thread�� ����. 
		Thread t2 = new Thread(ct2, "Duncan");		//������ start() ���ϹǷ� Thread ���ؼ� start()
		t1.start();
		t2.start();				//Thread�� start().		//�� �������� ���� ����.
	}
	@Override
	public void run() {		//OS�� Scheduler�� Runnable�� Running����.		//ġ�� ����.
		for(int i = 0 ; i < 10 ; i++)			//OS�� Scheduler�� ������ run()�޼ҵ带 ������.	//start() : Runnable����.	//Runnable -> OS�� Scheduler -> Running���� ( �̶� run()����. )
			System.out.println(Thread.currentThread().getName() + " ==> " + i);
	}
	
}
