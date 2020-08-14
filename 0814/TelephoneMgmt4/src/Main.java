import java.util.Vector;

public class Main {
	public static void main(String[] args) {
//		Telephone [] array = new Telephone[3];		//객체배열  (Telephone의 주소를 적기 위한 수첩)
		
		
		//ArrayList사용
		Vector<Telephone> vector = new Vector<Telephone>(10);	//방 10개
		
		
		Input input = new Input(vector);	//Vector받음.
		input.input();
		
		Calc clac = new Calc(vector);
		clac.calc();
		
		Sort sort = new Sort(vector);
		sort.sort();
		
		Output output = new Output(vector);
		output.output();
	}
}
