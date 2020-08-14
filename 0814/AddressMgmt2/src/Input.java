import java.util.Scanner;
import java.util.Vector;

class Input {				//외부에서 호출할 일 없으므로 클래스, 메소드 : package접근지정자.
	private Vector<Friend> vector;
	private Scanner scan;

	Input(Vector<Friend> vector) {		//Main의 vector가 Input생성자의 parameter로 들어옴.
		this.vector = vector;							//Main의 vector가 주소복사에 의해 넘어옴.
		this.scan = new Scanner(System.in);
	}

	 void input() {
		System.out.println("<<친구 추가 창>>");
		System.out.print("이름 : ");			String name = this.scan.next();
		System.out.print("전화번호 : ");		String tel = this.scan.next();
		System.out.print("관계 : ");			String relation = this.scan.next();
		Friend f = new Friend(name, tel, relation);
		this.vector.addElement(f);		//만든 친구를 vector에 추가
	}		//끝나면 Main클래스의 38행으로 감.
	
	
}
