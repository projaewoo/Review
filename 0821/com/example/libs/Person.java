package com.example.libs;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable{							//Serializable : ��ü�� ����ȭ �����ϰ��ϴ� flag interface.
	private int number;							//primitive type : ����ȭ ����.
	private String name, tel, address;
	
	public Person() {}			//�⺻������

	public Person(int number, String name, String tel, String address) {		//����� ���� ������.
		this.number = number;
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Person [��ȣ=%s, �̸�=%s, ��ȭ��ȣ=%s, �ּ�=%s]",
					number, name, tel, address);
	}
	
}
