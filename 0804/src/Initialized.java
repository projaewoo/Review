
public class Initialized {
	private int x; // = 5; --> ����� �ʱ�ȭ		//member�������� �����Ϸ��� �ּ��ʿ�
	private String name; // = "Fred";
	
	public Initialized() {}			//�⺻ ������ (����Ʈ ������)
																		
	public Initialized(int x, String name) {		//������ ���� �ʱ�ȭ  //�⺻�����ڰ� �ƴ� �Ϲ� ������
		this.x = x;   this.name = name;			
	}
	public Initialized(int x) {			//�������� �����ε�  //parameter�޶� ����
		this.x = x;
	}
	public Initialized(String name) {		//�������� �����ε�
		this.name = name;
	}
	
	public static void main(String[] args) {
		Initialized in = new Initialized("������");			//�������� member���� �� �ٲ� �� ����
		System.out.println(in.x);
		System.out.println(in.name);
		
	}
}
