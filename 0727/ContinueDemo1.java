/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Scanner;

public class ContinueDemo1 {
	public static void main(String[] args) {
		String system_password = "1234";
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a password : ");
		String user_password = scan.nextLine();
		int i = 0;
		for( ; i < 4 ; i++) {
			if(system_password.charAt(i) == user_password.charAt(i))
				continue;		//같으면 계속 진행
			else break;		//다르면 벗어나기
		}
		if(i == 4) System.out.println("Login Success");
		else System.out.println("Login Failure");
	}
}
