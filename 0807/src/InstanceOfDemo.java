
public class InstanceOfDemo {
	public static void main(String[] args) {
		Mammal m = new Mammal();			//�θ���
		Korean ko = new Korean();				//�ڽ���
		//"�ѱ����� �������̴�."			//Korean extends(is a) Mammal.
		//m = (Mammal)ko;		//�ڽ��� �θ������� ��ȯ�ϴ� ���� ������ ����	//is a ���� = extends
		//"�������� �ѱ����̴�."			
		//ko = m;				//�θ� -> �ڽ� ����ȯ x
		//ko = (Korean)m;		//�θ� -> �ڽ� ���� ����ȯ : 7�� ������ ������ ���� x
										//�� -> ������ -> �� : ������ ���� X
										//    7��          10��
										//�� -> ������ -> ����� : �Ұ���
		Object obj = new Object();	//�θ�
		String str = new String();   //�ڽ�
		//str = (String)obj;			//�ڽ� -> �θ� ���� ���� �θ� -> �ڽĸ��� ������ ������ ����
		
		obj = str;							//�ڽ� -> �θ�
//		str = (String)obj;							//�θ� -> �ڽ�    : 18���� ������ �־ ������ ����
		if(obj instanceof String)		//obj�� String���� ����ȯ ����?
			System.out.println("����ȯ ����");
		else System.out.println("����ȯ �Ұ���");
	}
}
