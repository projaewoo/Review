import java.util.Vector;

public class Output {
	private Vector<Telephone> vector;
	
	public Output(Vector<Telephone> vector) {		//main���� input(), calc(), sort()�� vector�޾Ƽ� -> ������ ���� 4���� member���� vector�� main���� �Ѱܹ��� vector ����.    
		this.vector = vector;			//�ּҺ���	//this.vector�� main���� input(), calc(), sort()�� vector�� ����Ű�� ��.	
	}
	
	public void output() {
		for(Telephone phone : this.vector) {			//this.vector�� main���� input(), calc(), sort()�� vector�� �ּ� �����ϰ� ����.		//�� �ּҸ� ���ʴ��  phone�� ����.
			phone.print();								
		}
	}
}
