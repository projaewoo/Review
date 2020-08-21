package com.example.libs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner scan;	//member���� : �ּҷ� ����.
	private static final String PATH;		//����������.		//static���
	private ArrayList<Person> list;
	
	static {				//static��� : static��� �ʱ�ȭ
		PATH = "./myaddress.ser";			//�ּҷϰ���������Ʈ ���� ���� //�ּҷϰ���������Ʈ ���� �ؿ� myaddress.ser����.
	}
	
	private Main() {			//������ : member���� �ʱ�ȭ.
		this.scan = new Scanner(System.in);
	}
	
	public static void main(String[] args) {			//main()�� ���� ���� ���۵Ǽ�, ����ȭ ��ü�� �޸𸮿� loading
		Main main = new Main();
		Init init = new Init(PATH);			//main()���ؼ�, �ʱ�ȭ�ϴ� Ŭ����.		//static���� ���ٰ���
		main.list = init.load();
		if(main.list == null)  System.exit(-1);
		
		while(true) {
			int choice = main.showMenu();		//�ּҷ� ����޼ҵ� ȣ��.
			main.process(choice);
			System.out.println();
		}
	}
	
	private int showMenu() {
		System.out.println("[ ȸ�� �ּҷ� ]"); 
		System.out.println("1. ��ü ȸ�� ����"); 
		System.out.println("2. ȸ�� ���� ���"); 
		System.out.println("3. ȸ�� ���� �˻�"); 
		System.out.println("4. ȸ�� ����"); 
		System.out.println("5. ȸ�� ���� ����"); 
		System.out.println("0. ���α׷� ����");
		System.out.print("�޴� ��ȣ ���� >> ");
		return this.scan.nextInt();
	}
	
	private void process(int choice) {
		switch(choice) {
			case 0 : 
				Save save = new Save(this.list, PATH);		//0�� ������ ���. (���ݱ��� �Է��� ArrayList ����)
				save.backup();
				System.out.println("Bye!! Program is over...");
				System.exit(0); 	break; 		//�������� ���α׷� ����
			case 1 :		// 1. ��ü ȸ�� ����
				Output output = new Output(this.list);
				output.output();  break;
			case 2 : 		//2. ȸ�� ���� ���
				Input input = new Input(this.list, this.scan);		//�Է��Ϸ��� scan�Ѱ������.
				input.input();		break;
			case 3 : 		//3. ȸ�� ���� �˻�		//main���� �˻� ��, ����, ���� �� �ʿ�
				this.search("�˻���", 0);  break;
			case 4 : 		//4. ȸ�� ����
				this.search("������", 1);  break;
			case 5 : 		//5. ȸ�� ���� ����
				this.search("������", 2);  break;
		}
	}
	
	private void search(String msg, int flag) {
		Search search = new Search(this.list, this.scan);		//�����˻� (�տ��� ������ �� �˻�)
		Person p = search.linearSearch(msg);		//�˻��ϰ� �� ����� p �Ѹ���
		if(p != null)  {
			if(flag == 0) System.out.println(p);
			if(flag == 1) {
				this.list.remove(p);		//������ ȸ���� ����
				System.out.println("ȸ�� ���� ����");
			}
			if(flag == 2) {
				Update update = new Update(p, this.scan);		//������ ȸ���� ����	
				update.modify();
			}
		}
		else System.out.println("ȸ���� ã�� ���߽��ϴ�. Ȯ�� �� �ٽ� �˻����ּ���.");
	}
	
}
