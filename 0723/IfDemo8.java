/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class IfDemo8 {
	public static void main(String[] args) {
		/*double avg = 89.12345678;			//소수점 둘째자리에서 반올림하는 방법
		avg *= 10;		//891.2345678
		double result = Math.round(avg);  //891 //round가 소수점 첫째자리에서 반올림해서
		result /= 10;
		System.out.println("result = " + result);
	} */

		double avg = 89.123;			//소수점 셋째자리에서 반올림하는 방법
		avg *= 100;						//8912.3
		double result = Math.round(avg);	//8912 //round가 소수점 첫째자리에서 반올림
		result /= 100;						//89.12
		System.out.println("result = " + result);
}
}