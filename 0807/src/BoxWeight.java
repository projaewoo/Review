
public class BoxWeight extends Box {
	private int weight;

	public BoxWeight(int lengh, int width, int height, int weight) {
		super(lengh, width, height);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString() + "BoxWeight [weight=" + weight + "]";
	}
	
	
}
