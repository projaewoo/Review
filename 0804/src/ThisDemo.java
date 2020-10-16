
public class ThisDemo {
	public static void main(String[] args) {
		Product ballpen = new Product();
		ballpen.name = "모나미";
		ballpen.price = 200;
		Product pencil = new Product();
//		ballpen.copy(pencil);		//ballpen의 이름, 가격을 pencil에 값 복사
//		System.out.println(pencil.name);
//		System.out.println(pencil.price);
//		ballpen.price = 500;
//		System.out.println(pencil.price);	//값 복사여서 원본 바껴도 복사본 안바뀜
		System.out.println("볼펜의 주소 = " + ballpen);
		pencil = ballpen.copy1();	//주소복사
		System.out.println("연필의 주소 = " + pencil);
		//ballpen과 pencil이 같은 곳 가리킴
		System.out.println(pencil.name);
		System.out.println(pencil.price);
		ballpen.price = 500;
		System.out.println(pencil.price);
	}
}
