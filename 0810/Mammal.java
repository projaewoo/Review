
public abstract class Mammal {		//�߻�Ŭ����		//7�࿡ �߻�޼ҵ� �־ �߻�Ŭ���� ��.
	public String name;
	public Mammal(String name) {
		this.name = name;
	}
	public abstract void print();		//�߻� �޼ҵ� ����.
}

class Lion extends Mammal {		//�Ϲ� Ŭ����
	public Lion(String name) {
		super(name);
	}
	@Override
	public void print() {
		System.out.println("���� �ڽ��� �޼ҵ�");
	}
}
