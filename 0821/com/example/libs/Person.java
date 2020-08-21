package com.example.libs;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable{							//Serializable : 객체가 직렬화 가능하게하는 flag interface.
	private int number;							//primitive type : 직렬화 가능.
	private String name, tel, address;
	
	public Person() {}			//기본생성자

	public Person(int number, String name, String tel, String address) {		//사용자 지정 생성자.
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
		return String.format("Person [번호=%s, 이름=%s, 전화번호=%s, 주소=%s]",
					number, name, tel, address);
	}
	
}
