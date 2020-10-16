
public class Product {
	String name;
	int price;
	void copy(Product other) {			//값 복사
		other.name = this.name;  //나의 이름을 parameter로 넘어온 other의 이름으로
		other.price = this.price;
	}
	Product copy1() {			//주소 복사
		System.out.println("볼펜의 주소 = " + this);
		return this;		//ballpen의 주소를 반환
	}					
}
