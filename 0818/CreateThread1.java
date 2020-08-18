/*
 * Thread 생성 방법 2가지
 * 1. Thread extends
 * 2. Runnable implements
 */

public class CreateThread1 implements Runnable {
	
	public static void main(String[] args) {
		CreateThread1 ct1 = new CreateThread1();
		CreateThread1 ct2 = new CreateThread1();	
		Thread t1 = new Thread(ct1, "Sally");			//Runnable : 인터페이스이므로 new 못함	//Thread -> Runnable이므로 자식클래스인 Thread로 구현. 
		Thread t2 = new Thread(ct2, "Duncan");		//스스로 start() 못하므로 Thread 통해서 start()
		t1.start();
		t2.start();				//Thread의 start().		//두 쓰레드의 경합 시작.
	}
	@Override
	public void run() {		//OS의 Scheduler가 Runnable를 Running으로.		//치과 진료.
		for(int i = 0 ; i < 10 ; i++)			//OS의 Scheduler가 돌리는 run()메소드를 재정의.	//start() : Runnable상태.	//Runnable -> OS의 Scheduler -> Running상태 ( 이때 run()실행. )
			System.out.println(Thread.currentThread().getName() + " ==> " + i);
	}
	
}
