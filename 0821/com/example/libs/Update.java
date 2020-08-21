package com.example.libs;

import java.util.Scanner;

public class Update {
	private Person person;
	private Scanner scan;

	public Update(Person person, Scanner scan) {			//수정할 회원을 main에서 parameter로 받아서 이 클래스에서 수정.
		this.person = person;
		this.scan = scan;
	}
	
	public void modify() {
		System.out.print("변경하실 전화번호 : ");		//공백 없음
		String tel = this.scan.nextLine();
		if(tel.length() == 0) 		tel = this.person.getTel();		//전화번호 변경 안하려고 그냥 엔터 침 //이전 전화번호를 덮어씀
		System.out.print("변경하실 주소 : ");		//공백 있음
		String address = this.scan.nextLine();
		if(address.length() == 0) 		address = this.person.getAddress();
		this.person.setTel(tel);
		this.person.setAddress(address);
		System.out.println("회원님의 정보가 수정됐습니다.");
	}
}
