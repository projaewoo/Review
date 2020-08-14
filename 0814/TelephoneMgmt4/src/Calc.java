import java.util.Vector;

public class Calc {
	private Vector<Telephone> vector;
	
	public Calc(Vector<Telephone> vector) {
		this.vector = vector;
	}
	
//vector�� 10�� ä���� ����
	public void calc() {
		for(int i = 0 ; i < this.vector.size(); i++) {
			Telephone phone = this.vector.elementAt(i);				//i��° vector������ phone�� ����.	//elementAt() : Vector ���� �޼ҵ�.
			switch(phone.getKind()) {
				case 1 : phone.setGibon(6000); 	break;
				case 2 : phone.setGibon(4800);	break;
				case 3 : phone.setGibon(3000);	break;
			}
			int sum = phone.getQuantity() * 12;
			phone.setSum(sum);		//��ȭ��
			
			int tax = (int)( (phone.getGibon() + sum) * .1 );
			phone.setTax(tax);			//����
			
			int fee = phone.getGibon() + tax + sum;		//������
			phone.setFee(fee);		//i��° ��ҿ� fee ����
		}
	}
}