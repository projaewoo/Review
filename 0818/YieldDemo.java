//�� �����尡 ���� �纸�ϸ� ����.

public class YieldDemo implements Runnable {
	
	public static void main(String[] args) {
		YieldDemo yd1 = new YieldDemo();		Thread t1 = new Thread(yd1, "Sally");
		YieldDemo yd2 = new YieldDemo();		Thread t2 = new Thread(yd2, "Duncan");
		t1.start();
		t2.start();				//Sally, Duncan�����尡 run()�� ���ÿ� ����.
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			try {
				Thread.sleep(1000);		//1�� ���ڰ� �� ��, ����		//������� Sally������ sleep() -> Blocked���� -> Runnable(������) -> Running.	//Sally�� Runnable�����϶�, �켱���� ���� Duncan�� Running
				System.out.println(Thread.currentThread().getName() + "--> " + i);
			} catch (InterruptedException ex) {}
		}
	}
}
/*16�� : Sally�� sleep()�� ���� Blocked -> Runnable���µǸ� Sally�� �켱���� �ڷ�
 * 			�̶� Duncan�� �켱���� > Sally�� �켱����  //���� Duncan�� Running.
 * 																		//�ٽ� Duncan�� sleep() -> Blocked -> Runnable���� �Ǽ� Duncan �켱���� �ڷ�  
 * 
 */
