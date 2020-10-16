
public class ConstructorDemo1 {
	public static void main(String[] args) {
		Calender today = new Calender();		//컴파일러가 기본 생성자 만들어줌
		System.out.println("year = " + today.year);		//기본 생성자 재정의 안하면 int를 0으로 초기화
		Calender nextYear = new Calender(2021, 8, 4);
		System.out.println("year = " + nextYear.year);
	}
}
class Calender {
	int year, month, day;
	public Calender() {			//default constructor's overriding(재정의)
		this.year = 2020;   this.month = 8;   this.day = 4;
	}
	public Calender(int year, int month, int day) {		//method overloading //parameter만 다르면 됨	
		this.year = year;  this.month = month;   this.day = day;
	}
}
