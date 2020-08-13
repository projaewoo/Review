
import java.util.Date;
import java.util.Hashtable;

//현재 날짜 찍는 방법
public class TodayDemo {
	public static void main(String[] args) {
		//1. Date클래스 이용
		//단점 : 미국식 표현
		Date now = new Date();
//		System.out.println(now);		//now.toString()
//		System.out.println(now.getYear());		//줄 그어짐 : deflication : 이전 버전의 방식
																	//자바 연도 읽는 방법 : 1970년부터, 1900년부터
//		System.out.println(now.getMonth());	//자바 월 읽는 방법 : 0월부터 계산. (0~11월)
		//한국식 표현
		String [] array = now.toString().split("\\s+");	//"Wed Aug 12 17:11:34 KST 2020"를 스페이스바 기준으로 짤라
		System.out.println("Today is " + array[5] + "년" + getMonth(array[1]) + "월" + array[2] + "일입니다.");	
	}																					//Aug월 -> 8월
	//Aug월을 8월로
	//프로그램상에서 DateBase사용하는 방법 : Hashtable
	static int getMonth(String month) {
		Hashtable ht = new Hashtable();		//DB 만듬
		ht.put("Jan", 1);	ht.put("Feb", 2);	ht.put("Mar", 3);
		ht.put("Apr", 4);	ht.put("May", 5);	ht.put("Jun", 6);
		ht.put("Jul", 7);		ht.put("Aug", 8);	ht.put("Sep", 9);
		ht.put("Oct", 10);	ht.put("Nov", 11);	ht.put("Dec", 12);
		return (Integer)ht.get(month);			//"Aug"에 해당하는 숫자를 찾아줌.		//Integer가 autoUnBoxing되서 int로 형변환됨.
	}
	
	
}
