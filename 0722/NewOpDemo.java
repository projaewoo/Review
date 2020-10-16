/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

import java.util.Scanner;

public class NewOpDemo {
	public static void main(String[] args) {
		Scanner scan = null;		//선언, 참조형의 초기화, 지역변수이자 참조변수
		scan = new Scanner(System.in);
		scan = new Scanner(new File());
		String irum = null;
		irum = new String("한지민");		//굳이 new String()안써도 됨
		System.out.printf("이름 = %s\n", irum);

		irum = new String("김지민");
		System.out.printf("이름 = %s\n", irum);

		irum = "한";		//new String("한");
		irum = irum + "지민";			//irum + new String("지민"); => new String("한" + "지민"); 새로 주소를 만듬
	}
}
