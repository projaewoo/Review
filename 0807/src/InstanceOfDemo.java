
public class InstanceOfDemo {
	public static void main(String[] args) {
		Mammal m = new Mammal();			//부모형
		Korean ko = new Korean();				//자식형
		//"한국인은 포유류이다."			//Korean extends(is a) Mammal.
		//m = (Mammal)ko;		//자식이 부모형으로 변환하는 것은 무조건 성공	//is a 관계 = extends
		//"포유류는 한국인이다."			
		//ko = m;				//부모 -> 자식 형변환 x
		//ko = (Korean)m;		//부모 -> 자식 강제 형변환 : 7행 있으면 컴파일 오류 x
										//개 -> 포유류 -> 개 : 컴파일 오류 X
										//    7행          10행
										//개 -> 포유류 -> 고양이 : 불가능
		Object obj = new Object();	//부모
		String str = new String();   //자식
		//str = (String)obj;			//자식 -> 부모 과정 없이 부모 -> 자식만의 과정은 컴파일 오류
		
		obj = str;							//자식 -> 부모
//		str = (String)obj;							//부모 -> 자식    : 18행의 과정이 있어서 컴파일 오류
		if(obj instanceof String)		//obj는 String으로 형변환 가능?
			System.out.println("형변환 가능");
		else System.out.println("형변환 불가능");
	}
}
