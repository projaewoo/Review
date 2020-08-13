import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
//		Vector <String> vector = new Vector<String>(1,1);		//초기 생성 : 1개, 추가 생성 : 1개		//1개씩 추가해서 생성		//메모리 절약.
//		Scanner scan = new Scanner(System.in);
//		String y_n = null;
//		do {
//			System.out.print("Enter a string : ");
//			String line = scan.nextLine();
//			vector.add(line);				//받은 문자열을 vector에 추가.		//넣으려고 할때 방 없으면 6행에 의해 1개의 방 추가.
//			System.out.print("Again(y/n) ? : ");
//			y_n = scan.nextLine();				//11행과 같이 next() 또는 nextLine()으로 해줘야 출력창에 엔터 따라들어오지 않음.
//		}while(y_n.toUpperCase().equals("Y"));		//입력받은 값을 대문자로 변경, "Y"와 비교
//		System.out.println("입력받은 문장의 갯수 : " + vector.size());		//방의 개수 = 입력받은 문장의 갯수
		
		
		//배열 대신 Vector 사용하는 방법
		Vector<Car> vector = new Vector<Car> (1,1);	//한개씩 증가
		vector.add(new Car("Red Sonata", 25_000_000));	
		vector.add(new Car("Blue Carnival", 28_000_000));	//방 1개였는데 1개 추가해서 Carnival입력
		vector.add(new Car("Black Matiz", 10_000_000));
		//버블정렬
		for(int i = 0 ; i < vector.size() -1; i++) {		//갯수 : size()
			for(int j = 0 ; j < vector.size() -1 ; j++) {
				if(vector.get(j).getPrice() < vector.get(j+1).getPrice()) {		//내림차순
					//swapping
					Car temp = vector.elementAt(j);
					//원래 배열에서 array[j] = array[j+1]; -> vector로 변환하면
					vector.setElementAt(vector.elementAt(j+1), j);		//j+1번째 자동차를 j번째에 배치		
					//원래 배열에서 array[j+1] = temp;
					vector.setElementAt(temp, j+1);				//temp의 값을 j+1번째에 배치.
				}
			}

		}
		//출력
		for(Car c : vector) System.out.println(c);
	}
}
