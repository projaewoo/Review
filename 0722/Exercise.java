/*
작성자 : 정재우
작성목적 : 연습문제
작성일시 : 7월 22일
작성환경 : Windows
*/

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		
	//1번 문제 받은 돈과 거스름돈 계산
	int cost, input, rost;
	Scanner scan = new Scanner(System.in);
	System.out.print("상품 금액을 입력하세요 : ");
	cost = scan.nextInt();
	System.out.print("받은 돈을 입력하세요 : ");
	input = scan.nextInt();

	rost = input - cost;
	System.out.printf("거스름돈은 %d원 입니다.\n", rost);



	//2번문제 초 단위 정수 입력받아, 시분초 단위로 환산
	int time, hours, minutes, second;
	System.out.print("시간을 초 단위로 입력하시오 : ");
	time = scan.nextInt();

	hours = time / 3600;
	minutes = (time % 3600) / 60;
	second = time % 60;
	//second = time - (hours * 3600 + minutes * 60);

	System.out.printf("%d초는 %d시간 %d분 %d초 입니다.\n",
								time,    hours, minutes, second);



	//3번문제 상품가격 입력, 각 지폐로 출력, 나머지 금액 표시
	int money, fiftyThous, tenThous, fiveThous, oneThous, penny;
	System.out.print("상품가격을 입력하세요 : ");
	money = scan.nextInt();
	
	fiftyThous = money / 50000;
	tenThous = (money % 50000) / 10000;
	fiveThous = (money % 10000) / 5000;
	oneThous = (money % 5000) / 1000;
	penny = money % (oneThous * 1000);

	System.out.printf("%d원은 5만원권 %d장, 1만원권 %d장, 5천원권 %d장, 1천원권 %d장을 지불하고 %d원이 남습니다.\n",
								money,     fiftyThous,       tenThous,           fiveThous,   oneThous,          penny);
	
	}
}
