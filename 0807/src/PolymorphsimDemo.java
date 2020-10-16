import java.util.Scanner;

public class PolymorphsimDemo {
	public static void main(String[] args) {
		do {
			int choice = showMenu();		//리턴받은 번호를 대입
			if(choice == 5) break;
			process(choice);
		}while(true);
	}
	static void process(int choice) {
		Mammal bumo = null;   //지역변수 초기화  //선언 = 부모형
		switch(choice) {
		case 1 :  bumo = new Dog();	break;			//실제 = 자식형
		case 2:   bumo = new Cat();   break;			//실제 = 자식형
		case 3:   bumo = new Korean();	 break;	//실제 = 자식형
		case 4:   bumo = new American();   break;		//실제 = 자식형
		}
		bumo.saySomething();   //부모 주소.자식의 재정의된 메소드 = 다형성.
	}
	static int showMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("<<<<<<Menu>>>>>>>");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. Korean");
		System.out.println("4. American");
		System.out.println("5. Exit");
		System.out.print("당신은 어느 종족이십니까? :");
		int choice = scan.nextInt();
		return choice;
	}
	
	
}
