/*
 * Thread를 안전하게 stop하는 방법
 * 						( stop() = deprecated로 불안정하므로 사용X)
 * 1. boolean형 변수 이용  --> 단점 : main에서 stop해도 바로 stop한다는 보장X	(시차 발생)
 * 2. Exception 이용  --> try에서 Exception발생하면 무조건 stop  (시차 X)
 */

public class StopThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);			//Thread(Runnable)이므로 Runnable를 구현한 MyThread형 변수를 넣음.
		t.start();
		System.out.println("방금 Thread를 start했습니다.");
		try {					
			Thread.sleep(1000);		//1초동안 쓰레드 멈추게 함.	//1. sleep()이 throws IntteruptedException해서 Exception잡아줘야함	//2. IntterruptedException -> Exception (checked)이므로 try-catch사용.
		} catch (InterruptedException ex) {}
			System.out.println("지금 main이 Thread를 stop하겠습니다.");
			mt.stop();					//1초 뒤에 main이 stop() 호출.
	}
}
class MyThread implements Runnable {
	private boolean isStop = false;
	void stop() {						//main에서 stop()을 콜하면 true됨.
		this.isStop = true;
	}
	@Override
	public void run() {
		while(true) {			//while문이 길면 길수록 main이 stop걸었을때와 시차 길어짐.
			try {
				Thread.sleep(1);		//0.001초마다
			} catch (InterruptedException ex) {}			//1. sleep()이 throws IntteruptedException해서 Exception잡아줘야함	//2. IntterruptedException -> Exception (checked)이므로 try-catch사용.
			System.out.println("I'm alive");				//0.001초마다 출력.
			if(this.isStop)		break;				//1초 뒤에 main이 stop 호출 -> isStop == true -> break;
		}
		System.out.println("I'm dead...");
	}
}
/* main과 Thread-0이 공존.
 * 12행에서 두 쓰레드 동시 시작 -> 27행 run()메소드 시작. & 14행도 동시 실행(main쓰레드 1초 잠들게 함, main쓰레드 1초 뒤에 17, 18행 실행하도록) 
 *  			27행 실행 -> 0.001초마다 살아있다고 출력  &  14행 시행 -> 1초 뒤에 stop하게 함. 
 *  stop()실행 -> 32행 -> 33행 -> 35행 실행.			//시차 발생.	(stop한다고 바로 안끝남)
*/