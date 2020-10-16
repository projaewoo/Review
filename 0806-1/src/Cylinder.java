
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {}
	public Cylinder(double radius) {
		super(radius);			//부모에게 넘겨줌
	}
	public Cylinder(double radius, double height) {
		super(radius);			//부모에게 넘겨줌
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return getArea() * height;
	}
	@Override
	public String toString() {
		return String.format("Cylinder [반지름 = %.1f, 높이 = %.1f , 원넓이 = %.1f, 부피 = %.1f]",
						         	this.getRadius(),   this.height,    this.getArea(),       this.getVolume());
	}
	
	
}
