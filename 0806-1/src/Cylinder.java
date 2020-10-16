
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {}
	public Cylinder(double radius) {
		super(radius);			//�θ𿡰� �Ѱ���
	}
	public Cylinder(double radius, double height) {
		super(radius);			//�θ𿡰� �Ѱ���
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
		return String.format("Cylinder [������ = %.1f, ���� = %.1f , ������ = %.1f, ���� = %.1f]",
						         	this.getRadius(),   this.height,    this.getArea(),       this.getVolume());
	}
	
	
}
