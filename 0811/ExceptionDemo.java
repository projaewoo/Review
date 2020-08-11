import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���� : ");
		int first = scan.nextInt();
		System.out.println("�ι�° ���� (0�� ����) : ");
		int second = scan.nextInt();
		try {
			System.out.println(first / second);
		}catch(NullPointerException ex) {		//���� null�� �������� ȣ���Ҷ��� exception�� ����
			System.out.println("������Ʈ");
		}catch(ArrayIndexOutOfBoundsException ex) {		//�迭�� ���� �ʰ��Ҷ��� exception�� ����
			System.out.println("�迭���� �ʰ�");
		}catch(ClassCastException ex) {		//Ŭ���� ����ȯ �߸����� ���� exception�� ����
			System.out.println("Ŭ���� ����ȯ ����");
		}catch(ArithmeticException ex) {		//������ 0���� ���� ���� exception�� ����
			System.out.println("������ ����");
		}catch(RuntimeException ex) {		//Runtime�� �߻��ϴ� ��� excetpion�� ���� (Rumtime�� �߻��ϴ� ��� exception�� �θ�Ŭ����) 
			System.out.println("��Ÿ�� ���� (�θ� Ŭ����)");
		}
	}
}
class Student1 {
	String name = "Sally";
}