
public class EncapDemo {
	public static void main(String[] args) {
		Car1 sonata = new Car1();
		//sonata.name = "�ҳ�Ÿ";  //private�������� �ٸ� Ŭ�������� ���� �Ұ�
		sonata.setName("�ҳ�Ÿ");
		//String name = sonata.name;	//private�������� �ٸ� Ŭ�������� ���� �Ұ�
		String name = sonata.getName();	//public �޼ҵ�� private���� ����
	}
}
