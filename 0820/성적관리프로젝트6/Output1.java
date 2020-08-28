import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

//RandomAccessFile로 출력

class Output1 {
	private ArrayList<Student> list;
	private RandomAccessFile raf;

	Output1(ArrayList<Student> list) {		//member변수 초기화
		this.list = list;
		String path = "./result1.dat";
		try {
			this.raf = new RandomAccessFile(path, "rw");	//"rw" : 읽고 쓰기 모드 -> Exception발생
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}		
	}
	
	private void printLabel() throws IOException {		//static메소드끼리 연결 가능
		this.raf.write("             <<쌍용 고등학교 성적관리 프로그램>>\n".getBytes("KSC5601"));		//다른 프로젝트에서 땡겨온 파일의 메소드 사용
		this.raf.write("학번\t\t이름\t국어\t영어\t수학\t전산\t총점\t평균\t평점\n".getBytes("KSC5601"));
		this.raf.write("----------------------------------------------------------\n".getBytes("KSC5601"));
	}		
	
	void output() {		
		try {
			printLabel();		//22행에서 던진 Exception이 이쪽으로 옴	//따라서 여기서 Exception처리.
			for(Student s : this.list) this.raf.write(s.toString().getBytes("KSC5601"));	//string을 byte기준으로 바꿀 때, KSC5601로.
		}catch(IOException ex) {
			System.out.println(ex);
		}
		System.out.println("Save Success");
	}
}
