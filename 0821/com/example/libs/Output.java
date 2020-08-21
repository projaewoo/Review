package com.example.libs;

import java.util.ArrayList;

public class Output {
	private ArrayList<Person> list;

	public Output(ArrayList<Person> list) {
		this.list = list;
	}
	
	public void output() {
		if(this.list != null && this.list.size() > 0) {		//�����Ͱ� ������
			System.out.println("[ ��ü ȸ�� ��� ]");
			for(Person p : this.list)  System.out.println(p);		//p.toString();
		}else {
			System.out.println("No Data");
		}
	}
}
