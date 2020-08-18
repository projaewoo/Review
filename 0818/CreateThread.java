/*
 * Thread 생성 방법 2가지
 * 1. Thread extends
 * 2. Runnable implements
 */

public class CreateThread extends Thread {
	CreateThread(String name) {		//생성자 만듬.
		super(name);						//부모인 Thread의 생성자에게 name넘김.
	}
	
	public static void main(String[] args) {
		CreateThread ct1 = new CreateThread("Sally");
		CreateThread ct2 = new CreateThread("Duncan");
		ct1.start();
		ct2.start();			//Runnable상태	(환자 2명이 치과 앞에서 대기상태)
	}
	@Override
	public void run() {					//OS의 Scheduler가 Runnable를 Running로.	//치과 진료.
		for(int i = 0 ; i < 10 ; i++)		//OS의 Scheduler가 돌리는 run()메소드를 재정의.	////start() : Runnable상태로	// Runnable -> OS의 Scheduler -> Running상태 (이떄 run()실행. )
			System.out.println(Thread.currentThread().getName() + " ==> " + i);
	}
}
