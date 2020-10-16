
public class EncapDemo {
	public static void main(String[] args) {
		Car1 sonata = new Car1();
		//sonata.name = "소나타";  //private변수여서 다른 클래스에서 접근 불가
		sonata.setName("소나타");
		//String name = sonata.name;	//private변수여서 다른 클래스에서 접근 불가
		String name = sonata.getName();	//public 메소드로 private변수 접근
	}
}
