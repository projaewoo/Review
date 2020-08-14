import java.util.Vector;

public class Calc {
	private Vector<Telephone> vector;
	
	public Calc(Vector<Telephone> vector) {
		this.vector = vector;
	}
	
//vector에 10개 채워진 상태
	public void calc() {
		for(int i = 0 ; i < this.vector.size(); i++) {
			Telephone phone = this.vector.elementAt(i);				//i번째 vector꺼내서 phone에 넣음.	//elementAt() : Vector 전용 메소드.
			switch(phone.getKind()) {
				case 1 : phone.setGibon(6000); 	break;
				case 2 : phone.setGibon(4800);	break;
				case 3 : phone.setGibon(3000);	break;
			}
			int sum = phone.getQuantity() * 12;
			phone.setSum(sum);		//통화료
			
			int tax = (int)( (phone.getGibon() + sum) * .1 );
			phone.setTax(tax);			//세금
			
			int fee = phone.getGibon() + tax + sum;		//공과금
			phone.setFee(fee);		//i번째 요소에 fee 세팅
		}
	}
}