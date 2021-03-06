/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;

public class Calender {
	public static void main(String[] args) {
		/*int year, month, day, total, count = 0;
			System.out.print("Year : " );	year = scan.nextInt();
			System.out.print("Month : " );	month = scan.nextInt();
			System.out.print("Day : " );	day = scan.nextInt();
			
			for(int i = 1 ; i < year ; i++) {
				for(int j = 1 ; j < year ; j++) {
					if(j % 4 == 0 && j % 100 ==0 || j % 400 == 0)	count++;
										
				}
				
			}
			
			total = ( (year - count) * 365 + (count) * 366 ) +
						(                                     ) +
					   day * (); */
			
		Scanner scan = new Scanner(System.in);
		System.out.print("년 월 : ");
		String yearStr = scan.next();		
		int year = Integer.parseInt(yearStr);		//"2020" --> 2020

		String monthStr = scan. next();			//"7"
		int month = Integer.parseInt(monthStr);

		//String dayStr = scan. next();				//"27"
		int day = 1;  //달력은 매월 1일 기준

		//서기 1년부터 year - 1년까지 총 날수
		int total = 0;
		for(int i = 1 ; i < year ; i++) {
			if(i % 400 == 0 || (i % 4 ==0 && i % 100 != 0)) total += 366;
			else total += 365;
		}		//2019년 12월 31일까지 다 더함

		

		//올해 1월부터 6월까지의 합 //2월 이전의 날짜는 윤년에 영향 안받음
		int [] array;	//선언
		if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)) {
			//올해가 윤년이라면
			array = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//생성 및 할당
		}else {
			//올해가 윤년이 아니라면
			array = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
		} 
	
		for(int i = 0 ; i < month - 1 ; i++) {		//배열 상에서 0월~5월 = 실제로 1월 ~ 6월
			total += array[i];
		}  //2020년 6월 30일까지 날짜 구함

		//이번달 더하기
		total += day;
		//System.out.println("total = " + total);
		int space = total % 7;			//앞에 몇칸 띄어아하는지
		int maxDay = array[month-1];					//7월은 몇일까지?
		//System.out.println("공백 = " + space + ", 마지막 날은 = " + maxDay);
		/*switch(total % 7) {			//요일 구하기
			case 0 : System.out.println("일요일입니다."); break;
			case 1 : System.out.println("월요일입니다."); break;
			case 2 : System.out.println("화요일입니다."); break;
			case 3 : System.out.println("수요일입니다."); break;
			case 4 : System.out.println("목요일입니다."); break;
			case 5 : System.out.println("금요일입니다."); break;
			default :  System.out.println("토요일입니다."); break;
		} */
		System.out.println("              #### " + year + "년 " + month + "월 ####");
		System.out.println("日\t月\t火\t水\t木\t金\t土");
		System.out.println("-----------------------------------------------------");
		//달력 첫째줄 공백처리
		int count = 0;
		for(int i = 0 ; i < space ; i++) {
			System.out.print("★\t");  count++;
		}
		//1일부터 마지막 날까지 출력
		for(int i = 1 ; i <= maxDay ; i++) {
			System.out.print(i + "\t");
			count++;
			if(count % 7 ==0) {
				System.out.println();
				count = 0;
			}
		}
		//마지막 줄 처리
		if(count != 0) {   //달의 마지막 날이 토요일이면 밑에 7개의 동그라미 찍어서
			for(int i = 0; i < (7 - count) ; i++) {
				System.out.print("●\t");
			}	
		}
		
	}
}