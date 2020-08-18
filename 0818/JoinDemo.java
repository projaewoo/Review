
public class JoinDemo {
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {   
			//�͸� Ŭ���� : ������ Ŭ���� ������
			@Override
			public void run() {
				try {
					Thread.sleep(10000);		//t1������ ���⼭ 10�ʰ� sleep.	//sleep ��� : main�� 1�ʵڿ� ������, t1 ������� 10�� �ڿ� ����.
				}catch(InterruptedException ex) {}									//sleep ��� : main�� t1������ ��� ������ ���α׷� ����.
				System.out.println("thread ��.");
			}
		};
		t1.start();
		
		try {
			//join��� : t1�����忡�� �켱�� �ο��ؼ� t1������ ���������� ��ٸ�.
			t1.join();					//�������� ������(t1 thread)�� ���������� ������ ���
		}catch(InterruptedException ex) {}
		System.out.println("main thread ��.");
		
	}
}
