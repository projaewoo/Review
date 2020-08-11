public class Car implements Comparable<Car>{
	private String name, maker;
	private int price;
	public Car(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}
	//Comparable�������̽� ���������Ƿ� Override�ʿ�
	@Override
	public int compareTo(Car other) {		//Sort�� ������ ���ϴ� �޼ҵ�
		if(this.price > other.price) return 1;			//�������� 1 //�������� -1
		else if(this.price < other.price) return -1;		//�������� -1 	//�������� 1
		else return 0;
	}
	
	
	
}
