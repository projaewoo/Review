/*
 * Thread ���� ��� 2����
 * 1. Thread extends
 * 2. Runnable implements
 */

public class CreateThread extends Thread {
	CreateThread(String name) {		//������ ����.
		super(name);						//�θ��� Thread�� �����ڿ��� name�ѱ�.
	}
	
	public static void main(String[] args) {
		CreateThread ct1 = new CreateThread("Sally");
		CreateThread ct2 = new CreateThread("Duncan");
		ct1.start();
		ct2.start();			//Runnable����	(ȯ�� 2���� ġ�� �տ��� ������)
	}
	@Override
	public void run() {					//OS�� Scheduler�� Runnable�� Running��.	//ġ�� ����.
		for(int i = 0 ; i < 10 ; i++)		//OS�� Scheduler�� ������ run()�޼ҵ带 ������.	////start() : Runnable���·�	// Runnable -> OS�� Scheduler -> Running���� (�̋� run()����. )
			System.out.println(Thread.currentThread().getName() + " ==> " + i);
	}
}
