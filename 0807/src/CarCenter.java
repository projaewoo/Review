
public class CarCenter {
	public static void main(String[] args) {
		
		CarCenter cc = new CarCenter();
		Sonata sonata = new Sonata("Siver Sonata");
		cc.repair(sonata);
		Carnival carnival = new Carnival("White Carnival");
		cc.repair(carnival);
		Matiz matiz = new Matiz("Red Matiz");
		cc.repair(matiz);
	}								//Car car�� �������ν� Car�� �ڽ��� �������� �� ���� �� ����
	void repair(Car car) {			//������ (Polymorphic Parameter)  //Member�޼ҵ�  //�ּ� �ʿ�
		//System.out.println(car + "��(��) �� �����ƽ��ϴ�.");
		if(car instanceof Matiz) System.out.println("��Ƽ�� ���� �Ϸ�");			//����Ҷ�, �� �ڽĿ��� �°� ���
		else if(car instanceof Sonata) System.out.println("�ҳ�Ÿ ���� �Ϸ�");
		else if(car instanceof Carnival) System.out.println("ī�Ϲ� ���� �Ϸ�");
	}
	//Overload : �޼ҵ� �̸� ����, parameter�ٸ�
//	void repair(Carnival carnival) {			//Member�޼ҵ�  //�ּ� �ʿ�
//		System.out.println(carnival + "��(��) �� �����ƽ��ϴ�.");
//	}
	
}
