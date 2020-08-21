package com.example.libs;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
	private ArrayList<Person> list;
	private Scanner scan;
	
	public Search(ArrayList<Person> list, Scanner scan) {
		this.list = list;
		this.scan = scan;
	}
	
	public Person linearSearch(String msg) {
		Person searchPerson = null;
		int i = 0;
		this.scan.nextLine();						//"Enter"Ű ���� (3 (ȸ�� �˻�) + "Enter" �Ҷ��� �� ���� ����)
		System.out.println("[ ȸ�� �˻� ]");
		System.out.print(msg + " ȸ�� �̸� : ");
		String name = this.scan.nextLine();		//���� �̸� ��� �� �־	
		for(i = 0 ; i < this.list.size(); i++) {
			Person p = this.list.get(i);		//i��° Person�� p�� �ְ�
			if(p.getName().equals(name)) {		//p�� �̸� = �Է¹��� name -> p�� searchPerson�� �־�
				searchPerson = p;		
				break;
			}
		}if(i == this.list.size())		return null;		//�˻��� �̸� ��ã����
			else return searchPerson;			//�˻��� �̸� ã����
	}
	
	
}
