@FunctionalInterface
public interface MyInterface {
	int calculate(int a, int b);		//public abstract 생략
//	(int a, int b) -> a * b			//ERROR	//functionalInterface이므로 추상메소드 1개만 가져야함.
}
