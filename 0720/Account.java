/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;

public class Account {
	public static void main(String[] args) {
		String id, password, name, email;   //선언
		Scanner scan = new Scanner(System.in);  //초기화(선언+할당)

		System.out.print("ID : ");
		id = scan.nextLine();   //할당

		System.out.print("password : ");
		password = scan.nextLine();   //할당

		System.out.print("name : ");
		name = scan.nextLine();   //할당

		System.out.print("email : ");
		email = scan.nextLine();   //할당

		System.out.println("-----------");
		System.out.printf("ID : %s \npassword  : %s \nname : %s \nemail : %s\n", id, password, name, email);
		System.out.println("-----------");
		System.out.println("ID : " + id + "\n" + "password : " + password + "\n" + "name : " + name + "\n" + "Email : " + email);
	}
}
