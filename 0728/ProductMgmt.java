import java.util.Scanner;

public class ProductMgmt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product [] array = new Product[2];
		for(int i = 0; i < array.length; i++) {
			array[i] = new Product();
			System.out.print("��ǰ�� �̸� : ");		array[i].name = scan.next();
			System.out.print("��ǰ�� ���� : ");		array[i].price = scan.nextInt();
			System.out.print("��ǰ�� ���� : ");		array[i].quantity = scan.nextInt();
		}
		for(Product p : array) {		//p = array[0]  //�ּ� ����
			System.out.printf("�̸� = %s, ���� = %d, ���� = %d%n",
										p.name,  p.price,   p.quantity);
		}
	}
}