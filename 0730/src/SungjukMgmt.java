
public class SungjukMgmt {
	public static void main(String[] args) {
		Student chulsu = new Student();
		input(chulsu);		//ö���� �ּ� //call by Reference
		output(chulsu);		//ö���� �ּ� //�޼ҵ忡 �ּҸ� �����ؼ� �Ѱ���
	}
	static void input(Student younghee) {		//���� ö���� ����Ŵ //������ �ּҸ� ö���� �ּҷ� �ٲ�
		younghee.name = "�̿���";
		younghee.hakbun = "2020-001";
	}
	static void output(Student jimin) {
		System.out.println("name = " + jimin.name);
		System.out.println("hakbun = " + jimin.hakbun);
	}
	//heap���� 3���� Student�� ���� �ּҸ� ����Ű�� ����
}
