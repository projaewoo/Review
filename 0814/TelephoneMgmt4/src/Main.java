import java.util.Vector;

public class Main {
	public static void main(String[] args) {
//		Telephone [] array = new Telephone[3];		//��ü�迭  (Telephone�� �ּҸ� ���� ���� ��ø)
		
		
		//ArrayList���
		Vector<Telephone> vector = new Vector<Telephone>(10);	//�� 10��
		
		
		Input input = new Input(vector);	//Vector����.
		input.input();
		
		Calc clac = new Calc(vector);
		clac.calc();
		
		Sort sort = new Sort(vector);
		sort.sort();
		
		Output output = new Output(vector);
		output.output();
	}
}
