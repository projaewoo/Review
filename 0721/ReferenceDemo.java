/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
/*
	Class
	Object
	Instance
*/
public class ReferenceDemo {
	public static void main(String[] args) {
		Car sonata;		//선언	//Car는 class니까 refernce형
		int age;
		
		age = 24;			//할당
		sonata = new Car();					//생성
		sonata.name = "소나타";				//할당
		sonata.price = 25_000_000;
		sonata.maker = "현대자동차";

		Car carnival = new Car();  //생성
		carnival.name = "카니발";   //할당
		carnival.price = 35_000_000;
		carnival.maker = "기아자동차";

		System.out.printf("이름 = %s, 가격 = %d, 제조사 = %s\n",
									sonata.name,	sonata.price,		sonata.maker);
		System.out.printf("이름 = %s, 가격 = %d, 제조사 = %s\n",
									carnival.name,	carnival.price,		carnival.maker);
	}
}
class Car {
	String name;
	int price;
	String maker;

}