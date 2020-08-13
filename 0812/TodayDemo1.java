import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

//날짜 출력하는 2번째 방법  Calendar이용
public class TodayDemo1 {
	public static void main(String[] args) {
//		Calendar cal = new Calendar();		//추상클래스라 new못씀
//		Calendar cal = new GregorianCalendar(2020, 7, 12);	//선언 : 부모형, 실제 : 자식형	//생성자로 지정 가능.
//		int year = cal.get(Calendar.YEAR);		//static상수
//		int month = cal.get(Calendar.MONTH + 1);
////		int day = cal.get(Calendar.DATE);
//		int day = cal.get(Calendar.DAY_OF_MONTH);	//오늘이 이번달의 몇일?
//		System.out.println("Today is " + year + "년" + month + "월" + day + "일");
		
		//2-2방법
//		Calendar cal = Calendar.getInstance(Locale.KOREA);		//현재 위치에 맞는 날짜 시간
//		int year = cal.get(Calendar.YEAR);		//static상수
//		int month = cal.get(Calendar.MONTH) + 1;
//		int day = cal.get(Calendar.DAY_OF_MONTH);	//오늘이 이번달의 몇일?
//		System.out.println("Today is " + year + "년" + month + "월" + day + "일");
		
		//달력 만들기
		Calendar cal = new GregorianCalendar(2020, 7, 1);		//2020년 8월 1일		//자바 : 0~11월
		int yoil = cal.get(Calendar.DAY_OF_WEEK);		//이번주의 마지막 요일	//일요일 : 1 ~ 7(토요일)
		int lastDay = cal.getActualMaximum(Calendar.DATE);		//일의 가장 큰 값
		System.out.println(yoil);
	}
}
