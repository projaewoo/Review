
public class ObjectConversion1 {
	public static void main(String[] args) {
//		Bumo bumo;		//����
//		bumo = new Bumo("������");
//		bumo.print();
//		System.out.println(bumo);
//		
//		Jasik jasik = new Jasik("������", 24);
//		jasik.print();
//		System.out.println(jasik);
		
		//������
		//������ : �θ���, ������ : �ڽ���
		Bumo bumo1 = new Bumo("������");
		bumo1.print();
		
		Bumo bumo = new Jasik("������", 28);	//�ڽ� -> �θ� ����ȯ
		bumo.print();
//		bumo.display();		//������ : �θ� �ڽ��� �����ǵ� �޼ҵ常 ��� ����
	}
}
