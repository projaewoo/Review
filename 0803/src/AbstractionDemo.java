
public class AbstractionDemo {
	public static void main(String[] args) {
		Car sonata; //����
		sonata = new Car();		//sonata�� �ڵ����� heap�� ����Ǵ� �����ּҸ� ����. �ڵ��� �ּ� ����
		sonata.name = "�ҳ�Ÿ";
		sonata.maker = "�����ڵ���";
		sonata.color = "Silver";
		sonata.price = 25_000_000;
		//sonata �������� ���� field ����
		sonata.print();
		
		Car carnival;		//����
		carnival = new Car();
		carnival.name = "ī�Ϲ�";
		carnival.maker = "����ڵ���";
		carnival.color = "Black";
		carnival.price = 35_000_000;		//carnival�� �Ӽ�
		carnival.print();   //carnival�� ���
		
	}
}
