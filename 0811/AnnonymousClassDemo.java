

public class AnnonymousClassDemo {
	public static void main(String[] args) {
		
		Product keyboard = new Product("키보드", 20000) {
			@Override						//Product클래스에서의 print()메소드를 재정의
			public void print() {
				System.out.println("Hello, World");
			}
		};
		keyboard.print();
		System.out.println(keyboard.getName());
	}
}
class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println("name = " + this.name + ", price =" + this.price);
	}
}