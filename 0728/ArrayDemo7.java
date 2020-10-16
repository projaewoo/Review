/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ArrayDemo7 {
	public static void main(String[] args) {
		//int [] array = null;    //선언
		Car [] array = null;   //선언 //주소여서 null
		array = new Car[2];   //생성

		array[0] = new Car();
		array[0].name = "Sonata";
		array[0].maker = "Hyundai";
		array[0].price = 25_000_000;

		array[1] = new Car();	//Car생성, Car멤버변수 생성
		array[1].name = "Carnival";
		array[1].maker = "KIA";
		array[1].price = 30_000_000;

		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s, %s, %d\n",
						array[i].name, array[i].maker, array[i].price);
		}

	}
}
