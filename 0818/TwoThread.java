
//ThreadŬ������ ��ӹ޾Ƽ� ��Ƽ������ ����.
public class TwoThread extends Thread {
	public static void main(String[] args) {
		TwoThread tt = new TwoThread();
//		tt.run();
		tt.start();		//��Ƽ ������ : main������ & TwoThread�� �����尡 ���ư�.		//main�����尡 main�޼ҵ� ����.		//main������� Thread-0�� �����ϸ� �����.
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName() + " --> " + i);
		}
	}
	@Override
	public void run() {				//main�ȿ� ������ main������	//main�ۿ� �ְ�, �̸� ��� �������Ƿ� Thread-0���� ��Ī.
		for(int i = 0 ; i < 10 ; i++)
			System.out.println(Thread.currentThread().getName() + "-->" + i);
	}
}
