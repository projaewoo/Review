import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

//File로 내보내기.
class Output {
	private ArrayList<Student> list;
	private PrintStream ps;		//STream : byte기반.
	
	Output(ArrayList<Student> list) {		//member변수 초기화
		this.list = list;
		String path = "./result.dat";
		
		try {
			this.ps = new PrintStream(				//printstream : File출력으로 됨 //FileOutputStream으로 선언해서
				new BufferedOutputStream(				//이왕이면 Buffered사용하는게 좋음.
						new FileOutputStream(path)), true);	//PrintStream의 터널 : 메모리 -> HDD (PrintStream이 FileOutputStream으로 구현되서)	//Fileoutputstream생성자 : Exception던짐.		//true : OutputStream내놓자마자 자동으로 autoFlush
		}catch(IOException ex) {										//System.out.pirntln()의 터널 : 메모리 -> 모니터.		
			System.out.println(ex);
		}
		
	}
						//private -> main에서 호출 불가 //Output에서만 이 메서드 사용하게끔
	private void printLabel() {		//static메소드끼리 연결 가능
		this.ps.println("             <<쌍용 고등학교 성적관리 프로그램>>");		//터널 : 메모리 -> HDD 
		this.ps.println("학번\t\t이름\t국어\t영어\t수학\t전산\t총점\t평균\t평점");
		this.ps.println("----------------------------------------------------------");
	}				//public --> main에서 호출 가능
	
	void output() {	//출력할 학생	//주소복사 //이미 입력과 계산이 끝난 학생		//main에서 접근해야해서 package접근지정자.
		printLabel();
		for(Student s : this.list) //s.print();		//강화된 for문 : 배열, Collection에서 사용
			this.ps.println(s);
		
		//파일 닫기
		System.out.println("Save Success");
		this.ps.close();
	}
}
