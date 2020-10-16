
public class ObjectConversion1 {
	public static void main(String[] args) {
//		Bumo bumo;		//선언
//		bumo = new Bumo("한지민");
//		bumo.print();
//		System.out.println(bumo);
//		
//		Jasik jasik = new Jasik("김지민", 24);
//		jasik.print();
//		System.out.println(jasik);
		
		//다형성
		//선언형 : 부모형, 실제형 : 자식형
		Bumo bumo1 = new Bumo("정지민");
		bumo1.print();
		
		Bumo bumo = new Jasik("박지민", 28);	//자식 -> 부모 형변환
		bumo.print();
//		bumo.display();		//다형성 : 부모가 자식의 재정의된 메소드만 사용 가능
	}
}
