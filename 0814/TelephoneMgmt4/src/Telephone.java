public class Telephone implements Comparable<Telephone>{			//�θ� �������̽��� �޼ҵ� ������ �ʼ�!
	private int kind, quantity, sum, tax, fee, gibon;
	private String tel, name;
	
	public Telephone(int kind, String tel, String name, int quantity) {
		this.kind = kind;
		this.tel = tel;
		this.name = name;
		this.quantity = quantity;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getGibon() {
		return gibon;
	}

	public void setGibon(int gibon) {
		this.gibon = gibon;
	}

	public void print() {
		//����     ��ȭ��ȣ             �̸�             �⺻���                 ��ȭ��            ����            �հ�
		System.out.printf("%d\t%s\t%s\t%,d\t\t%,d\t\t%,d\t\t%,d%n",
			this.kind, this.tel, this.name, this.gibon, this.sum, this.tax, this.fee);	
	}

	

//	Comparable�������̽� �����Ҷ��� sort -> compareTo()
	@Override
	public int compareTo(Telephone other) {		//�⺻ ���� ������ �����Ϸ��� �� ��
		if(this.fee > other.fee) return 1;		//��������
		else if(this.fee < other.fee)	return -1;
		else return 0;
	}
	
}
