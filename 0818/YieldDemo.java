//두 쓰레드가 서로 양보하며 진행.

public class YieldDemo implements Runnable {
	
	public static void main(String[] args) {
		YieldDemo yd1 = new YieldDemo();		Thread t1 = new Thread(yd1, "Sally");
		YieldDemo yd2 = new YieldDemo();		Thread t2 = new Thread(yd2, "Duncan");
		t1.start();
		t2.start();				//Sally, Duncan쓰레드가 run()을 동시에 실행.
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			try {
				Thread.sleep(1000);		//1초 잠자고 난 뒤, 진행		//예를들어 Sally쓰레드 sleep() -> Blocked상태 -> Runnable(대기상태) -> Running.	//Sally가 Runnable상태일때, 우선순위 높은 Duncan이 Running
				System.out.println(Thread.currentThread().getName() + "--> " + i);
			} catch (InterruptedException ex) {}
		}
	}
}
/*16행 : Sally가 sleep()에 의해 Blocked -> Runnable상태되면 Sally는 우선순위 뒤로
 * 			이때 Duncan의 우선순위 > Sally의 우선순위  //따라서 Duncan이 Running.
 * 																		//다시 Duncan이 sleep() -> Blocked -> Runnable상태 되서 Duncan 우선순위 뒤로  
 * 
 */
