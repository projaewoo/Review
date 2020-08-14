import java.util.Scanner;
import java.util.Vector;

class Delete {		//외부에서 접근 못하게 package접근지정자
	private Vector<Friend> vector;
	private Scanner scanner;

	Delete(Vector<Friend> vector) {		//외부에서 접근 못하게 package접근지정자
		this.vector = vector;
		this.scanner = new Scanner(System.in);
	}

	void delete() {				//외부에서 접근 못하게 package접근지정자
		System.out.print("삭제할 친구 이름 : ");		String name = this.scanner.next().trim();
		int i = 0;
		for(i = 0 ; i < this.vector.size(); i++) {
			Friend f = this.vector.elementAt(i);		//vector에 저장된 i번째 요소를 f에 대입.
			if(f.getName().trim().equals(name)) {				//f의 이름을 trim해서 입력받은 name과 같다면 //찾았다면 	//검색할 이름도 trim()
				break;
			}
		}
		if(i < this.vector.size()) {
			this.vector.removeElementAt(i);			//삭제할 친구를 찾았다면
			System.out.println("삭제 성공");
		}
		else if(i == this.vector.size())	System.out.println("Not Found");	//삭제할 친구를 못찾았다면
	}
	
	
}
