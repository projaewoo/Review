import java.util.Scanner;

public class PolymorphsimDemo {
	public static void main(String[] args) {
		do {
			int choice = showMenu();		//���Ϲ��� ��ȣ�� ����
			if(choice == 5) break;
			process(choice);
		}while(true);
	}
	static void process(int choice) {
		Mammal bumo = null;   //�������� �ʱ�ȭ  //���� = �θ���
		switch(choice) {
		case 1 :  bumo = new Dog();	break;			//���� = �ڽ���
		case 2:   bumo = new Cat();   break;			//���� = �ڽ���
		case 3:   bumo = new Korean();	 break;	//���� = �ڽ���
		case 4:   bumo = new American();   break;		//���� = �ڽ���
		}
		bumo.saySomething();   //�θ� �ּ�.�ڽ��� �����ǵ� �޼ҵ� = ������.
	}
	static int showMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("<<<<<<Menu>>>>>>>");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. Korean");
		System.out.println("4. American");
		System.out.println("5. Exit");
		System.out.print("����� ��� �����̽ʴϱ�? :");
		int choice = scan.nextInt();
		return choice;
	}
	
	
}
