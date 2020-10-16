
public class InheritanceDemo {
	public static void main(String[] args) {
//		Car car = new Car(100, 25_000_000, "Sonate");
		Car car = new Car(100, 25_000_000);
		Car.name = "Sonata";
//		car.speed = 100;
//		car.price = 25_000_000;
//		car.name = "Sonate";
		car.run();
		
//		SportsCar sc = new SportsCar();
//		sc.speed = 200;
//		sc.price = 250_000_000;
//		sc.name = "其扼府";
//		sc.turbo = true;
//		sc.run();
		Car.name = "其扼府";
	}
}
