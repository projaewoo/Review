
public class JoinDemo {
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {   
			//익명 클래스 : 기존의 클래스 재정의
			@Override
			public void run() {
				try {
					Thread.sleep(10000);		//t1쓰레드 여기서 10초간 sleep.	//sleep 사용 : main은 1초뒤에 끝나고, t1 쓰레드는 10초 뒤에 끝남.
				}catch(InterruptedException ex) {}									//sleep 사용 : main과 t1쓰레드 모두 끝나야 프로그램 종료.
				System.out.println("thread 끝.");
			}
		};
		t1.start();
		
		try {
			//join사용 : t1쓰레드에게 우선권 부여해서 t1쓰레드 끝날때까지 기다림.
			t1.join();					//진행중인 쓰레드(t1 thread)가 끝날때까지 무작정 대기
		}catch(InterruptedException ex) {}
		System.out.println("main thread 끝.");
		
	}
}
