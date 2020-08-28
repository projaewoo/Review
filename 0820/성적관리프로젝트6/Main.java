import java.util.ArrayList;

//Collection사용
//sungjuk.dat (파일 입력) -> Memory -> result.dat (PrintStream으로)(파일 출력) 또는 result1.dat (RandomAccessFile로) (파일 출력)
public class Main {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>(12);	//초기 사이즈 :12명
		Input input = new Input(list);
		input.input();
		
		Calc calc = new Calc(list);
		calc.calc();
		
		Sorting sorting = new Sorting(list);
		sorting.sort();
		
		//PrintStream로 출력하는 Output.
//		Output output = new Output(list);
//		output.output();
		
		//RandomAccessFile로 출력하는 Output
		Output1 output = new Output1(list);
		output.output();
	}
}
