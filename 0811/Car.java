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
	//Comparable인터페이스 구현했으므로 Override필요
	@Override
	public int compareTo(Car other) {		//Sort의 기준을 정하는 메소드
		if(this.price > other.price) return 1;			//오름차순 1 //내림차순 -1
		else if(this.price < other.price) return -1;		//오름차순 -1 	//내림차순 1
		else return 0;
	}
	
	
	
}
