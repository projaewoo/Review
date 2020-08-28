import java.util.ArrayList;

//Collection���
//sungjuk.dat (���� �Է�) -> Memory -> result.dat (PrintStream����)(���� ���) �Ǵ� result1.dat (RandomAccessFile��) (���� ���)
public class Main {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>(12);	//�ʱ� ������ :12��
		Input input = new Input(list);
		input.input();
		
		Calc calc = new Calc(list);
		calc.calc();
		
		Sorting sorting = new Sorting(list);
		sorting.sort();
		
		//PrintStream�� ����ϴ� Output.
//		Output output = new Output(list);
//		output.output();
		
		//RandomAccessFile�� ����ϴ� Output
		Output1 output = new Output1(list);
		output.output();
	}
}
