

public class AbstractDemo {
	public static void main(String[] args) {
		//Mammal m = new Mammal();		//추상클래스가 불가. //실체가 없어서
//		Mammal m;  		//선언 : 부모형
//		m = new Lion();	//실제 : 자식형
//		Mammal m1 = new Tiger();	//실제 : 자식형
		//Mammal m = new Mammal();		//추상클래스라서 불가.		//자식에 의해 다형성으로 구현되어야함.
		
//		Mammal lion = new Lion();		//다형성의 강제화.		//다형성 x => Mammal못만듬.
//		//m = lion;			//다형성
//		System.out.println(lion.name);		//상속 : 자식주소로 부모의 자원을 사용
		
//		Lion lion = new Lion("Sally");
//		lion.print();
		
		Mammal m = new Lion("Sally");
		m.print(); 		//부모주소로 자식의 메소드 접근 : 다형성
	}
}
