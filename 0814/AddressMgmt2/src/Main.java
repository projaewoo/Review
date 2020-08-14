import java.util.Scanner;
import java.util.Vector;

public class Main {		//Main : 외부에서 접근가능해야함 -> public지정자로
	private Scanner scan;		//Member variable
	private Vector<Friend> vector;
	
	Main() {		//생성자 : Member variable 초기화		//생성자 : 외부에서 호출 X = package접근지정자
		this.scan = new Scanner(System.in);		//생성자 호출될 때만 Scanner생성됨.
		this.vector = new Vector<Friend>(1, 1);	//생성자 호출될 때만 Vector생성	///초기 방 : 1개, 방 부족할때 1개씩 추가됨.
	}

	public static void main(String[] args) {		
		//Menu보여주고, 처리.
		Main m = new Main();			//생성자에 의해 Scanner생성.
		do {
			int choice = m.showMenu();
			if(choice == 9) break;
			m.process(choice);
		}while(true);
	}
	
	private int showMenu() {		//외부에서는 showMenu()안보여도 되서 private
		System.out.println("1. 추가          2. 검색          3. 목록보기         4. 삭제           9. 종료");
		System.out.print(">> : ");
		return this.scan.nextInt();
	}
	private void process(int choice) {
		switch(choice) {
			case 1: gotoInput();		break;
			case 2 : gotoSearch();	break;
			case 3 : gotoPrint();		break;
			case 4 : gotoDelete();	break;
			default : return;		//process()끝내라는 뜻
		}
	}
	private void gotoDelete() {
		if(this.vector.size() == 0) {
			System.out.println("현재 삭제할 데이터가 없습니다.");
			return;			
		}
		Delete delete = new Delete(this.vector);
		delete.delete();
	}
	private void gotoSearch() {
		if(this.vector.size() == 0) {
			System.out.println("현재 검색할 데이터가 없습니다.");
			return;			
		}
		Search search = new Search(this.vector);
		search.linearSearch();		//선형검색 : 순차적으로 검색 (앞에서 끝까지 검색)
	}
	private void gotoPrint() {
		if(this.vector.size() == 0) {
			System.out.println("현재 출력할 데이터가 없습니다.");
			return;			
		}
		Output output = new Output(this.vector);
		output.output();
	}
	private void gotoInput() {						//Member메소드 -> member변수 접근가능  //메소드 호출되기 전에 생성자가 vector 초기화 해놓음.
		Input input = new Input(this.vector);
		input.input();
	}
	
}
