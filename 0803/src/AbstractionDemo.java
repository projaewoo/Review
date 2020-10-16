
public class AbstractionDemo {
	public static void main(String[] args) {
		Car sonata; //선언
		sonata = new Car();		//sonata는 자동차가 heap에 저장되는 시작주소를 가짐. 자동차 주소 만듬
		sonata.name = "소나타";
		sonata.maker = "현대자동차";
		sonata.color = "Silver";
		sonata.price = 25_000_000;
		//sonata 참조변수 통해 field 접근
		sonata.print();
		
		Car carnival;		//선언
		carnival = new Car();
		carnival.name = "카니발";
		carnival.maker = "기아자동차";
		carnival.color = "Black";
		carnival.price = 35_000_000;		//carnival의 속성
		carnival.print();   //carnival의 기능
		
	}
}
