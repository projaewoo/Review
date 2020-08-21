package com.example.libs;

import java.util.Scanner;

public class Update {
	private Person person;
	private Scanner scan;

	public Update(Person person, Scanner scan) {			//������ ȸ���� main���� parameter�� �޾Ƽ� �� Ŭ�������� ����.
		this.person = person;
		this.scan = scan;
	}
	
	public void modify() {
		System.out.print("�����Ͻ� ��ȭ��ȣ : ");		//���� ����
		String tel = this.scan.nextLine();
		if(tel.length() == 0) 		tel = this.person.getTel();		//��ȭ��ȣ ���� ���Ϸ��� �׳� ���� ħ //���� ��ȭ��ȣ�� ���
		System.out.print("�����Ͻ� �ּ� : ");		//���� ����
		String address = this.scan.nextLine();
		if(address.length() == 0) 		address = this.person.getAddress();
		this.person.setTel(tel);
		this.person.setAddress(address);
		System.out.println("ȸ������ ������ �����ƽ��ϴ�.");
	}
}
