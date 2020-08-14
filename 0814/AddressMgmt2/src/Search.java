import java.util.Scanner;
import java.util.Vector;

class Search {			//외부에서 접근 못하게 package접근지정자
	private Vector<Friend> vector;
	private Scanner scanner;

	Search(Vector<Friend> vector) {
		this.vector = vector;
		this.scanner = new Scanner(System.in);
	}

	void linearSearch() {
		System.out.print("검색할 이름 : ");		String name = this.scanner.next().trim();		//문자열 비교 : trim() : 입력받을 때, 앞뒤 짤라서 정확도 높임
		int i;
		for(i = 0 ; i < this.vector.size(); i++) {
			Friend f = this.vector.elementAt(i);		//vector에 저장된 i번째 요소를 f에 대입.
			if(f.getName().trim().equals(name)) {				//f의 이름을 trim해서 입력받은 name과 같다면 //찾았다면 	//검색할 이름도 trim()
				break;
			}
		}
		if(i == this.vector.size()) System.out.println("Not Found");		//i가 이름을 못찾고 끝까지 갔다면
		else System.out.println(this.vector.elementAt(i));		//i.toString();
		
	}
}
