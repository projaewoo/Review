
public class SynchronizationDemo {
	public static void main(String[] args) {
		ATM1 atm = new ATM1();
		Thread mother = new Thread(atm, "mother");		//mother��� ������
		Thread son = new Thread(atm, "son");		//son�̶�� ������
		son.start();
		mother.start();
		
	}
}
