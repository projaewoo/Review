
public class InterfaceDemo2 implements Father, Mother{
	@Override
	public void father() {System.out.println("Called by Father");}
	public void mother() {System.out.println("Called by Mother");}
	public void grandFather() {System.out.println("Called by GrandFather");}
	public void grandMother() {System.out.println("Called by GrandMother");}
	
	public static void main(String[] args) {
		GrandFather gf = new InterfaceDemo2();
		gf.grandFather();		//������ //���� : �Ҿƹ���, ���� : ����	//�Ҿƹ��� �ּҷ� �Ҿƹ��� �޼ҵ常 ���ٰ���
		//gf.grandMother();		//ERROR	//�����ǵ��� ���� �޼ҵ�� ���X
		
		//GrandMother gm = new GrandMother(); 	//ERROR 	//interface����
		InterfaceDemo2 id = new InterfaceDemo2();
		GrandMother gm = id;				//interface����
		gm.grandMother();
		
		Father fa = new InterfaceDemo2();
		fa.grandMother();
		fa.grandFather();		//Interface�� �ּҴ� ������ �߻�޼ҵ带 �������� �޼ҵ常 ���ٰ���.		
		fa.father();				//��ӹ��� interface�� �ּ� : ����� interface�� �޼ҵ嵵 ���ٰ���.
		
		System.out.println(Father.PI);		//public static final������� �浹X
		System.out.println(Mother.PI);
		
		Mother [] array = new Mother[2];		//interface�� Mother�� �ڽ��� ���� �� �ִ� �迭
		array[0] = id;										//���� : �θ���, ���� : �ڽ���
		array[1] = new InterfaceDemo2();		//���� : �θ���, ���� : �ڽ���
		for(Mother m : array) {			//���� : �θ���, ���� : �ڽ���
			m.mother();
		}
		
	}
}
