/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class StaticVariableDemo {
	static int age;		//Class Variable, static Variable
	public static void main(String[] args) {
		//int age;   //��������
		/*System.out.println("���� = " + age);
		System.out.println("���� = " + StaticVariableDemo.age);
		StaticVariableDemo svd = new StaticVariableDemo();
		System.out.println("���� = " + svd.age);  */
		
		Product.price = 25_000_000;	//static������ Ŭ���� �̸����� ����
		System.out.println("���� = " + Product.price);
	}
}


class Product {
	static int price;  //Ŭ���� ����  //Ŭ���� �̸����� ����
}