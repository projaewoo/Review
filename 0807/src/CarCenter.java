
public class CarCenter {
	public static void main(String[] args) {
		
		CarCenter cc = new CarCenter();
		Sonata sonata = new Sonata("Siver Sonata");
		cc.repair(sonata);
		Carnival carnival = new Carnival("White Carnival");
		cc.repair(carnival);
		Matiz matiz = new Matiz("Red Matiz");
		cc.repair(matiz);
	}								//Car car로 받음으로써 Car의 자식의 참조변수 다 받을 수 있음
	void repair(Car car) {			//다형성 (Polymorphic Parameter)  //Member메소드  //주소 필요
		//System.out.println(car + "이(가) 잘 수리됐습니다.");
		if(car instanceof Matiz) System.out.println("마티즈 수리 완료");			//출력할때, 각 자식에게 맞게 출력
		else if(car instanceof Sonata) System.out.println("소나타 수리 완료");
		else if(car instanceof Carnival) System.out.println("카니발 수리 완료");
	}
	//Overload : 메소드 이름 같고, parameter다름
//	void repair(Carnival carnival) {			//Member메소드  //주소 필요
//		System.out.println(carnival + "이(가) 잘 수리됐습니다.");
//	}
	
}
