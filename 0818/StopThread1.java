/*
 * Thread를 안전하게 stop하는 방법
 * 						( stop() 사용 불가)
 *  1. boolean형 변수 이용 --> 단점 : main에서 stop해도 바로 stop한다는 보장X  (시차발생)
 *   2. Exception 이용  --> try에서 Exception발생하면 무조건 stop  (시차X)
 */

public class StopThread1 {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		Thread t = new Thread(mt);				//new Thread(Runnable target)
		t.start();			//두 쓰레드 경합 시작.
		System.out.println("방금 Thread를 start했습니다.");
		try {
			Thread.sleep(1000);		//1초동안 main을 잠들게 함.	(1초동안 main쓰레드 Block상태)
		} catch (InterruptedException ex) {}
		System.out.println("지금 main이 Thread를 stop하겠습니다.");
		t.interrupt();			//1초 뒤에 Thread t를 인터럽트(방해) 걸어버림.
	}
}
class MyThread1 implements Runnable {
	@Override
	public void run() {
		try {
			while(Thread.currentThread().isInterrupted()) {		//현재 쓰레드가 interrupted상태인지 boolean으로 알려줌.	//interrupted 안걸렸다면 
				Thread.sleep(1);		//0.001sec
				System.out.println("I'm alive");
			}
		}catch(InterruptedException ex) {
			System.out.println("I'm dead...");
		}
	}
}