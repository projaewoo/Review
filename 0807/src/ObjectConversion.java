/*
* Conversion / Cast
*/
public class ObjectConversion {
	public static void main(String[] args) {
//		Object obj = new Object();		//부모
//		String str = new String();			//자식
//		obj = str;		//자동 형변환
		Object obj;		//부모형 선언
		obj = new String();  	//자식 생성,  obj = str		//자동 형변환
		if(obj instanceof String) System.out.println("true");
		else System.out.println("false");
//		Test test = new Test();
//		Demo demo = new Demo();
//		//test = (Test)demo;
//		if(test instanceof Demo) {
//			demo = (Demo)test;
//		}else {
//			System.out.println("형변환 안됩니다.");
//		}
//		
	}
}
class Test{}
class Demo extends Test{}