import java.util.Vector;

class Output {				//외부에서 접근 못하게 package접근지정자
	private Vector<Friend> vector;

	Output(Vector<Friend> vector) {
		this.vector = vector;
	}
	
	void output() {
		for(Friend f : this.vector) System.out.println(f);		//f.toString();
	}
	
}
