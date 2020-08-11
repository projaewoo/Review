
public interface Datable {
	//private int kor;			//interface에 변수 X
//	private int KOR = 100;	//private변수 X
//	protected int KOR = 100;		//변수 자체 X
//	public int KOR = 100;		//public변수 가능. 사실 static이 생략되어 있음.
//	static int ENG = 100;
	//int MATH = 90;
	
	int SUN = 0, MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6;	//public static final이 생략되어있음
	//public abstract void print();	//추상메소드		//interface안의 메소드는 다 추상메소드이므로 abstract생략가능
	void set(int date);		//public abstract메소드
	int get();						//public abstract메소드
}
