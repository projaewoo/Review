
public class InterfaceDemo1 {
	public static void main(String[] args) {
		//Datable d = new Datable();		//�������̽� : �߻�Ŭ������ ����  //���� new���Ұ�
		Datable d = new Date();			//������
		d.set(Datable.FRI);
		System.out.println(d.get());
	}
}
