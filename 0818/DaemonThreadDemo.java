//DeamonThread
//�۾������ڿ� ������ �ʴ� ������
//��׶��忡�� ���ư��� ������

public class DaemonThreadDemo implements Runnable{
	
	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThreadDemo(), "Demo");
		t.setDaemon(true);		//t�� Daemon���� ����.		//start()�ϱ� ���� Daemon�̶�� ����.
		t.start();
		
		//���ξ����尡 5�� �ڿ� ����ǵ��� ����.
		//���󾲷���� �ٸ������尡 ��� ����Ǹ� �ڵ�����.
		try {
			Thread.sleep(5000);		//5�ʰ� main������ 14�࿡�� �ӹ�.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread�� ����ƽ��ϴ�.");
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("���� Daemon Thread�� �������Դϴ�.");
			try {
				Thread.sleep(500);			//0.5��
			} catch (InterruptedException e) {
				break;				//InterruptedException �߻� ��, break;
			}
		}
		System.out.println("������ Daemon Thread�� �۵����Դϴ�.");			//main�� ����������� �ұ��ϰ� Daemon������� ��� ������
	}																										//�׷��� Daemon�����忩�� �۾������ڿ��� �Ⱥ���.
	
}
/*10�� start() -> main������, Demo������ ���� ���� -> 15�� : main������ 5�� sleep, 27�� : Demo������ 0.5�ʾ� ���.
 * mian������ 5�� �� 19��, 20��( main()�� ) -> main()�������Ƿ� Daemon�������� Demo�����嵵 ��.
 * 
 */
