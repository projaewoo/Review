/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ArrayDemo7 {
	public static void main(String[] args) {
		//int [] array = null;    //����
		Car [] array = null;   //���� //�ּҿ��� null
		array = new Car[2];   //����

		array[0] = new Car();
		array[0].name = "Sonata";
		array[0].maker = "Hyundai";
		array[0].price = 25_000_000;

		array[1] = new Car();	//Car����, Car������� ����
		array[1].name = "Carnival";
		array[1].maker = "KIA";
		array[1].price = 30_000_000;

		for(int i = 0; i < array.length; i++) {
			System.out.printf("%s, %s, %d\n",
						array[i].name, array[i].maker, array[i].price);
		}

	}
}
