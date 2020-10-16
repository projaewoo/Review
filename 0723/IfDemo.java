/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 : ");
		int jumsu = scan.nextInt();
		//유형1 
		//if (jumsu >= 60)   System.out.println("필기 합격입니다.");
		//if(jumsu < 60)       System.out.println("아쉽습니다. 다음 기회에...");

		//유형2
		/*if (jumsu >= 60) {
			System.out.println("축하합니다.");
			System.out.println("필기 합격입니다.");
		} else {			//jumsu < 60
			System.out.println("아쉽습니다.");
			System.out.println("다음 기회에 다시 응시해주세요.");
		}  */

		//유형3
		/*if (jumsu >= 90) {
			System.out.println("축하합니다. 대단합니다.");
			System.out.println("필기 합격입니다.");
		} else if (jumsu >= 60){		//60 <= jumsu < 90이 생략됨
			System.out.println("Good.");
			System.out.println("필기 합격입니다.");
		} else if (jumsu >= 50) {		//50 <= jumsu < 60
			System.out.println("너무 아쉽습니다.");
			System.out.println("다음 기회에 응시해주세요.");
		} else {									//jumsu < 50
			System.out.println("불합격입니다.");
		}  */

		if(jumsu >= 60) {
			System.out.println("합격입니다.");
			if(jumsu >= 90) System.out.println("Wow!!! 대단합니다.");  //60 <= jumsu, 90 <= jumsu
			else System.out.println("Good.");  //60 <= jumsu < 90
		} else {
			System.out.println("불합격입니다.");
			if(jumsu >= 50) System.out.println("정말 아쉽습니다.");	//50 <= jumsu < 60
			else System.out.println("좀 더 분발하세요.");				//jumsu < 50
		}


	}
}