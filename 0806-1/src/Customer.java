
public class Customer extends Person{
	private String id;
	private int mileage;
	
	public Customer(String name, String address, String phoneNumber, String id, int mileage) {
		super(name, address, phoneNumber);
		this.id = id;
		this.mileage = mileage;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return String.format("����ȣ : %s, �� ���ϸ��� : %s, toString()=%s]",
									id, mileage, super.toString());
	}
	
	
}
