
public class ThisDemo {
	public static void main(String[] args) {
		Product ballpen = new Product();
		ballpen.name = "�𳪹�";
		ballpen.price = 200;
		Product pencil = new Product();
//		ballpen.copy(pencil);		//ballpen�� �̸�, ������ pencil�� �� ����
//		System.out.println(pencil.name);
//		System.out.println(pencil.price);
//		ballpen.price = 500;
//		System.out.println(pencil.price);	//�� ���翩�� ���� �ٲ��� ���纻 �ȹٲ�
		System.out.println("������ �ּ� = " + ballpen);
		pencil = ballpen.copy1();	//�ּҺ���
		System.out.println("������ �ּ� = " + pencil);
		//ballpen�� pencil�� ���� �� ����Ŵ
		System.out.println(pencil.name);
		System.out.println(pencil.price);
		ballpen.price = 500;
		System.out.println(pencil.price);
	}
}
