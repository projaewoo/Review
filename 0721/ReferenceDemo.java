/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
/*
	Class
	Object
	Instance
*/
public class ReferenceDemo {
	public static void main(String[] args) {
		Car sonata;		//����	//Car�� class�ϱ� refernce��
		int age;
		
		age = 24;			//�Ҵ�
		sonata = new Car();					//����
		sonata.name = "�ҳ�Ÿ";				//�Ҵ�
		sonata.price = 25_000_000;
		sonata.maker = "�����ڵ���";

		Car carnival = new Car();  //����
		carnival.name = "ī�Ϲ�";   //�Ҵ�
		carnival.price = 35_000_000;
		carnival.maker = "����ڵ���";

		System.out.printf("�̸� = %s, ���� = %d, ������ = %s\n",
									sonata.name,	sonata.price,		sonata.maker);
		System.out.printf("�̸� = %s, ���� = %d, ������ = %s\n",
									carnival.name,	carnival.price,		carnival.maker);
	}
}
class Car {
	String name;
	int price;
	String maker;

}