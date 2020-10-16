/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class StaticVariableDemo {
	static int age;		//Class Variable, static Variable
	public static void main(String[] args) {
		//int age;   //지역변수
		/*System.out.println("나이 = " + age);
		System.out.println("나이 = " + StaticVariableDemo.age);
		StaticVariableDemo svd = new StaticVariableDemo();
		System.out.println("나이 = " + svd.age);  */
		
		Product.price = 25_000_000;	//static변수는 클래스 이름으로 접근
		System.out.println("가격 = " + Product.price);
	}
}


class Product {
	static int price;  //클래스 변수  //클래스 이름으로 접근
}