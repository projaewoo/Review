import java.util.Vector;

public class Output {
	private Vector<Telephone> vector;
	
	public Output(Vector<Telephone> vector) {		//main에서 input(), calc(), sort()된 vector받아서 -> 생성자 통해 4행의 member변수 vector에 main에서 넘겨받은 vector 넣음.    
		this.vector = vector;			//주소복사	//this.vector가 main에서 input(), calc(), sort()된 vector를 가리키게 됨.	
	}
	
	public void output() {
		for(Telephone phone : this.vector) {			//this.vector가 main에서 input(), calc(), sort()된 vector의 주소 저장하고 있음.		//그 주소를 차례대로  phone에 넣음.
			phone.print();								
		}
	}
}
