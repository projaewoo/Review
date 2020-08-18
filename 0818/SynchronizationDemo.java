
public class SynchronizationDemo {
	public static void main(String[] args) {
		ATM1 atm = new ATM1();
		Thread mother = new Thread(atm, "mother");		//mother라는 쓰레드
		Thread son = new Thread(atm, "son");		//son이라는 쓰레드
		son.start();
		mother.start();
		
	}
}
