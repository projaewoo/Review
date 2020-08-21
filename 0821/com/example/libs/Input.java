package com.example.libs;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	private ArrayList<Person> list;			//main()���� �Ѿ���� parameter�� member������ �޾ƾ���.
	private Scanner scan;
	
	public Input(ArrayList<Person> list, Scanner scan) {		//main���� ���� list, scan�� �޾ƿ�.
		this.list = list;
		this.scan = scan;
	}
	
	public void input() {
		System.out.print("ȸ�� ��ȣ : ");		
		int number = this.scan.nextInt();
		this.scan.nextLine();			//(ȸ����ȣ) "2" + "Enter"�Է��ϹǷ� Enter�� 18������ ����. 
		System.out.print("�̸� : ");			
		String name = this.scan.nextLine();		//�̸� �Է� ��, ���� �̸� ��� �� �����Ƿ� line���� ����	//nextLine() :  "Enter"���� �� ����  
		System.out.print("��ȭ��ȣ : ");
		String tel = this.scan.next();
		this.scan.nextLine();			//Enter����.
		System.out.print("�ּ� : ");
		String address = this.scan.nextLine();
		Person p = new Person(number, name, tel, address);
		this.list.add(p);
	}
	
}
