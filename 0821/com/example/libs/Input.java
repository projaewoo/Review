package com.example.libs;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	private ArrayList<Person> list;			//main()에서 넘어오는 parameter를 member변수로 받아야함.
	private Scanner scan;
	
	public Input(ArrayList<Person> list, Scanner scan) {		//main에서 만든 list, scan을 받아옴.
		this.list = list;
		this.scan = scan;
	}
	
	public void input() {
		System.out.print("회원 번호 : ");		
		int number = this.scan.nextInt();
		this.scan.nextLine();			//(회원번호) "2" + "Enter"입력하므로 Enter를 18행으로 날림. 
		System.out.print("이름 : ");			
		String name = this.scan.nextLine();		//이름 입력 시, 성과 이름 띄울 수 있으므로 line으로 받음	//nextLine() :  "Enter"까지 다 먹음  
		System.out.print("전화번호 : ");
		String tel = this.scan.next();
		this.scan.nextLine();			//Enter날림.
		System.out.print("주소 : ");
		String address = this.scan.nextLine();
		Person p = new Person(number, name, tel, address);
		this.list.add(p);
	}
	
}
