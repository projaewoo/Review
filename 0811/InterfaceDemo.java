import java.util.Arrays;

public class InterfaceDemo {
	public static void main(String[] args) {
		Car [] array = new Car[4];
		array[0] = new Car("소나타", 25_000_000, "현대자동차");		//Object의 배열에 Object의 자식배열이 들어갈 수 있음.
		array[1] = new Car("마티즈", 10_000_000, "대우자동차");
		array[2] = new Car("카니발", 35_000_000, "기아자동차");
		array[3] = new Car("SM6", 30_000_000, "르노삼성자동차");
		Arrays.sort(array);				//sort()사용하려면 Car클래스가 Comparable인터페이스 구현해야함.
		System.out.println(Arrays.toString(array));
	}		//원래 Arrays.sort(Object[] a) : parameter를 Object배열로 받아야함
}			//그러나 Comparable인터페이스 구현한 Car형 array를 parameter로 넣음
			//Car에서 재정의한 compareTo()메소드를 기준으로 Car배열이 이미 sort됨.