import java.io.Serializable;

//직렬화 안되는 객체를 직렬화하면 Exception발생		//Serializable자손이 되면 직렬화 가능
public class Car implements Serializable{
	private String name, maker;				//직렬화 가능
	transient private int price;									//transient : price를 직렬화 대상에서 제외
	
	public Car(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Car [name=%s, maker=%s, price=%s]", name, maker, price);
	}
	
}
