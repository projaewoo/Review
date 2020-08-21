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
		this.scan.nextLine();						//"Enter"키 날림 (3 (회원 검색) + "Enter" 할때의 그 엔터 날림)
		System.out.println("[ 회원 검색 ]");
		System.out.print(msg + " 회원 이름 : ");
		String name = this.scan.nextLine();		//성과 이름 띄울 수 있어서	
		for(i = 0 ; i < this.list.size(); i++) {
			Person p = this.list.get(i);		//i번째 Person을 p에 넣고
			if(p.getName().equals(name)) {		//p의 이름 = 입력받은 name -> p를 searchPerson에 넣어
				searchPerson = p;		
				break;
			}
		}if(i == this.list.size())		return null;		//검색할 이름 못찾으면
			else return searchPerson;			//검색할 이름 찾으면
	}
	
	
}
