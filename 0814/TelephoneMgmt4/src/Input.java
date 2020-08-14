import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import java.util.StringTokenizer;


public class Input {				//Input안에 많은 메소드가 Scanner, array배열 필요로 할때, Scanner를 member변수로 설정해서 사용
	private Scanner scan;		//member 변수	//Input클래스 어디서든 사용가능
	private Vector<Telephone> list;
	
	public Input(Vector<Telephone> list) {				//기본 생성자로 변수 초기화
		File file = new File("./data.txt");
		try {
			this.scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			System.exit(-1);	//파일 없으면 강제종료
		}		
		this.list = list;
	}
	
	public void input() {							
//		System.out.println(this.list.capacity());
		for(int i = 0 ; i < this.list.capacity(); i++) {
//			첫번째 줄 데이터 : 2     422-5123   박은지    1084
			String line = this.scan.nextLine();		//2     422-5123   박은지    1084를 line에 넣음
			StringTokenizer st = new StringTokenizer(line);			//한 줄을 화이트 스페이스 기준으로 자름.	//parameter에 delimeter생략 = 화이트 스페이스 기준으로 알아서 짤라줌.
			String [] array = new String[st.countTokens()];	//String 4개의 방 만들어서 array에 대입.
			int idx = 0;
			//대입1
			while(st.hasMoreTokens()) {
				array[idx++] = st.nextToken();		//토큰을 array[idx]에 대입하고, idx++;
			}
			//대입2
			Telephone phone = new Telephone(Integer.parseInt(array[0]),		//"2" -> 2
																	array[1],
																	array[2],
																	Integer.parseInt(array[3]));	//"1084" -> 1084
			//Telephone을 list에 추가하는 방법
//			this.list.add(phone);
			this.list.addElement(phone);
		}
	}
}