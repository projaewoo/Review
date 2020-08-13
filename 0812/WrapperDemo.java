/*
 * wrapping, boxing, packaging
 */

public class WrapperDemo {
	public static void main(String[] args) {
		//auto가 아닌 그냥 boxing
//		int su = 5;
//		Integer in = new Integer(su);		//Boxing	//stack의 5가 heap의 5로 wrapping되고, 그 heap의 주소를 in이 저장
//		int other = in.intValue();				//UnBoxing
//		
//		double avg = 89.5;
//		Double d = new Double(avg);			//Boxing
//		double another = d.doubleValue();	//UnBoxing
		
		//autoBoxing (Java 1.5~)
		int su = 5;
		Integer in = su + 100;	//Integer in = new Integer(su + 100);	//autoBoxing		//in : 주소변수, su : primitive type
					//105의 주소를 in이 참조
		int other = in * 500;		//int other = in.intValue() * 500;		//autoUnBoxing
		
	}
}
