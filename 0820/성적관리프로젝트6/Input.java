import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Input {							//static메소드 = 클래스 이름으로 접근
	private ArrayList<Student> list;
	private String data;
	
	Input(ArrayList<Student> list) {
		this.list = list;				//member variable, local variable
		this.data = this.init();		//파일의 내용을 긁어서 문자열 data에 넣음.
	}												//다른 메소드에서도 사용할 수 있게끔 미리 정의
	
	void input() {
		StringTokenizer st = new StringTokenizer(this.data, "\n");		//data를 \n기준으로 자름
		int count = st.countTokens();		//12개
		while(st.hasMoreTokens()) {
			String line = st.nextToken().trim();		//1101  한송이   78   87   83   78	//string은 항상 trim()하는게 좋음.
			Scanner scan = new Scanner(line).useDelimiter("\\s+");		//한칸 이상의 스페이스바.
			Student s = new Student(scan.next(), scan.next(), 	//1101, 한송이 : String으로 받음
					scan.nextInt(),scan.nextInt(), scan.nextInt(), scan.nextInt());		//78  87  83  78을 int로 받음
			this.list.add(s);
		}
	}
	
	private String init() {		//초기화하는 메소드
		String data = null;
		String path = "./sungjuk.dat";
		try (FileInputStream fis = new FileInputStream(path)) {		//파일 안의 영어만 바이트 기반으로 처리가능한 FileInputStream 
			byte [] buffer = new byte[1024];		//한글처리 위해 byte배열 생성
			int count = fis.read(buffer);		//
			data = new String(buffer, 0, count);		//파일 다 읽어서 data에 넘김.
		}catch(FileNotFoundException ex) {
			System.out.println("File not found");
		}catch(IOException ex) {			
			System.out.println(ex);
		}catch(Exception ex) {				//24행, 26행에서 못잡으면 부모exception인 28행이 잡음.
			System.out.println(ex);
		}
		return data;
	}
}
