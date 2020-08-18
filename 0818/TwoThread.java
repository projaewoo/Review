
//Thread클래스를 상속받아서 멀티쓰레드 구현.
public class TwoThread extends Thread {
	public static void main(String[] args) {
		TwoThread tt = new TwoThread();
//		tt.run();
		tt.start();		//멀티 쓰레드 : main쓰레드 & TwoThread의 쓰레드가 돌아감.		//main쓰레드가 main메소드 돌림.		//main쓰레드와 Thread-0이 경합하며 실행됨.
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName() + " --> " + i);
		}
	}
	@Override
	public void run() {				//main안에 있으면 main쓰레드	//main밖에 있고, 이름 명명 안했으므로 Thread-0으로 지칭.
		for(int i = 0 ; i < 10 ; i++)
			System.out.println(Thread.currentThread().getName() + "-->" + i);
	}
}
