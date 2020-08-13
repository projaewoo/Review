
public class GenericDemo {
	public static void main(String[] args) {
		Demo<Integer> d = new Demo<Integer>(10);		//<>안에 Wrapper클래스만	//20행의 T -> Integer로 변환.
		int su = d.getCount();
		d.setCount(100);
		
		Demo <Double> d1 = new Demo<Double>(89.5);	//Double형으로 제너릭형을 변환	//T -> Double
		double avg = d1.getCount();
		d1.setCount(90.5);
		
		Demo<String> d2 = new Demo<String> ("Hello");	//T -> String			//Number의 자식 중에 String이 없어서 ERROR
		String str = d2.getCount();
		d2.setCount("World");
	}
}
//일반 class 선언
//class Demo {				//정수형으로 된 count만 가지고 있음	= 정수형만 받고, 정수형만 넘겨줌
//	private int count;
//	
//	public Demo(int count) {		//생성자 통해서 member변수 초기화
//		this.count = count;
//	}
//	public int getCount() { return this.count; }
//	public void setCount(int count) { this.count = count; }
//}


//Generic으로 선언,
class Demo <T extends Number>{				//일반화된 Demo(Generic화된 Demo) //<T> : 라벨링	//컴파일 할때, T로 타입 넘어감.		//Number : 상한 = Number의 자식만 받아.
	private T count;			//private Integer count = 10;		-> boxing -> private Integer count = new Integer(10); 
	
	public Demo(T count) {		//생성자 통해서 member변수 초기화
		this.count = count;
	}
	public T getCount() { return this.count; }		//count.intValue()  <- autoUnboxing
	public void setCount(T count) { this.count = count; }
}