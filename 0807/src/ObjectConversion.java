/*
* Conversion / Cast
*/
public class ObjectConversion {
	public static void main(String[] args) {
//		Object obj = new Object();		//�θ�
//		String str = new String();			//�ڽ�
//		obj = str;		//�ڵ� ����ȯ
		Object obj;		//�θ��� ����
		obj = new String();  	//�ڽ� ����,  obj = str		//�ڵ� ����ȯ
		if(obj instanceof String) System.out.println("true");
		else System.out.println("false");
//		Test test = new Test();
//		Demo demo = new Demo();
//		//test = (Test)demo;
//		if(test instanceof Demo) {
//			demo = (Demo)test;
//		}else {
//			System.out.println("����ȯ �ȵ˴ϴ�.");
//		}
//		
	}
}
class Test{}
class Demo extends Test{}