
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		//Sonata [] array = new Sonata[2];
		//Heterogeneous Collection
//		Car [] array = new Car[3];
//		array[0] = new Sonata("Black Sonata");
//		array[1] = new Matiz("Silver Matiz");
//		array[2] = new Carnival("White Carnival");
		
		//각 자식의 클래스는 부모의 배열로 묶을 수 있음
//		Car [] array = {new Sonata("Black Sonata"), new Matiz("Silver Matiz"),
//				new Carnival("White Carnival")};
//		for(Car car : array) System.out.println(car);		//car.toString()
//		
//		Mammal [] array1 = new Mammal[4];
//		array1[0] = new Dog();
//		array1[1] = new Cat();
//		array1[2] = new Korean();
//		array1[3] = new American();
//		//서로 타입이 달라도 부모님의 배열로 묶을 수 있음
		
		//Object배열 = Collection   //모든 자식 객체 넣을 수 있음   //넣을 때는 편하나, 뽑을 때 문제 있음
		Object [] array = new Object[3];
		array[0] = new String("Hello");
		array[1] = new Sonata("Black Sonata");
		array[2] = new Dog();
		
		
		}
	}

