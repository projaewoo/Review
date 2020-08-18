
public class OneThread {
	public static void main(String[] args) {
		OneThread ot = new OneThread();
		ot.run();						//run()먼저 돌고, 6행 돌음.		//단일 쓰레드.
		for(int i = 0 ; i < 10 ; i++) System.out.println("main() ==> " + i);
	}
	void run() {			//member메소드
		for(int i = 0 ; i < 10 ; i++) System.out.println("run() ==> " + i);
	}
}
