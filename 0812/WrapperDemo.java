/*
 * wrapping, boxing, packaging
 */

public class WrapperDemo {
	public static void main(String[] args) {
		//auto�� �ƴ� �׳� boxing
//		int su = 5;
//		Integer in = new Integer(su);		//Boxing	//stack�� 5�� heap�� 5�� wrapping�ǰ�, �� heap�� �ּҸ� in�� ����
//		int other = in.intValue();				//UnBoxing
//		
//		double avg = 89.5;
//		Double d = new Double(avg);			//Boxing
//		double another = d.doubleValue();	//UnBoxing
		
		//autoBoxing (Java 1.5~)
		int su = 5;
		Integer in = su + 100;	//Integer in = new Integer(su + 100);	//autoBoxing		//in : �ּҺ���, su : primitive type
					//105�� �ּҸ� in�� ����
		int other = in * 500;		//int other = in.intValue() * 500;		//autoUnBoxing
		
	}
}
