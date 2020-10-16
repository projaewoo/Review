
public class Car {
	private String maker, name, color;
	private int price;		//member variable //자동 초기화
	public void print() {
		System.out.printf("maker = %s, name = %s, price = %,d, color = %s%n",
										maker, name, price, color);
	}
}
