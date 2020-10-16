
public class Box {
	private int length, width, height;

	public Box(int lengh, int width, int height) {
		this.length = lengh;
		this.width = width;
		this.height = height;
	}
	
	public int getVolume() {
		return length * width * height;
	}
	
	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	
}
