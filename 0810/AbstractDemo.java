

public class AbstractDemo {
	public static void main(String[] args) {
		//Mammal m = new Mammal();		//�߻�Ŭ������ �Ұ�. //��ü�� ���
//		Mammal m;  		//���� : �θ���
//		m = new Lion();	//���� : �ڽ���
//		Mammal m1 = new Tiger();	//���� : �ڽ���
		//Mammal m = new Mammal();		//�߻�Ŭ������ �Ұ�.		//�ڽĿ� ���� ���������� �����Ǿ����.
		
//		Mammal lion = new Lion();		//�������� ����ȭ.		//������ x => Mammal������.
//		//m = lion;			//������
//		System.out.println(lion.name);		//��� : �ڽ��ּҷ� �θ��� �ڿ��� ���
		
//		Lion lion = new Lion("Sally");
//		lion.print();
		
		Mammal m = new Lion("Sally");
		m.print(); 		//�θ��ּҷ� �ڽ��� �޼ҵ� ���� : ������
	}
}
