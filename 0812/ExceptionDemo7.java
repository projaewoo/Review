import java.util.Scanner;

//국어점수 제대로 넣을때까지 입력받음
public class ExceptionDemo7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	int kor;
		do {
			System.out.print("국어점수 : ");
			try {
				kor = scan.nextInt();
				if(check(kor)) break;
				else throw new KoreaException("잘못된 국어점수입니다.\n확인 후 다시 입력해주세요");		//예외 만나면 Korea instace로 던지고 13행이 그 인스턴스 받아서 처리
			}catch(KoreaException ex) {
				System.out.println(ex.getMessage());
			}
		}while(true);
		System.out.println("국어점수 = " + kor);
	}
	//검사 메소드
	static boolean check(int jumsu) {
		if(jumsu < 0 || jumsu > 100) return false;
		else return true;
	}
}
