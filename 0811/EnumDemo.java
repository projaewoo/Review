
public class EnumDemo {
	public static void main(String[] args) {
		//Week week = new Week();		//Enum은 생성자x	//public static이므로 new 사용X
		Week week = Week.WED;
		System.out.println(week);
		
		//int su = (int)week;		//ERROR		//Enum은 강제 형변환x
		int su = week.ordinal();		//Enum Week가 Enum<Week>를 상속받음.	//Enum의 메소드 사용가능
		System.out.println(su);		//week의 서수의 주소를 저장하는 su출력		//서수 : Enum에서 WED의 순서
		
		//출력
		Week [] array = Week.values();		//Week배열 생성
		for(Week w : array) {
			System.out.println(w);			//이름찍기
			System.out.println(", " + w.getValue());		//값 찍기
			System.out.println(", " + w.ordinal());			//서수 찍기 (Week에서 나열형 상수의 순서)
		}
	}
}
