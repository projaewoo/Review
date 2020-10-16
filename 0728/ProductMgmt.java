import java.util.Scanner;

public class ProductMgmt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product [] array = new Product[2];
		for(int i = 0; i < array.length; i++) {
			array[i] = new Product();
			System.out.print("제품의 이름 : ");		array[i].name = scan.next();
			System.out.print("제품의 가격 : ");		array[i].price = scan.nextInt();
			System.out.print("제품의 수량 : ");		array[i].quantity = scan.nextInt();
		}
		for(Product p : array) {		//p = array[0]  //주소 복사
			System.out.printf("이름 = %s, 가격 = %d, 수량 = %d%n",
										p.name,  p.price,   p.quantity);
		}
	}
}