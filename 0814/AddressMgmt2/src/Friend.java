				
class Friend {		//package ���� ������ : Main�� ������ ��	//���� ��Ű���� ���� ����
	private String name, tel, relation;

	Friend(String name, String tel, String relation) {		//������  : �ܺο��� ȣ�� ���ϰ� package���� �����ڷ�
		this.name = name;
		this.tel = tel;
		this.relation = relation;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", name, tel, relation);
	}

	String getName() {		//�ܺο��� ȣ�� ���ϰ� package���� �����ڷ�
		return name;
	}
	
	
}
