import java.util.Calendar;
import java.util.GregorianCalendar;

public class AbstractDemo1 {
	public static void main(String[] args) {
		//Calendar now = new Calendar();		//추상클래스여서 new 못씀	//자식클래스로 추상클래스를 생성.
		Calendar now = new GregorianCalendar();		//선언 : 부모형, 실제 : 자식형
	}
}
