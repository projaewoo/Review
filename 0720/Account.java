/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

import java.util.Scanner;

public class Account {
	public static void main(String[] args) {
		String id, password, name, email;   //����
		Scanner scan = new Scanner(System.in);  //�ʱ�ȭ(����+�Ҵ�)

		System.out.print("ID : ");
		id = scan.nextLine();   //�Ҵ�

		System.out.print("password : ");
		password = scan.nextLine();   //�Ҵ�

		System.out.print("name : ");
		name = scan.nextLine();   //�Ҵ�

		System.out.print("email : ");
		email = scan.nextLine();   //�Ҵ�

		System.out.println("-----------");
		System.out.printf("ID : %s \npassword  : %s \nname : %s \nemail : %s\n", id, password, name, email);
		System.out.println("-----------");
		System.out.println("ID : " + id + "\n" + "password : " + password + "\n" + "name : " + name + "\n" + "Email : " + email);
	}
}
