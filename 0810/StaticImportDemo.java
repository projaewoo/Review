import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportDemo {
	public static void main(String[] args) {
		out.println("Hello, Wolrd");
		double rand = random();
		System.out.println(PI);
	}
	static double random() {
		System.out.println("방금 만든 랜덤 메소드");
		return 3.14;
	}
}
