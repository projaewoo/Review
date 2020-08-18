//DeamonThread
//작업관리자에 잡히지 않는 쓰레드
//백그라운드에서 돌아가는 쓰레드

public class DaemonThreadDemo implements Runnable{
	
	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThreadDemo(), "Demo");
		t.setDaemon(true);		//t를 Daemon으로 변형.		//start()하기 전에 Daemon이라고 선언.
		t.start();
		
		//메인쓰레드가 5초 뒤에 종료되도록 설정.
		//데몬쓰레드는 다른쓰레드가 모두 종료되면 자동종료.
		try {
			Thread.sleep(5000);		//5초간 main쓰레드 14행에서 머뭄.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread가 종료됐습니다.");
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("아직 Daemon Thread가 실행중입니다.");
			try {
				Thread.sleep(500);			//0.5초
			} catch (InterruptedException e) {
				break;				//InterruptedException 발생 시, break;
			}
		}
		System.out.println("여전히 Daemon Thread가 작동중입니다.");			//main은 종료됐음에도 불구하고 Daemon쓰레드는 계속 진행중
	}																										//그러나 Daemon쓰레드여서 작업관리자에서 안보임.
	
}
/*10행 start() -> main쓰레드, Demo쓰레드 경합 시작 -> 15행 : main쓰레드 5초 sleep, 27행 : Demo쓰레드 0.5초씩 출력.
 * mian쓰레드 5초 뒤 19행, 20행( main()끝 ) -> main()끝났으므로 Daemon쓰레드인 Demo쓰레드도 끝.
 * 
 */
