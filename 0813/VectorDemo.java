import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
//		Vector <String> vector = new Vector<String>(1,1);		//�ʱ� ���� : 1��, �߰� ���� : 1��		//1���� �߰��ؼ� ����		//�޸� ����.
//		Scanner scan = new Scanner(System.in);
//		String y_n = null;
//		do {
//			System.out.print("Enter a string : ");
//			String line = scan.nextLine();
//			vector.add(line);				//���� ���ڿ��� vector�� �߰�.		//�������� �Ҷ� �� ������ 6�࿡ ���� 1���� �� �߰�.
//			System.out.print("Again(y/n) ? : ");
//			y_n = scan.nextLine();				//11��� ���� next() �Ǵ� nextLine()���� ����� ���â�� ���� ��������� ����.
//		}while(y_n.toUpperCase().equals("Y"));		//�Է¹��� ���� �빮�ڷ� ����, "Y"�� ��
//		System.out.println("�Է¹��� ������ ���� : " + vector.size());		//���� ���� = �Է¹��� ������ ����
		
		
		//�迭 ��� Vector ����ϴ� ���
		Vector<Car> vector = new Vector<Car> (1,1);	//�Ѱ��� ����
		vector.add(new Car("Red Sonata", 25_000_000));	
		vector.add(new Car("Blue Carnival", 28_000_000));	//�� 1�����µ� 1�� �߰��ؼ� Carnival�Է�
		vector.add(new Car("Black Matiz", 10_000_000));
		//��������
		for(int i = 0 ; i < vector.size() -1; i++) {		//���� : size()
			for(int j = 0 ; j < vector.size() -1 ; j++) {
				if(vector.get(j).getPrice() < vector.get(j+1).getPrice()) {		//��������
					//swapping
					Car temp = vector.elementAt(j);
					//���� �迭���� array[j] = array[j+1]; -> vector�� ��ȯ�ϸ�
					vector.setElementAt(vector.elementAt(j+1), j);		//j+1��° �ڵ����� j��°�� ��ġ		
					//���� �迭���� array[j+1] = temp;
					vector.setElementAt(temp, j+1);				//temp�� ���� j+1��°�� ��ġ.
				}
			}

		}
		//���
		for(Car c : vector) System.out.println(c);
	}
}
