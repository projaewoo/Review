/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Scanner;

public class LcmGcm {
	public static void main(String[] args) {
		String str1, str2;
		int gcm = 0, lcm = 0, num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");	str1 = scan.nextLine();		//"32"
		System.out.print("두번째 정수 : ");	str2 = scan.nextLine();		//"24"
		num1 = Integer.parseInt(str1/*, 10*/);		//10진수 숫자로
		num2 = Integer.parseInt(str2);				//입력받은 숫자는 10진수로 본다.
		/*
			A = aG,  B = bG,  Gcm = 8,  Lcm = 4 * 3 * 8
			LCM = a * b * G
		*/
		for(int i = 2 ; i < num1 ; i++) {
			if(num1 % i == 0 && num2 % i ==0) gcm = i;
		}
		lcm = num1 / gcm * num2 / gcm * gcm;
		System.out.printf("%d와 %d의 GCM은 %d, LCM은 %d입니다.",
									num1, num2,         gcm,           lcm);
	}
}