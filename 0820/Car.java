import java.io.Serializable;

//����ȭ �ȵǴ� ��ü�� ����ȭ�ϸ� Exception�߻�		//Serializable�ڼ��� �Ǹ� ����ȭ ����
public class Car implements Serializable{
	private String name, maker;				//����ȭ ����
	transient private int price;									//transient : price�� ����ȭ ��󿡼� ����
	
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
