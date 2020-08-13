
public class Carnival extends Car implements Comparable<Carnival>{
	private String maker;

	public Carnival(String name, int price, String maker) {
		super(name, price);
		this.maker = maker;
	}

	@Override
	public int compareTo(Carnival other) {
		return (this.getPrice() > other.getPrice()) ? -1 :			//�������� 1	//�������� -1 
								(this.getPrice() < other.getPrice()) ? 1 : 0;		//�������� -1	//�������� 1
	}
	
}
