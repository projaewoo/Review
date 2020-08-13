import java.text.SimpleDateFormat;
import java.util.Date;

/* 날짜 찍는 방법 6가지
  	1. java.util.Date class
 	2. java.util.Calendar class
 	3. java.util.Calendar & java.util.GregorianCalendar
  	4. java.text.DateFormat & java.util.Date class
 		//날짜를 형식화할 수 있는 format
	5. java.text.SimpleDateFormat & java.util.Date class
		//DateFromat의 자식 클래스
	6. printf(String.format())  --> java.util.Formatter class	(모든 format은 여기에 속함)
*/
public class TodayDemo {
	public static void main(String[] args) {
		//4번째 방법
//		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,				//추상클래스라 new 못씀
//																						DateFormat.FULL, Locale.KOREA);
//		System.out.println(df.format(new Date()));
		
		//5번째 방법
//		String pattern = "지금은 GG yyyy년 MM월 dd일 aa hh시 mm분 ss초입니다.";		//미리 pattern만들어놓음.	//나중에 SimpleDateFormat이 인식
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);	//생성자의 pattern넣음
//		System.out.println(sdf.format(new Date()));
		
		//6번째 방법
//		System.out.printf("Today is %1$tY년 %1$tm월 %1$td일.", new Date());	//1$ : 첫번째 대상으로 다 출력 (new Date()로 출력)
//													//첫번째 대상으로 0000년, 첫번째 대상으로 00월, 첫번째 대상으로 00일 출력
		//6-1번째 방법
		String now = String.format("Today is %1$tY년 %1$tm월 %1$td일.", new Date());
		System.out.println(now);
	}
}
