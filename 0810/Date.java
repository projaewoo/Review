

public class Date implements Datable {
	private int date;
	@Override
	public void set(int date) {
		this.date = date;
	}
	@Override
	public int get() {
		return this.date;
	}

}
